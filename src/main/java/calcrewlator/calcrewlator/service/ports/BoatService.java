package calcrewlator.calcrewlator.service.ports;

import java.util.List;

import calcrewlator.calcrewlator.persistance.entities.Boat;
import calcrewlator.calcrewlator.persistance.types.BoatType;

public interface BoatService {
    
    Boat saveBoat(Boat boat);

    Boat findBoatById(Long boatId);

    Boat findBoatByName(String boatName);

    List<Boat> findBoatsByType(BoatType boatType);

    List<Boat> findAll();

}
