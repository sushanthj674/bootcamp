package shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void calculateArea() {
        Square square = new Square(2);
        assertEquals(square.area(),4);
    }

    @Test
    void calculateZeroSideArea() {
        Square square = new Square(0);
        assertEquals(square.area(),0);
    }

    @Test
    void calculatePerimeter() {
        Square square = new Square(2);
        assertEquals(square.perimeter(),8);
    }

    @Test
    void calculateZeroSidePerimeter() {
        Square square = new Square(0);
        assertEquals(square.perimeter(),0);
    }
}