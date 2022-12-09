package calcrewlator.calcrewlator.persistance.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import calcrewlator.calcrewlator.persistance.types.BoatType;
import lombok.Data;

@Data
@Entity
@Table(name = "boats")
public class Boat {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boat_id", nullable = false)
    private Long boatId;
    @Column(name = "boat_name", nullable = false, unique = true)
    private String boatName;
    @Column(name = "boat_type", nullable = false)
    private BoatType boatType;

    @OneToMany(mappedBy = "boat", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Lineup> lineups;


    @Override
    public String toString() {
        return String.format("Boat=[id=%d, name=%s, boatType=%s]", boatId, boatName, boatType);
    }

}
