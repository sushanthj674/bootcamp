package metrics;

import org.junit.jupiter.api.Test;

class InchesTest {
    @Test
    void createInstance() {
        assert( Inches.create(1) instanceof Inches );
    }

    @Test
    void toFeet() {
        Inches inches = Inches.create(12);
        assert( inches.toFeet() instanceof Feet);
    }
}