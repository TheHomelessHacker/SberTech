package Paint;

public class PaintExample {
    public static void main(String[] args) {
        Point pointCircle = new Point(5, 10);
        Point pointRectangle = new Point(10, 20);
        Point pointSquare = new Point(0, -20);

        Circle circle = new Circle(pointCircle, 5);
        Rectangle rectangle = new Rectangle(pointRectangle, 5, 6);
        Square square = new Square(pointSquare, 4);

        System.out.println("Площадь круга = " + circle.area());
        System.out.println("Периметр круга = " + circle.perimeter());
        FigureUtil.draw(circle);
        FigureUtil.draw(circle, Color.YELLOW);
        System.out.println();

        System.out.println("Площадь прямоугольника = " + rectangle.area());
        System.out.println("Периметр прямоугольника = " + rectangle.perimeter());
        FigureUtil.draw(rectangle);
        FigureUtil.draw(rectangle, Color.RED);
        System.out.println();

        System.out.println("Площадь квадрата = " + square.area());
        System.out.println("Периметр квадрата = " + square.perimeter());
        FigureUtil.draw(square);
        FigureUtil.draw(square, Color.GREEN);


    }
}
