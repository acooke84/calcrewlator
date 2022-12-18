package calcrewlator.calcrewlator.persistance.repositories.adapters;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import calcrewlator.calcrewlator.persistance.entities.Lineup;
import calcrewlator.calcrewlator.persistance.repositories.jpa.LineupJPARepository;
import calcrewlator.calcrewlator.persistance.repositories.ports.LineupRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class LineupRepositoryImpl implements LineupRepository {

    private LineupJPARepository lineupJPARepository;

    @Override
    public Lineup saveLineup(Lineup lineup) {
        return lineupJPARepository.saveAndFlush(lineup);
    }

    @Override
    public Optional<Lineup> findLineupById(Long lineupId) {
        return lineupJPARepository.findById(lineupId);
    }

    @Override
    public List<Lineup> findLineups() {
        return lineupJPARepository.findAll();
    }

    @Override
    public List<Lineup> findLineupsByAthlete(Long athleteId) {
        return List.of();
        //return lineupJPARepository.findByAthleteId(athleteId);
    }

    @Override
    public List<Lineup> findLineupsByBoat(Long boatId) {
        return lineupJPARepository.findByBoatId(boatId);
    }
    
}
