package calcrewlator.calcrewlator.persistance.repositories.ports;

import java.util.List;
import java.util.Optional;

import calcrewlator.calcrewlator.persistance.entities.Boat;
import calcrewlator.calcrewlator.persistance.types.BoatType;

public interface BoatRepository {

    Boat saveBoat(Boat boat);
    
    Optional<Boat> findBoatById(Long boatId);

    Optional<Boat> findBoatByName(String boatName);

    List<Boat> findBoatsByType(BoatType boatType);

    List<Boat> findAll();

}
