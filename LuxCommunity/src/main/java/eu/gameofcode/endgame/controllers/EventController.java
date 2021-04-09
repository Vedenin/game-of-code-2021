package eu.gameofcode.endgame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {

    @GetMapping("/")
    public String getEvents(Model model) {
        //todo: add events to model
        model.addAttribute("events", null);
        return "events";
    }
}
