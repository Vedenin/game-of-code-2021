package eu.gameofcode.endgame.repository;

import eu.gameofcode.endgame.model.Stop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StopRepository extends JpaRepository<Stop, String> {
}

