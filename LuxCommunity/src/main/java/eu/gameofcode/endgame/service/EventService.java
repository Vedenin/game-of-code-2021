package eu.gameofcode.endgame.service;

import eu.gameofcode.endgame.dto.EventDto;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    private List<EventDto> eventDtos = new ArrayList<>();


    public List<EventDto> findAll() {
        return eventDtos;
    }


    @PostConstruct
    public void init() {
        EventDto dto = new EventDto();

        dto.setLatitude("49.617844812170986");
        dto.setLongitude("6.1404697460290985");
        dto.setName("Art exhibition");
        dto.setDescription("Art exhibition");
        dto.setEventTime(1618999951239l);

        dto.setOnline(false);

        eventDtos.add(dto);
    }
}
