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
        EventDto dto1 = new EventDto();
        dto1.setId(1);
        dto1.setLatitude("49.617844812170986");
        dto1.setLongitude("6.1404697460290985");
        dto1.setName("Art exhibition 1");
        dto1.setDescription("Art exhibition 1");
        dto1.setEventTime(1618999951239l);
        dto1.setOnline(false);

        EventDto dto2 = new EventDto();
        dto2.setId(2);
        dto2.setLatitude("49.517844812170986");
        dto2.setLongitude("6.2404697460290985");
        dto2.setName("Art exhibition 2");
        dto2.setDescription("Art exhibition 2");
        dto2.setEventTime(1618999951239l);
        dto2.setOnline(false);

        EventDto dto3 = new EventDto();
        dto3.setId(3);
        dto3.setLatitude("49.717844812170986");
        dto3.setLongitude("6.0404697460290985");
        dto3.setName("Art exhibition 3");
        dto3.setDescription("Art exhibition 3");
        dto3.setEventTime(1618999951239l);
        dto3.setOnline(false);

        eventDtos.add(dto1);
        eventDtos.add(dto2);
        eventDtos.add(dto3);
    }
}
