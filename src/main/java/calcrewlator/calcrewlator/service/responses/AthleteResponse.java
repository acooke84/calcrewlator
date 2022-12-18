package calcrewlator.calcrewlator.service.responses;

import java.util.List;
import java.util.stream.Collectors;

import calcrewlator.calcrewlator.persistance.entities.Athlete;
import calcrewlator.calcrewlator.persistance.types.Side;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AthleteResponse {

    private Long athleteId;
    private String athleteName;
    private Integer graduationYear;
    private Boolean isRower;
    private Side primarySide;
    private Boolean swapsSides;

    private List<SeatResponse> seats;

    public static AthleteResponse of(Athlete athlete) {
        return new AthleteResponse(
            athlete.getAthleteId(),
            athlete.getAthleteName(), 
            athlete.getGraduationYear(), 
            athlete.getIsRower(), 
            athlete.getPrimarySide(), 
            athlete.getSwapsSides(),
            athlete.getSeatAssignments().stream().map(seat -> SeatResponse.of(seat)).collect(Collectors.toList())
        );
    }
}
