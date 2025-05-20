package metrics;

import org.junit.jupiter.api.Test;

class FeetTest {
    @Test
    void createInstance() {
        assert(Feet.create(1) instanceof Feet);
    }

    @Test
    void toInches() {
        Feet feet = Feet.create(1);
        assert (feet.toInches() instanceof Inches);
    }
}