package calcrewlator.calcrewlator.utilities;

import java.util.ArrayList;
import java.util.List;

import calcrewlator.calcrewlator.persistance.entities.SeatAssignment;
import calcrewlator.calcrewlator.persistance.types.Side;

public class TestConstants {
    
    // Athletes
    public static Long TEST_ATHLETE_ID = 1L;
    public static String TEST_ATHLETE_NAME = "TEST_ATHLETE";
    public static Integer TEST_ATHLETE_GRADUATION_YEAR = 2024;
    public static Side TEST_ATHLETE_PORT = Side.PORT;
    public static Side TEST_ATHLETE_STARBOARD = Side.STARBOARD;
    public static Boolean TEST_ATHLETE_IS_ROWER = Boolean.TRUE;
    public static Boolean TEST_ATHLETE_IS_COXSWAIN = Boolean.FALSE;
    public static Boolean TEST_ATHLETE_SWAPS_SIDES = Boolean.FALSE;
    public static List<SeatAssignment> TEST_ATHLETE_SEATS = new ArrayList<>();

}
