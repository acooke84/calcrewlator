package calcrewlator.calcrewlator.persistance.repositories.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import calcrewlator.calcrewlator.persistance.entities.Lineup;

public interface LineupJPARepository extends JpaRepository<Lineup, Long> {
    
    // @Query("SELECT l FROM Lineup l " + 
    //        "JOIN SeatAssignment sa " + 
    //        "ON l.lineup_id = sa.lineup_id " +
    //        "JOIN Athlete a " +
    //        "ON sa.athlete_id = a.athlete_id " +
    //        "WHERE a.athlete_id = :athleteId")
    // List<Lineup> findByAthleteId(@Param("athleteId") Long athleteId);

    @Query(value = "SELECT l FROM Lineup l WHERE l.boat.boatId = :boatId")
    List<Lineup> findByBoatId(@Param("boatId") Long boatId);

}
