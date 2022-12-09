package calcrewlator.calcrewlator.service.adapters;

import java.util.List;

import org.springframework.stereotype.Service;

import calcrewlator.calcrewlator.persistance.entities.Athlete;
import calcrewlator.calcrewlator.persistance.repositories.ports.AthleteRepository;
import calcrewlator.calcrewlator.persistance.types.Side;
import calcrewlator.calcrewlator.service.ports.AthleteService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AthleteServiceImpl implements AthleteService {

    private final AthleteRepository athleteRepository;

    @Override
    public Athlete saveAthlete(Athlete athlete) {
        return athleteRepository.saveAthlete(athlete);
    }

    @Override
    public Athlete findAthleteById(Long athleteId) {
        return athleteRepository.findAthleteById(athleteId).orElseThrow(
            () -> new RuntimeException(String.format("No athlete found with id: %d", athleteId))
        );
    }

    @Override
    public List<Athlete> findAthletesByName(String athleteName) {
        return athleteRepository.findAthletesByName(athleteName);
    }

    @Override
    public List<Athlete> findAll() {
        return athleteRepository.findAthletes();
    }

    @Override
    public List<Athlete> findAthletesByGraduationYear(Integer graduationYear) {
        return athleteRepository.findAthletesByGraduationYear(graduationYear);
    }

    @Override
    public List<Athlete> findRowers() {
        return athleteRepository.findRowers();
    }

    @Override
    public List<Athlete> findCoxswains() {
        return athleteRepository.findCoxswains();
    }

    @Override
    public List<Athlete> findAthletesByPrimarySide(Side primarySide) {
        return athleteRepository.findAthletesByPrimarySide(primarySide);
    }
    
}
