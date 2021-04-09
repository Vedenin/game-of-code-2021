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
        dto.setId(1);
        dto.setLatitude("49.617844812170986");
        dto.setLongitude("6.1404697460290985");
        dto.setName("Art exhibition");
        dto.setDescription("Art exhibition");
        dto.setEventTime(1618999951239l);
        dto.setOnline(false);

        EventDto dto1 = new EventDto();
        dto.setId(2);
        dto1.setLatitude("49.517844812170986");
        dto1.setLongitude("6.2404697460290985");
        dto1.setName("Art exhibition 2");
        dto1.setDescription("Art exhibition 2");
        dto1.setEventTime(1618999951239l);
        dto1.setOnline(false);

        EventDto dto3 = new EventDto();
        dto.setId(3);
        dto3.setLatitude("49.717844812170986");
        dto3.setLongitude("6.0404697460290985");
        dto3.setName("Art exhibition 3");
        dto3.setDescription("Art exhibition 3");
        dto3.setEventTime(1618999951239l);
        dto3.setOnline(false);

        eventDtos.add(dto);
        eventDtos.add(dto1);
        eventDtos.add(dto3);
    }
}
