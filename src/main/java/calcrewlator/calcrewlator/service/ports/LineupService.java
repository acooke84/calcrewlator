package calcrewlator.calcrewlator.service.ports;

import java.util.List;

import calcrewlator.calcrewlator.persistance.entities.Lineup;

public interface LineupService {

    public Lineup saveLineup(Lineup lineup);

    public Lineup findLineupById(Long lineupId);
    
    public List<Lineup> findAll();

}
