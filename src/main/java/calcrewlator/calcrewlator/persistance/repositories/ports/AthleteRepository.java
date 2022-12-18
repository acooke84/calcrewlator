package calcrewlator.calcrewlator.persistance.repositories.ports;

import java.util.List;
import java.util.Optional;

import calcrewlator.calcrewlator.persistance.entities.Athlete;
import calcrewlator.calcrewlator.persistance.types.Side;

public interface AthleteRepository {
    
    Athlete saveAthlete(Athlete athlete);

    Optional<Athlete> findAthleteById(Long athleteId);

    List<Athlete> findAthletesByName(String athleteName);

    List<Athlete> findAthletes();

    List<Athlete> findAthletesByGraduationYear(Integer graduationYear);

    List<Athlete> findRowers();

    List<Athlete> findCoxswains();

    List<Athlete> findAthletesByPrimarySide(Side primarySide);
}
