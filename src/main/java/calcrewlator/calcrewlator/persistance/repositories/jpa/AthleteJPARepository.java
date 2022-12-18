package calcrewlator.calcrewlator.persistance.repositories.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import calcrewlator.calcrewlator.persistance.entities.Athlete;
import calcrewlator.calcrewlator.persistance.types.Side;

@Repository
public interface AthleteJPARepository extends JpaRepository<Athlete, Long> {

    List<Athlete> findByAthleteName(String athleteName);

    List<Athlete> findByGraduationYear(Integer graduationYear);

    List<Athlete> findByIsRower(Boolean isRower);

    List<Athlete> findByPrimarySide(Side primarySide);

}
