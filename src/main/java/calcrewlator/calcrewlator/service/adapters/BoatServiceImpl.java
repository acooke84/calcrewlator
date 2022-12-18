package calcrewlator.calcrewlator.service.adapters;

import java.util.List;

import org.springframework.stereotype.Service;

import calcrewlator.calcrewlator.persistance.entities.Boat;
import calcrewlator.calcrewlator.persistance.repositories.ports.BoatRepository;
import calcrewlator.calcrewlator.persistance.types.BoatType;
import calcrewlator.calcrewlator.service.ports.BoatService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoatServiceImpl implements BoatService {

    private final BoatRepository boatRepository;

    @Override
    public Boat saveBoat(Boat boat) {
        return boatRepository.saveBoat(boat);
    }

    @Override
    public Boat findBoatById(Long boatId) {
        return boatRepository.findBoatById(boatId).orElseThrow(
            () -> new RuntimeException(String.format("No boat found with id: %d", boatId))
        );
    }

    @Override
    public Boat findBoatByName(String boatName) {
        return boatRepository.findBoatByName(boatName).orElseThrow(
            () -> new RuntimeException(String.format("No boat found with name: %s", boatName))
        );
    }

    @Override
    public List<Boat> findBoatsByType(BoatType boatType) {
        return boatRepository.findBoatsByType(boatType);
    }

    @Override
    public List<Boat> findAll() {
        return boatRepository.findAll();
    }
    
}
