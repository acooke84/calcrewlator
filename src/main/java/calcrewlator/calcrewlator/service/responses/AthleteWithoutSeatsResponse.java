package calcrewlator.calcrewlator.service.responses;

import calcrewlator.calcrewlator.persistance.entities.Athlete;
import calcrewlator.calcrewlator.persistance.types.Side;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AthleteWithoutSeatsResponse {
    
    private Long athleteId;
    private String athleteName;
    private Integer graduationYear;
    private Boolean isRower;
    private Side primarySide;
    private Boolean swapsSides;

    public static AthleteWithoutSeatsResponse of(Athlete athlete) {
        return new AthleteWithoutSeatsResponse(
            athlete.getAthleteId(),
            athlete.getAthleteName(), 
            athlete.getGraduationYear(), 
            athlete.getIsRower(), 
            athlete.getPrimarySide(), 
            athlete.getSwapsSides()
        );
    }

}
