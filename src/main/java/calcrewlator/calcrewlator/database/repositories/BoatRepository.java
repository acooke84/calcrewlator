package calcrewlator.calcrewlator.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import calcrewlator.calcrewlator.database.entities.Boat;

@Repository
public interface BoatRepository extends JpaRepository<Boat, Integer> {
    
}
