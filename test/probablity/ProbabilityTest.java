package probablity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {

    @Test
    void createInstance() {
       assert( Probability.createInstance(0.5) instanceof Probability);
    }

    @Test
    void invalidProbability() {
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> Probability.createInstance(-1));
        assertEquals(runtimeException.getMessage(),"invalid chance");
        assertThrows(RuntimeException.class,()-> Probability.createInstance(2));
    }

    @Test
    void complement() {
        Probability instance = Probability.createInstance(0.5);
        Probability result = instance.complement();
        assert(  result instanceof Probability);
        assertEquals(result,Probability.createInstance(0.5));
    }

    @Test
    void and() {
        Probability p1 = Probability.createInstance(0.5);
        Probability p2 = Probability.createInstance(0.5);
        Probability result = p1.and(p2);
        assert( result instanceof Probability);
        assertEquals(result,Probability.createInstance(0.25));
    }



}