package calcrewlator.calcrewlator.persistance.repositories.adapters;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import calcrewlator.calcrewlator.persistance.entities.Athlete;
import calcrewlator.calcrewlator.persistance.repositories.jpa.AthleteJPARepository;
import calcrewlator.calcrewlator.persistance.repositories.ports.AthleteRepository;
import calcrewlator.calcrewlator.persistance.types.Side;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class AthleteRepositoryImpl implements AthleteRepository {

    private final AthleteJPARepository athleteJPARepository;

    @Override
    public Athlete saveAthlete(Athlete athlete) {
        return athleteJPARepository.saveAndFlush(athlete);
    }

    @Override
    public Optional<Athlete> findAthleteById(Long athleteId) {
        return athleteJPARepository.findById(athleteId);
    }

    @Override
    public List<Athlete> findAthletesByName(String athleteName) {
        return athleteJPARepository.findByAthleteName(athleteName);
    }

    @Override
    public List<Athlete> findAthletes() {
        return athleteJPARepository.findAll();
    }

    @Override
    public List<Athlete> findAthletesByGraduationYear(Integer graduationYear) {
        return athleteJPARepository.findByGraduationYear(graduationYear);
    }

    @Override
    public List<Athlete> findRowers() {
        return athleteJPARepository.findByIsRower(true);
    }

    @Override
    public List<Athlete> findCoxswains() {
        return athleteJPARepository.findByIsRower(false);
    }

    @Override
    public List<Athlete> findAthletesByPrimarySide(Side primarySide) {
        return athleteJPARepository.findByPrimarySide(primarySide);
    }
    
}
