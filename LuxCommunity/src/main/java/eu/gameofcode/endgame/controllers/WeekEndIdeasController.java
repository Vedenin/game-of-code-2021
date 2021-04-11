package eu.gameofcode.endgame.controllers;

import eu.gameofcode.endgame.dto.EventDto;
import eu.gameofcode.endgame.dto.FilterDto;
import eu.gameofcode.endgame.service.EventService;
import eu.gameofcode.endgame.service.IdeasService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/ideas")
public class WeekEndIdeasController {

    private final IdeasService eventService;

    private FilterDto filter = new FilterDto();

    public WeekEndIdeasController(IdeasService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public String getAll(Model model) {
//        model.addAttribute("eventsDto", eventService.findAll());
        model.addAttribute("filter", filter);
        model.addAttribute("eventsDto", eventService.getWithFilter(filter));
        return "ideas";
    }

    @PostMapping
    public String addNew(Model model, EventDto eventDto) {
        eventService.addNew(eventDto);
        model.addAttribute("filter", filter);
        model.addAttribute("eventsDto", eventService.getWithFilter(filter));
        return "ideas";
    }

    @PostMapping("/filter")
    public String getWithFilter(Model model, FilterDto filterDto) {
        this.filter = filterDto;
        return "redirect:/ideas";
    }
}
