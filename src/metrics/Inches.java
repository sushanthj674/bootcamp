package metrics;

public class Inches    {
    private final double inches;

    Inches(double inches) {
        this.inches = inches;
    }

    public static Inches create(double i) {
        return new Inches(i);
    }

    public Object toFeet() {
        return Feet.create(inches/12);
    }

}
