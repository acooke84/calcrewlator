package calcrewlator.calcrewlator.persistance.repositories.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import calcrewlator.calcrewlator.persistance.entities.Boat;
import calcrewlator.calcrewlator.persistance.types.BoatType;

@Repository
public interface BoatJPARepository extends JpaRepository<Boat, Long> {
    
    List<Boat> findByBoatType(BoatType boatType);

    @Query(value = "SELECT b FROM Boat b WHERE b.boatName = :boatName")
    Optional<Boat> findByBoatName(@Param("boatName") String boatName);

}
