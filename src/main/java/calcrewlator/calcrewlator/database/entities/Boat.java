package calcrewlator.calcrewlator.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import calcrewlator.calcrewlator.database.types.BoatType;

@Entity
@Table(name = "boats")
public class Boat {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boat_id", nullable = false)
    private Integer id;

    @Column(name = "boat_name", nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Type(type = "boat_type_enum_type")
    @Column(name = "boat_type", nullable = false, columnDefinition = "boat_type")
    private BoatType boatType;

    public Boat() {}
    
    public Boat(String name, BoatType boatType) {
        this.name = name;
        this.boatType = boatType;
    }

    @Override
    public String toString() {
        return String.format(
            "Boat=[id=%d, name=%s, boatType=%s]", 
            id, name, boatType.toString());
    }

    // =====================
    //   Getters + Setters
    // =====================

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BoatType getBoatType() {
        return boatType;
    }

    public void setBoatType(BoatType boatType) {
        this.boatType = boatType;
    }

    public void setBoatType(String boatType) {

    }

}
