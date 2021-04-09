package eu.gameofcode.endgame.controllers;

import eu.gameofcode.endgame.data.HotelData;
import eu.gameofcode.endgame.dto.HotelDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    @GetMapping("/hotels")
    public List<HotelDto> getAllHotels() {
        return HotelData.hotels;
    }
}
