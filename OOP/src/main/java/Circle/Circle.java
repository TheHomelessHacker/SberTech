package Circle;

public class Circle {

    private double radius;
    private String color;


    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "\tR = " + radius + "\n\tColor - " + color + "\n\tS = " + area() + "\n\tP = " + perimeter();
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
