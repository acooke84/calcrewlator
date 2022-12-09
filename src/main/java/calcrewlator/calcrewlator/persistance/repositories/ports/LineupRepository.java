package calcrewlator.calcrewlator.persistance.repositories.ports;

import java.util.List;
import java.util.Optional;

import calcrewlator.calcrewlator.persistance.entities.Lineup;

public interface LineupRepository {
    
    Lineup saveLineup(Lineup lineup);

    Optional<Lineup> findLineupById(Long lineupId);

    List<Lineup> findLineups();

    List<Lineup> findLineupsByAthlete(Long athleteId);

    List<Lineup> findLineupsByBoat(Long boatId);

}
