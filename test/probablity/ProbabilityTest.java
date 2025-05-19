package probablity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {

    @Test
    void tailProbability() {
        assertEquals(0.5, Probability.probablityOf(2,1));
    }

    @Test
    void nonTailProbability() {
        assertEquals(0.5,1 - Probability.probablityOf(2,1));
    }
}