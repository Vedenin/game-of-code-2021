package eu.gameofcode.endgame.controllers;

import eu.gameofcode.endgame.dto.EventDto;
import eu.gameofcode.endgame.service.EventService;
import eu.gameofcode.endgame.service.SupermarketService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class SuperMarketController {

    private final SupermarketService eventService;

    public SuperMarketController(SupermarketService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/supermarkets")
    public String getAll(Model model) {
        model.addAttribute("supermarketsDto", eventService.findAll());
        return "supermarkets";
    }
}
