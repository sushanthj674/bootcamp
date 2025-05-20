package metrics;

import java.util.Objects;

public class Length {

    private final double units;

    public Length(double units) {

        this.units = units;
    }

    public static Length createMm(double i) {
        return new Length(i);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(units, length.units) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(units);
    }

    public static Length createFeet(double i) {
        return new Length(i * 304.8);
    }

    public static Length createCm(double i) {
        return new Length(i * 10);
    }

    public static Length createInches(double i) {
        return new Length((i * 254)/10);
    }

    public Length add(Length i2) {
        return new Length(units + i2.units);
    }
}
