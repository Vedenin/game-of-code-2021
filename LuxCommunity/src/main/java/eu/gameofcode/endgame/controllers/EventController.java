package eu.gameofcode.endgame.controllers;

import eu.gameofcode.endgame.dto.EventDto;
import eu.gameofcode.endgame.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public String addNew(Model model, EventDto eventDto) {
        eventService.addNew(eventDto);
        model.addAttribute("eventsDto", eventService.findAll());
        return "events";
    }

    @GetMapping("/filter")
    public String getWithFilter(Model model, @RequestParam String keyword, @RequestParam Long to, @RequestParam Long from) {
        model.addAttribute("eventsDto", eventService.getWithFilter(keyword, to, from));
        return "events";
    }
}
