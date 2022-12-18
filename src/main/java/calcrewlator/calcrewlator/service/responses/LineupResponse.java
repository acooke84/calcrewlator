package calcrewlator.calcrewlator.service.responses;

import java.util.List;
import java.util.stream.Collectors;

import calcrewlator.calcrewlator.persistance.entities.Boat;
import calcrewlator.calcrewlator.persistance.entities.Lineup;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LineupResponse {

    private Long lineupId;
    private Boat boat;
    private List<SeatResponse> seatAssignments;
    
    public static LineupResponse of(Lineup lineup) {
        return new LineupResponse(
            lineup.getLineupId(), 
            lineup.getBoat(), 
            lineup.getSeatAssignments().stream().map(seat -> SeatResponse.of(seat)).collect(Collectors.toList())
        );
    }

}
