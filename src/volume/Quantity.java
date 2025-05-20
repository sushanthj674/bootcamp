package volume;

import java.util.Objects;

public class Quantity {

    private final double units;

    public Quantity(double units) {
        this.units = units;
    }

    public static Quantity createGallons(double i) {
        return new Quantity(3.78 * i);
    }

    public static Quantity createLiters(double i) {
        return  new Quantity(i);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(Math.round(units), Math.round(quantity.units)) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(units);
    }

    public Quantity add(Quantity q) {
        System.out.println(q.units);
        System.out.println(units);
        System.out.println(q.units+units);
        return  new Quantity(q.units+units);

    }
}
