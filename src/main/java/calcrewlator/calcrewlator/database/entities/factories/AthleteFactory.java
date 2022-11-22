package calcrewlator.calcrewlator.database.entities.factories;

import calcrewlator.calcrewlator.database.entities.Athlete;
import calcrewlator.calcrewlator.database.types.Side;

public class AthleteFactory {

    public static Athlete generateAthlete(String name, Integer graduationYear, Boolean isRower, Side primarySide, Boolean swapsSides) {
        return new Athlete(name, graduationYear, isRower, primarySide, swapsSides);
    }

    public static Athlete generateRower(String name, Integer graduationYear, Side primarySide, Boolean swapsSides) {
        return generateAthlete(name, graduationYear, true, primarySide, swapsSides);
    }

    public static Athlete generateCoxswain(String name, Integer graduationYear) {
        return generateAthlete(name, graduationYear, false, null, null);
    }
    
    public static Athlete generatePort(String name, Integer graduationYear) {
        return generateRower(name, graduationYear, Side.PORT, false);
    }

    public static Athlete generateStarboard(String name, Integer graduationYear) {
        return generateRower(name, graduationYear, Side.STARBOARD, false);
    }

}
