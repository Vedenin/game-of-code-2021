package eu.gameofcode.endgame.controllers;

import eu.gameofcode.endgame.dto.EventDto;
import eu.gameofcode.endgame.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("eventsDto", eventService.findAll());
        return "events";
    }

    @PostMapping("/events")
    public String addNew(EventDto eventDto) {
        eventService.addNew(eventDto);
        return "events";
    }

    @GetMapping("/filter")
    public String getWithFilter(Model model, @RequestParam String keyword, @RequestParam Long to, @RequestParam Long from) {
        model.addAttribute("eventsDto", eventService.getWithFilter(keyword, to, from));
        return "events";
    }
}
