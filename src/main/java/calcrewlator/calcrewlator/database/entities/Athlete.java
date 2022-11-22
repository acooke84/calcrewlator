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

import calcrewlator.calcrewlator.database.types.Side;

@Entity
@Table(name = "athletes")
public class Athlete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "athlete_id", nullable = false)
    private Integer athleteId;

    @Column(name = "athlete_name", nullable = false)
    private String athleteName;

    @Column(name = "graduation_year", nullable = false)
    private Integer graduationYear;

    @Column(name = "is_rower", nullable = false)
    private Boolean isRower;

    @Enumerated(EnumType.STRING)
    @Type(type = "side_enum_type")
    @Column(name = "primary_side", columnDefinition = "side")
    private Side primarySide;

    @Column(name = "swaps_sides")
    private Boolean swapsSides;

    // ===================

    public Athlete() {}

    public Athlete(String athleteName, Integer graduationYear, Boolean isRower, Side primarySide, Boolean swapsSides) {
        this.athleteName = athleteName;
        this.graduationYear = graduationYear;
        this.isRower = isRower;
        this.primarySide = primarySide;
        this.swapsSides = swapsSides;
    }

    @Override
    public String toString() {
        return String.format(
            """
            Athlete=[athlete_id=%d, athlete_name=%s, graduation_year=%d, is_rower=%b, primary_side=%s, swaps_sides=%b]
            """, 
            athleteId, 
            athleteName, 
            graduationYear, 
            isRower, 
            (primarySide != null ? primarySide.toString() : "NULL"), 
            (swapsSides != null ? swapsSides : "NULL")
        );
    }

    // =====================
    //   Getters + Setters
    // =====================

    public Integer getAthleteId() {
        return athleteId;
    }

    public void setAthleteId(Integer athleteId) {
        this.athleteId = athleteId;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setName(String athleteName) {
        this.athleteName = athleteName;
    }

    public Integer getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Integer graduationYear) {
        this.graduationYear = graduationYear;
    }

    public Boolean isRower() {
        return isRower;
    }

    public void setRower(Boolean isRower) {
        this.isRower = isRower;
    }

    public Side getPrimarySide() {
        return primarySide;
    }

    public void setPrimarySide(Side primarySide) {
        this.primarySide = primarySide;
    }

    public Boolean swapsSides() {
        return swapsSides;
    }

    public void setSwapsSides(Boolean swapsSides) {
        this.swapsSides = swapsSides;
    }

}
