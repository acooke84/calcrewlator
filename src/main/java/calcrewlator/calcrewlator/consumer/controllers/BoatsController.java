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

import calcrewlator.calcrewlator.persistance.entities.Boat;
import calcrewlator.calcrewlator.persistance.types.BoatType;
import calcrewlator.calcrewlator.service.ports.BoatService;
import calcrewlator.calcrewlator.service.response.BoatResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/boats")
@RequiredArgsConstructor
public class BoatsController {

    private final BoatService boatService;
    
    @GetMapping
    public ResponseEntity<List<BoatResponse>> getBoats() {
        return new ResponseEntity<>(
            collectBoats(boatService.findAll()),
            HttpStatus.OK
        );
    }

    @GetMapping("/{boatId}")
    public ResponseEntity<BoatResponse> getBoat(@PathVariable Long boatId) {
        return new ResponseEntity<>(
            BoatResponse.of(boatService.findBoatById(boatId)),
            HttpStatus.OK
        );
    }

    @GetMapping("/type/{boatType}")
    public ResponseEntity<List<BoatResponse>> getBoatsByType(@PathVariable String boatType) {
        return new ResponseEntity<>(
            collectBoats(boatService.findBoatsByType(BoatType.valueOf(boatType))),
            HttpStatus.OK
        );
    }

    @PostMapping
    public ResponseEntity<Boat> createAthlete(@RequestBody Boat boat) throws URISyntaxException {
        Boat savedBoat = boatService.saveBoat(boat);
        return ResponseEntity.created(
            new URI("/boats/" + savedBoat.getBoatId())).body(savedBoat);
    }

    private List<BoatResponse> collectBoats(List<Boat> boats) {
        return boats.stream().map(boat -> BoatResponse.of(boat)).collect(Collectors.toList());
    }

}
