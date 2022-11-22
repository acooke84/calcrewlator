package calcrewlator.calcrewlator.database.types;

public enum BoatType {
    SINGLE,
    DOUBLE,
    STRAIGHT_PAIR,
    COXED_PAIR,
    QUAD,
    COXED_FOUR,
    STRAIGHT_FOUR,
    EIGHT;

    public static BoatType createType(String boatType) {
        for (BoatType type: BoatType.values()) {
            if (type.toString().equals(boatType)) {
                return type;
            }
        }
        return null;
    }
}
