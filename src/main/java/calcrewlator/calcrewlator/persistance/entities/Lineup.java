package calcrewlator.calcrewlator.persistance.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "lineups")
public class Lineup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lineup_id", nullable = false)
    private Long lineupId;

    @ManyToOne
    @JoinColumn(name = "boat_id", referencedColumnName = "boat_id")
    private Boat boat;

    @OneToMany(mappedBy = "lineup", cascade = CascadeType.ALL)
    private List<SeatAssignment> seatAssignments;


    @Override
    public String toString() {
        return String.format("Lineup=[id=%d, boat=" + boat + "]", lineupId);
    }
    
}
