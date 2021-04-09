package eu.gameofcode.endgame.repository;

import eu.gameofcode.endgame.model.StopTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StopTimeRepository extends JpaRepository<StopTime, Integer> {
}

