package calcrewlator.calcrewlator.service.responses;

import calcrewlator.calcrewlator.persistance.entities.Athlete;
import calcrewlator.calcrewlator.persistance.entities.Lineup;
import calcrewlator.calcrewlator.persistance.entities.SeatAssignment;
import calcrewlator.calcrewlator.persistance.types.Seat;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SeatResponse {

    private Athlete athlete;
    private Lineup lineup;
    private Seat seat;
    
    public static SeatResponse of(SeatAssignment seatAssignment) {
        return new SeatResponse(
            seatAssignment.getAthlete(), 
            seatAssignment.getLineup(), 
            seatAssignment.getSeatId()
        );
    }

}
