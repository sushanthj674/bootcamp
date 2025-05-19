package probablity;

import java.util.Objects;

public class Probability {


    private final double chance;

    public Probability(double chance) {
        this.chance = chance;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(chance, that.chance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chance);
    }

    public static Probability createInstance(double chance) {
        if(chance < 0 || chance > 1){
            throw new RuntimeException("invalid chance");
        }
        return new Probability(chance);
    }

    public Probability complement() {
        return new Probability(1 - chance);
    }

    public Probability and(Probability p2) {
        return new Probability(chance * p2.chance);
    }
}
