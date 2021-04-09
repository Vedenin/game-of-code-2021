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
        Event event = new Event();

        event.setLatitude("49.617844812170986");
        event.setLongitude("6.1404697460290985");
        event.setName("Art exhibition");
        event.setDescription("Art exhibition");
        event.setEventTime(1618999951239l);

        event.setOnline(false);

        events.add(event);
    }
}
