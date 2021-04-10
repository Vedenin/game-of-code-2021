package eu.gameofcode.endgame.controllers;

import eu.gameofcode.endgame.dto.EventDto;
import eu.gameofcode.endgame.dto.FilterDto;
import eu.gameofcode.endgame.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class EventController {

    private final EventService eventService;

    private FilterDto filter = new FilterDto();

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public String getAll(Model model) {
//        model.addAttribute("eventsDto", eventService.findAll());
        model.addAttribute("filter", filter);
        model.addAttribute("eventsDto", eventService.getWithFilter(filter));
        return "events";
    }

    @PostMapping
    public String addNew(Model model, EventDto eventDto) {
        eventService.addNew(eventDto);
        model.addAttribute("filter", filter);
        model.addAttribute("eventsDto", eventService.findAll());
        return "events";
    }

    @PostMapping("/filter")
    public String getWithFilter(Model model, FilterDto filterDto) {
        this.filter = filterDto;
        return "redirect:/";
    }
}
