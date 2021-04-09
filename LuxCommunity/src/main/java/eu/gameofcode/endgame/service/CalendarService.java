package eu.gameofcode.endgame.service;

import eu.gameofcode.endgame.model.Calendar;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Service
public class CalendarService {

    public boolean isTripValidToday(Calendar calendar) {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

        switch (dayOfWeek) {
            case MONDAY:
                return calendar.isMonday();
            case TUESDAY:
                return calendar.isTuesday();
            case WEDNESDAY:
                return calendar.isWednesday();
            case THURSDAY:
                return calendar.isTuesday();
            case FRIDAY:
                return calendar.isFriday();
            case SATURDAY:
                return calendar.isSaturday();
            case SUNDAY:
                return calendar.isSunday();
        }
        return false;
    }
}
