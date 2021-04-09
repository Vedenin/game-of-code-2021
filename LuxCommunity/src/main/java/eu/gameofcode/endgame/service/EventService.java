package eu.gameofcode.endgame.service;

import eu.gameofcode.endgame.dto.EventDto;
import eu.gameofcode.endgame.model.Event;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventService {

    private List<Event> events = new ArrayList<>();


    public List<EventDto> findAll() {
        return events.stream().map(event -> fromModel(event)).collect(Collectors.toList());
    }

    public void addNew(EventDto dto) {
        events.add(fromDto(dto));
    }

    public List<EventDto> getWithFilter(String keyword, Long to, Long from) {
        List<EventDto> eventDtos = events.stream()
                .filter(event -> (event.getName().contains(keyword) || (event.getDescription() != null && event.getDescription().contains(keyword)))
                        && event.getEventTime() < to
                        && event.getEventTime() > from)
                .map(this::fromModel)
                .collect(Collectors.toList());

        return eventDtos;
    }


    public EventDto fromModel(Event event) {
        EventDto dto = new EventDto();
        dto.setLatitude(event.getLatitude());
        dto.setLongitude(event.getLongitude());
        dto.setName(event.getName());
        dto.setDescription(event.getDescription());

        Date  date = new Date(event.getEventTime());

        dto.setEventTime(new SimpleDateFormat("dd/MM/yyyy hh:mm").format(date));

        return dto;
    }

    public Event fromDto(EventDto dto) {
        Event event = new Event();
        event.setLatitude(dto.getLatitude());
        event.setLongitude(dto.getLongitude());
        event.setName(dto.getName());
        event.setDescription(dto.getDescription());
        Long ms = 0l;
        try {
             ms = new SimpleDateFormat("dd/MM/yyyy hh:mm").parse(dto.getEventTime()).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        event.setEventTime(ms);

        return event;
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
