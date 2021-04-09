package eu.gameofcode.endgame.repository;

import eu.gameofcode.endgame.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, String> {
}

