package calcrewlator.calcrewlator.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.ClassRule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

import calcrewlator.calcrewlator.persistance.entities.Athlete;
import calcrewlator.calcrewlator.persistance.repositories.adapters.AthleteRepositoryImpl;
import calcrewlator.calcrewlator.persistance.repositories.jpa.AthleteJPARepository;
import calcrewlator.calcrewlator.utilities.generators.AthleteGenerator;

@SpringBootTest
public class AthleteRepositoryImplTest {
    
    @Autowired
    AthleteJPARepository athleteJPARepository;

    @Autowired
    AthleteRepositoryImpl athleteRepositoryImpl;

    @BeforeEach
    void setUp() {
        
    }

    @AfterEach
    void tearDown() {
        
    }

    @Test
    void testSaveAthlete() {
        Athlete athlete = AthleteGenerator.generateRowerPort();
        Athlete result = athleteRepositoryImpl.saveAthlete(athlete);
        assertEquals(result.getAthleteName(), athlete.getAthleteName());
        assertEquals(result.getGraduationYear(), athlete.getGraduationYear());
        assertEquals(result.getIsRower(), athlete.getIsRower());
        assertEquals(result.getPrimarySide(), athlete.getPrimarySide());
        assertEquals(result.getSwapsSides(), athlete.getSwapsSides());
        for (int i = 0; i < result.getSeatAssignments().size(); i++) {
            assertEquals(result.getSeatAssignments().get(i).getSeatId(), athlete.getSeatAssignments().get(i).getSeatId());
        }
        athleteJPARepository.delete(athlete);
        assertTrue(!athleteRepositoryImpl.findAthleteById(athlete.getAthleteId()).isPresent());
    }

}
