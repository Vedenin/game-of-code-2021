package eu.gameofcode.endgame.controllers;

import eu.gameofcode.endgame.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/events")
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
}
