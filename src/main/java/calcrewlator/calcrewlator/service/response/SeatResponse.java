package calcrewlator.calcrewlator.service.response;

import calcrewlator.calcrewlator.persistance.entities.SeatAssignment;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SeatResponse {
    
    public static SeatResponse of(SeatAssignment seatAssignment) {
        return new SeatResponse();
    }

}
