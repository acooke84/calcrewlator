package calcrewlator.calcrewlator.service.adapters;

import java.util.List;

import org.springframework.stereotype.Service;

import calcrewlator.calcrewlator.persistance.entities.Lineup;
import calcrewlator.calcrewlator.persistance.repositories.ports.LineupRepository;
import calcrewlator.calcrewlator.service.ports.LineupService;
import calcrewlator.calcrewlator.utilities.exceptions.InvalidLineup;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LineupServiceImpl implements LineupService {

    private final LineupRepository lineupRepository;

    @Override
    public Lineup saveLineup(Lineup lineup) {
        validateLineup(lineup);
        return lineupRepository.saveLineup(lineup);
    }

    @Override
    public Lineup findLineupById(Long lineupId) {
        return lineupRepository.findLineupById(lineupId).orElseThrow(
            () -> new RuntimeException(String.format("No lineup found with id: %d", lineupId))
        );
    }

    @Override
    public List<Lineup> findAll() {
        return lineupRepository.findLineups();
    }

    private void validateLineup(Lineup lineup) {
        //TODO: validate lineup
        if (lineup.getBoat().getBoatType().seatCount != lineup.getSeatAssignments().size()) {
            throw new InvalidLineup();
        }
        return;
    }
    
}
