package eu.gameofcode.endgame.repository;

import eu.gameofcode.endgame.model.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, String> {
}

