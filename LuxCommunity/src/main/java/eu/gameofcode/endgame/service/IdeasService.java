package eu.gameofcode.endgame.service;

import eu.gameofcode.endgame.dto.EventDto;
import eu.gameofcode.endgame.dto.FilterDto;
import eu.gameofcode.endgame.model.Event;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class IdeasService {

    private List<Event> ideas = new ArrayList<>();


    public List<EventDto> findAll() {
        return ideas.stream().map(event -> fromModel(event)).collect(Collectors.toList());
    }

    public void addNew(EventDto dto) {
        ideas.add(fromDto(dto));
    }

    public List<EventDto> getWithFilter(String keyword, Long to, Long from) {
        List<EventDto> eventDtos = ideas.stream()
                .filter(event -> (event.getName().contains(keyword) || (event.getDescription() != null && event.getDescription().contains(keyword)))
                        && event.getEventTime() < to
                        && event.getEventTime() > from)
                .map(this::fromModel)
                .collect(Collectors.toList());

        return eventDtos;
    }


    public Object getWithFilter(FilterDto filterDto) {
        List<String> categories = new ArrayList<>();
        long from = 0;
        long to = 0;
        try {
            if (filterDto.getFrom() != null && !filterDto.getFrom().isEmpty()) {
                from = new SimpleDateFormat("yyyy-MM-dd hh:mm").parse(filterDto.getFrom().replace("T", " ")).getTime();
            }
            if (filterDto.getTo() != null && !filterDto.getTo().isEmpty()) {
                to = new SimpleDateFormat("yyyy-MM-dd hh:mm").parse(filterDto.getTo().replace("T", " ")).getTime();
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
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

        long finalFrom = from;
        long finalTo = to;

        List<EventDto> eventDtos = ideas.stream()
                .filter(event -> (categories.contains(event.getCategory().toLowerCase(Locale.ROOT)))
                        && ((filterDto.isFree() && filterDto.isPaid()) || (filterDto.isFree() && event.getPrice() <= 0) || (filterDto.isPaid() && event.getPrice() > 0))
                        && (filterDto.getKeyword() == null || event.getName().contains(filterDto.getKeyword()) || event.getDescription().contains(filterDto.getKeyword()))
                        && (finalFrom == 0l || finalFrom <= event.getEventTime())
                        && (finalTo == 0l || finalTo >= event.getEventTime()))
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
        return event;
    }

    @PostConstruct
    public void init() {
        ideas.add(
                new Event(1, "49.8037675", "6.4086667","Barbecue near Echternach lake",
                "Family", "it is wonderful place for kids, adults, families")
        );
        ideas.add(
                new Event(2, "49.9350345", "6.2027224","Visit Vianden Castle",
                        "culture",
                        "Beautiful castle standing on the rock hill. Worth to see it. Also you can find a beautiful view around." +
                                "<ol><li>Audioguide for many languages</li><li>amazing views</li><li>price: Adults: 10 €, Students (13-25 years): 5€, Children (6-12 years): 2,50 € </li></ol> ",
                        10)
        );
        ideas.add(
                new Event(3, "49.6998439", "6.046981","Visit New Castle of Ansembourg and Hollenfels Castle",
                        "culture",
                        "Very nice little castle with amazing garden, but better to visit in " +
                                "car because bus station is quite far. Also near New Castle of Ansembourg (by car) you can find Hollenfels Castle")
        );
    }
}
