package eu.gameofcode.endgame.controllers;

import eu.gameofcode.endgame.dto.StopDto;
import eu.gameofcode.endgame.dto.StopTimeDto;
import eu.gameofcode.endgame.repository.StopRepository;
import eu.gameofcode.endgame.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;


@RestController
public class StopController {

    @Autowired
    private StopRepository stopRepository;
    @Autowired
    private CalendarService calendarService;

    @GetMapping("/stops")
    public List<StopDto> getAll() {
        return stopRepository.findAll()
                .stream()
                .map(StopDto::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/stops/{id}/stopTimes")
    public List<StopTimeDto> getCurrentStopTimes(@PathVariable String id, @RequestParam(defaultValue = "100", required=false) Integer limit) {
        return stopRepository.findById(id).get().getStopTimes().stream()
                .filter(stopTime -> calendarService.isTripValidToday(stopTime.getCalendar()))
                .filter(stopTime -> stopTime.getArrivalTime().isAfter(LocalTime.now()))
                .limit(limit)
                .map(StopTimeDto::new)
                .collect(Collectors.toList());
    }
}
