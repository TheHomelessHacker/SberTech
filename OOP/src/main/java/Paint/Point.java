package Paint;

class PaintExample {
    public static void main(String[] args) {
        Point point = new Point(0, 0);
        Circle circle = new Circle(point, 5);
        Rectangle rectangle = new Rectangle(point, 4, 3);

        /*
        Drawable.draw(circle);
        Drawable.draw(circle, Rectangle.Color.RED);
        Drawable.FigureUtil.draw(rectangle);
        Drawable.FigureUtil.draw(rectangle, Triangle.Color.BLUE);
         */
    }
}

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

abstract class Figure {
    Point point;

    public Figure(Point point) {
        this.point = point;
    }

    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Figure {
    double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Figure {
    double width;
    double height;

    public Rectangle(Point point, double width, double height) {
        super(point);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}

class Square extends Rectangle {
    public Square(Point point, double side) {
        super(point, side, side);
    }
}

class Triangle extends Figure {
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

enum Color {
    RED, GREEN, BLUE, YELLOW, BLACK
}

interface Drawable {
    void draw();
    void draw(Color color);
}

class FigureUtil {
    private FigureUtil() {

    }

    public static double area(Figure figure) {
        return figure.area();
    }

    public static double perimeter(Figure figure) {
        return figure.perimeter();
    }

    public static void draw(Drawable figure) {
        figure.draw();
    }

    public static void draw(Drawable figure, Color color) {
        figure.draw(color);
    }
}
