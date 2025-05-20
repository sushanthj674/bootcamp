
package metrics;

public  class Feet {

    private final double feet;

    public Feet(double feet) {
        this.feet = feet;
    }

    public static Feet create(double feet) {
        return new Feet(feet);
    }


    public  Object toInches() {
        return Inches.create(feet * 12);
    }
}