package eu.gameofcode.endgame.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeatbeatController {
    public final static String HEAT_BEAT_RESPONSE = "I am live!";

    @RequestMapping("/heatbeat")
    public String getHeatBeat() {
        return HEAT_BEAT_RESPONSE;
    }
}
