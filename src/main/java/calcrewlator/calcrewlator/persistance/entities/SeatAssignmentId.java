package calcrewlator.calcrewlator.persistance.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Embeddable
public class SeatAssignmentId implements Serializable {
    
    @Column(name = "lineup_id")
    private Long lineup;

    @Column(name = "athlete_id")
    private Long athlete;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        SeatAssignmentId that = (SeatAssignmentId) o;
        return (Objects.equals(this.lineup, that.lineup) && Objects.equals(this.athlete, that.athlete));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.lineup, this.athlete);
    }

}
