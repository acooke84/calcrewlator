package calcrewlator.calcrewlator.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calcrewlator.calcrewlator.database.entities.Athlete;
import calcrewlator.calcrewlator.database.repositories.AthleteRepository;

@RestController
@RequestMapping("/athletes")
public class AthletesController {
    
    @Autowired
    AthleteRepository athleteRepository;

    @GetMapping
    public List<Athlete> getAthletes() {
        return athleteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Athlete getAthlete(@PathVariable Integer athleteId) {
        return athleteRepository.findById(athleteId).orElseThrow(RuntimeException::new);
    }

    @PostMapping
    public ResponseEntity<Athlete> createAthlete(@RequestBody Athlete athlete) throws URISyntaxException {
        Athlete savedAthlete = athleteRepository.save(athlete);
        return ResponseEntity.created(
            new URI("/athletes/" + savedAthlete.getAthleteId())).body(savedAthlete);
    }



}
