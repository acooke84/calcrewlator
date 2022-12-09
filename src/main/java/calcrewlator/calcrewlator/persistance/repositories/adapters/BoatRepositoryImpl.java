package calcrewlator.calcrewlator.persistance.repositories.adapters;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import calcrewlator.calcrewlator.persistance.entities.Boat;
import calcrewlator.calcrewlator.persistance.repositories.jpa.BoatJPARepository;
import calcrewlator.calcrewlator.persistance.repositories.ports.BoatRepository;
import calcrewlator.calcrewlator.persistance.types.BoatType;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BoatRepositoryImpl implements BoatRepository {

    private final BoatJPARepository boatJPARepository;

    @Override
    public Boat saveBoat(Boat boat) {
        return boatJPARepository.saveAndFlush(boat);
    }

    @Override
    public Optional<Boat> findBoatById(Long boatId) {
        return boatJPARepository.findById(boatId);
    }

    @Override
    public Optional<Boat> findBoatByName(String boatName) {
        return boatJPARepository.findByBoatName(boatName);
    }

    @Override
    public List<Boat> findBoatsByType(BoatType boatType) {
        return boatJPARepository.findByBoatType(boatType);
    }

    @Override
    public List<Boat> findAll() {
        return boatJPARepository.findAll();
    }
    
}
