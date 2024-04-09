package Paint;

public class FigureUtil {
    private FigureUtil() {
    }

    public static double area(Figure figure) {
        return figure.area();
    }

    public static double perimeter(Figure figure) {
        return figure.perimeter();
    }

    public static void draw(Figure figure) {
        //figure.draw();
        System.out.println("Drawn " + figure.getClass().getSimpleName() +
                " with coordinates (" + figure.point.x + ", " + figure.point.y + ")");
    }

    public static void draw(Figure figure, Color color) {
        //figure.draw(color);
        System.out.println("Drawn " + color + " " + figure.getClass().getSimpleName() +
                " with coordinates (" + figure.point.x + ", " + figure.point.y + ")");
    }
}