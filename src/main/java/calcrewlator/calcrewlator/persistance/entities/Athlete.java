package calcrewlator.calcrewlator.persistance.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import calcrewlator.calcrewlator.persistance.types.Side;
import lombok.Data;

@Data
@Entity
@Table(name = "athletes")
public class Athlete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "athlete_id", nullable = false)
    private Long athleteId;
    @Column(name = "athlete_name", nullable = false)
    private String athleteName;
    @Column(name = "graduation_year", nullable = false)
    private Integer graduationYear;
    @Column(name = "is_rower", nullable = false)
    private Boolean isRower;
    @Column(name = "primary_side")
    private Side primarySide;
    @Column(name = "swaps_sides")
    private Boolean swapsSides;

    @OneToMany(mappedBy = "athlete", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SeatAssignment> seatAssignments;

    
    @Override
    public String toString() {
        return String.format(
            "Athlete[id=%l, name=%s, graduationYear=%d, isRower=%b]", 
            athleteId, athleteName, graduationYear, isRower);
    }

}
