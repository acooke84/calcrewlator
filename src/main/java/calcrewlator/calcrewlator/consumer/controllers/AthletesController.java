package calcrewlator.calcrewlator.consumer.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calcrewlator.calcrewlator.persistance.entities.Athlete;
import calcrewlator.calcrewlator.service.ports.AthleteService;
import calcrewlator.calcrewlator.service.response.AthleteWithoutSeatsResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/athletes")
@RequiredArgsConstructor
public class AthletesController {

    private final AthleteService athleteService;

    @GetMapping
    public ResponseEntity<List<AthleteWithoutSeatsResponse>> getAthletes() {
        return new ResponseEntity<>(
            collectAthletesWithoutSeats(athleteService.findAll()), 
            HttpStatus.OK
        );
    }

    @GetMapping("/rowers")
    public ResponseEntity<List<AthleteWithoutSeatsResponse>> getRowers() {
        return new ResponseEntity<>(
            collectAthletesWithoutSeats(athleteService.findRowers()), 
            HttpStatus.OK
        );
    }

    @GetMapping("/coxswains")
    public ResponseEntity<List<AthleteWithoutSeatsResponse>> getCoxswains() {
        return new ResponseEntity<>(
            collectAthletesWithoutSeats(athleteService.findCoxswains()), 
            HttpStatus.OK
        );
    }

    @GetMapping("/{athleteId}")
    public ResponseEntity<AthleteWithoutSeatsResponse> getAthlete(@PathVariable Long athleteId) {
        return new ResponseEntity<>(
            AthleteWithoutSeatsResponse.of(athleteService.findAthleteById(athleteId)),
            HttpStatus.OK
        );
    }

    @GetMapping("/name/{athleteName}")
    public ResponseEntity<List<AthleteWithoutSeatsResponse>> getAthleteByName(@PathVariable String athleteName) {
        return new ResponseEntity<>(
            collectAthletesWithoutSeats(athleteService.findAthletesByName(athleteName)), 
            HttpStatus.OK
        );
    }

    @PostMapping
    public ResponseEntity<Athlete> createAthlete(@RequestBody Athlete athlete) throws URISyntaxException {
        Athlete savedAthlete = athleteService.saveAthlete(athlete);
        return ResponseEntity.created(
            new URI("/athletes/" + savedAthlete.getAthleteId())).body(savedAthlete);
    }

    private List<AthleteWithoutSeatsResponse> collectAthletesWithoutSeats(List<Athlete> athletes) {
        return athletes.stream().map(athlete -> AthleteWithoutSeatsResponse.of(athlete)).collect(Collectors.toList());
    }

}
