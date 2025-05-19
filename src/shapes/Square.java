package shapes;

public class Square  implements quadrilateral{
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side*side;
    }

    @Override
    public int perimeter() {
        return 4*side;
    }
}
