package calcrewlator.calcrewlator.consumer.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calcrewlator.calcrewlator.persistance.entities.Lineup;
import calcrewlator.calcrewlator.service.ports.LineupService;
import calcrewlator.calcrewlator.service.responses.LineupResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/lineups")
@RequiredArgsConstructor
public class LineupController {
    
    private final LineupService lineupService;

    @GetMapping
    public ResponseEntity<List<LineupResponse>> getLineups() {
        return new ResponseEntity<>(
            collectLineups(lineupService.findAll()),
            HttpStatus.OK
        );
    }

    @PostMapping
    public ResponseEntity<LineupResponse> createLineup(@RequestBody Lineup lineup) throws URISyntaxException {
        Lineup savedLineup = lineupService.saveLineup(lineup);
        return new ResponseEntity<>(LineupResponse.of(savedLineup), HttpStatus.OK);
    }

    private List<LineupResponse> collectLineups(List<Lineup> lineups) {
        return lineups.stream().map(lineup -> LineupResponse.of(lineup)).collect(Collectors.toList());
    }

}
