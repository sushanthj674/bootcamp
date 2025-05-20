package volume;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void createGallons() {
       assert ( Quantity.createGallons(1) instanceof Quantity);
    }
    @Test
    void createLiter() {
        assert ( Quantity.createLiters(3.78) instanceof Quantity);
    }

    @Test
    void equals() {
        Quantity gallons = Quantity.createGallons(1);
        Quantity liters = Quantity.createLiters(3.78);
        assertEquals(gallons,liters);
    }
}