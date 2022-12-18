package calcrewlator.calcrewlator.persistance.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import calcrewlator.calcrewlator.persistance.types.Seat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "seat_assignments")
@IdClass(SeatAssignmentId.class)
public class SeatAssignment {
    
    @Id
    @ManyToOne
    @JoinColumn(name = "lineup_id", referencedColumnName = "lineup_id")
    private Lineup lineup;

    @Id
    @ManyToOne
    @JoinColumn(name = "athlete_id", referencedColumnName = "athlete_id")
    private Athlete athlete;

    @Column(name = "seat_id")
    private Seat seatId;

    @Override
    public String toString() {
        return String.format("SeatAssignment[lineup=" + lineup + ", athlete=" + athlete + ", seat=%d]", seatId);
    }

}
