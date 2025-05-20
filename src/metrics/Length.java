package metrics;


import java.util.Objects;

public class Length {

    private final double value;
    private final LengthUnits in;

    public Length(double value, LengthUnits in) {
        this.value = value;
        this.in = in;
    }

    public static Length createMm(double i) {
        return new Length(i,LengthUnits.MM);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(value, length.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public static Length createFeet(double i) {
        return new Length(i * 304.8, LengthUnits.FT);
    }

    public static Length createCm(double i) {
        return new Length(i * 10, LengthUnits.CM);
    }

    public static Length createInches(double i) {
        return new Length((i * 254)/10, LengthUnits.IN);
    }

    public Length add(Length i2) {
        System.out.println(value );
        System.out.println(i2.value);
        System.out.println(value+i2.value);
        return new Length(value + i2.value, LengthUnits.IN);
    }
}
