package shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void positiveArea() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(rectangle.area(),6,"should return area of rectangle");
    }

    @Test
     void calculatesZeroLength() {
        Rectangle rectangle = new Rectangle(0, 3);
        assertEquals(rectangle.area(),0,"should return 0 area of rectangle if length 0");
    }

    @Test
     void calculatesZeroBreadthArea() {
        Rectangle rectangle = new Rectangle(2, 0);
        assertEquals(rectangle.area(),0,"should return 0 area of rectangle if breadth 0");
    }

    @Test
    void shouldReturnPerimeter() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(rectangle.perimeter(),10,"should return valid perimeter");
    }

    @Test
    void calculatesZeroLengthPerimeter() {
        Rectangle rectangle = new Rectangle(0, 3);
        assertEquals(rectangle.perimeter(),6,"should return valid perimeter if length zero");
    }

    @Test
    void calculatesZeroBreadthPerimeter() {
        Rectangle rectangle = new Rectangle(3, 0);
        assertEquals(rectangle.perimeter(),6,"should return valid perimeter if breadth zero");
    }
}
