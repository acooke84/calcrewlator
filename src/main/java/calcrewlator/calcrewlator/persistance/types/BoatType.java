package calcrewlator.calcrewlator.persistance.types;

public enum BoatType {
    SINGLE(1),
    DOUBLE(2),
    STRAIGHT_PAIR(2),
    COXED_PAIR(3),
    QUAD(4),
    COXED_FOUR(5),
    STRAIGHT_FOUR(4),
    EIGHT(9);

    public final Integer seatCount;

    private BoatType(Integer seatCount) {
        this.seatCount = seatCount;
    }
}
