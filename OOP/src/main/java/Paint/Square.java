package Paint;

public class Square extends Rectangle {
    private double side;
    public Square(Point point, double side) {
        super(point, side, side);
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
