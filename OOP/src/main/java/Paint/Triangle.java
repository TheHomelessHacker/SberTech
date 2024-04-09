package Paint;

public class Triangle extends Figure {
    Point point2;
    Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        super(point1);
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}