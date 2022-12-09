package calcrewlator.calcrewlator.service.ports;

import java.util.List;

import calcrewlator.calcrewlator.persistance.entities.Athlete;
import calcrewlator.calcrewlator.persistance.types.Side;

public interface AthleteService {

    Athlete saveAthlete(Athlete athlete);

    Athlete findAthleteById(Long athleteId);

    List<Athlete> findAthletesByName(String athleteName);

    List<Athlete> findAll();

    List<Athlete> findAthletesByGraduationYear(Integer graduationYear);

    List<Athlete> findRowers();

    List<Athlete> findCoxswains();

    List<Athlete> findAthletesByPrimarySide(Side primarySide);

}
