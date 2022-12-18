package calcrewlator.calcrewlator.utilities.generators;

import calcrewlator.calcrewlator.persistance.entities.Athlete;
import calcrewlator.calcrewlator.utilities.TestConstants;

public class AthleteGenerator {

    private static Athlete generateAthlete() {
        Athlete athlete = new Athlete();
        athlete.setAthleteId(TestConstants.TEST_ATHLETE_ID);
        athlete.setAthleteName(TestConstants.TEST_ATHLETE_NAME);
        athlete.setGraduationYear(TestConstants.TEST_ATHLETE_GRADUATION_YEAR);
        athlete.setSwapsSides(TestConstants.TEST_ATHLETE_SWAPS_SIDES);
        athlete.setSeatAssignments(TestConstants.TEST_ATHLETE_SEATS);
        return athlete;
    }
    
    public static Athlete generateRowerPort() {
        Athlete athlete = generateAthlete();
        athlete.setPrimarySide(TestConstants.TEST_ATHLETE_PORT);
        athlete.setIsRower(TestConstants.TEST_ATHLETE_IS_ROWER);
        return athlete;
    }

    public static Athlete generateRowerStarboard() {
        Athlete athlete = generateAthlete();
        athlete.setPrimarySide(TestConstants.TEST_ATHLETE_STARBOARD);
        athlete.setIsRower(TestConstants.TEST_ATHLETE_IS_ROWER);
        return athlete;
    }

    public static Athlete generateCoxswain() {
        Athlete athlete = generateAthlete();
        athlete.setIsRower(TestConstants.TEST_ATHLETE_IS_COXSWAIN);
        return athlete;
    }

}
