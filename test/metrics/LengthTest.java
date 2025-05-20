package metrics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest  {
    @Test
    void createFeet() {
        assert (Length.createFeet(1) instanceof Length);
    }

    @Test
    void createInches() {
        assert (Length.createInches(1) instanceof Length);
    }

    @Test
    void createCm() {
        assert (Length.createCm(1) instanceof Length);
    }

    @Test
    void createMm() {
        assert (Length.createMm(10) instanceof Length);
    }

    @Test
    void equalityOfCmAndIn() {
        Length inches = Length.createInches(2);
        Length cm = Length.createCm(5.08);
        assertEquals(cm,inches);
    }
    @Test
    void equalityOfCmAndMm() {
        Length mm = Length.createMm(10);
        Length cm = Length.createCm(1);
        assertEquals(cm,mm);
    }

    @Test
    void equalityOfFtAndIn() {
        Length feet = Length.createFeet(1);
        Length inches = Length.createInches(12);
        assertEquals(feet,inches);
    }

    @Test
    void addSame() {
        Length i1 = Length.createInches(2);
        Length i2 = Length.createInches(2);
        Length result = Length.createInches(4);
        assertEquals(i1.add(i2), result);
    }
    @Test
    void addDiff() {
        Length i1 = Length.createCm(2.54);
        Length i2 = Length.createInches(1);
        Length result = Length.createInches(2);
        assertEquals(i1.add(i2), result);
    }

}