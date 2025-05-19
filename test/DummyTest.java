import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyTest {
    @Test
    void add() {

        assertEquals(Dummy.add(2,3),5, "expected 5");
    }
}