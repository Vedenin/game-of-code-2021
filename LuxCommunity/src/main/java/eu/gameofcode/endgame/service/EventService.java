package eu.gameofcode.endgame.service;

import eu.gameofcode.endgame.dto.EventDto;
import eu.gameofcode.endgame.dto.FilterDto;
import eu.gameofcode.endgame.model.Event;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
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


    public Object getWithFilter(FilterDto filterDto) {
        List<String> categories = new ArrayList<>();
        if (filterDto.isFamily()) {
            categories.add("family");
        }
        if (filterDto.isSport()) {
            categories.add("sport");
        }
        if (filterDto.isCinema()) {
            categories.add("cinema");
        }
        if (filterDto.isKids()) {
            categories.add("kids");
        }
        if (filterDto.isExhibition()) {
            categories.add("exhibition");
        }
        if (filterDto.isCulture()) {
            categories.add("culture");
        }

        List<EventDto> eventDtos = events.stream()
                .filter(event -> (categories.contains(event.getCategory().toLowerCase(Locale.ROOT)))
                && ((filterDto.isFree() && filterDto.isPaid()) || (filterDto.isFree() && event.getPrice() <= 0) || (filterDto.isPaid() && event.getPrice() > 0))
                && (filterDto.getKeyword() == null || event.getName().contains(filterDto.getKeyword()) || event.getDescription().contains(filterDto.getKeyword())) )
                .map(this::fromModel)
                .collect(Collectors.toList());

        return eventDtos;
    }

    public EventDto fromModel(Event event) {
        EventDto dto = new EventDto();
        dto.setId(event.getId());
        dto.setLatitude(event.getLatitude());
        dto.setLongitude(event.getLongitude());
        dto.setName(event.getName());
        dto.setCategory(event.getCategory());
        dto.setDescription(event.getDescription());
        dto.setOnline(event.isOnline());
        dto.setPrice(event.getPrice());
        Date date = new Date(event.getEventTime());

        dto.setEventTime(new SimpleDateFormat("dd/MM/yyyy hh:mm").format(date));

        return dto;
    }

    public Event fromDto(EventDto dto) {
        Event event = new Event();
        event.setId(dto.getId());
        event.setLatitude(dto.getLatitude());
        event.setLongitude(dto.getLongitude());
        event.setName(dto.getName());
        event.setCategory(dto.getCategory());
        event.setDescription(dto.getDescription());
        event.setOnline(dto.isOnline());
        event.setPrice(dto.getPrice());
        Long ms = 0l;
        try {
            ms = new SimpleDateFormat("yyyy-MM-dd hh:mm").parse(dto.getEventTime().replace("T", " ")).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        event.setEventTime(ms);

        return event;
    }

    @PostConstruct
    public void init() {
        Event dto1 = new Event();
        dto1.setId(1);
        dto1.setLatitude("49.617844812170986");
        dto1.setLongitude("6.1404697460290985");
        dto1.setName("Art exhibition");
        dto1.setCategory("Exhibition");
        dto1.setDescription("Art exhibition");
        dto1.setEventTime(1618999951239l);
        dto1.setOnline(false);
        dto1.setPrice(0);

        Event dto2 = new Event();
        dto2.setId(2);
        dto2.setLatitude("49.517844812170986");
        dto2.setLongitude("6.2404697460290985");
        dto2.setName("Family Dance Class");
        dto2.setCategory("Family");
        dto2.setDescription("Family Dance Class");
        dto2.setEventTime(1618999951239l);
        dto2.setOnline(false);
        dto2.setPrice(1);

        Event dto3 = new Event();
        dto3.setId(3);
        dto3.setLatitude("49.717844812170986");
        dto3.setLongitude("6.0404697460290985");
        dto3.setName("Football match");
        dto3.setCategory("Sport");
        dto3.setDescription("Local teams football match");
        dto3.setEventTime(1618999951239l);
        dto3.setOnline(false);

        events.add(dto1);
        events.add(dto2);
        events.add(dto3);
    }
}
