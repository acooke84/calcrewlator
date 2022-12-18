package calcrewlator.calcrewlator.service.responses;

import calcrewlator.calcrewlator.persistance.entities.Boat;
import calcrewlator.calcrewlator.persistance.types.BoatType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BoatResponse {
    
    private Long boatId;
    private String boatName;
    private BoatType boatType;

    public static BoatResponse of(Boat boat) {
        return new BoatResponse(
            boat.getBoatId(),
            boat.getBoatName(),
            boat.getBoatType()
        );
    }

}
