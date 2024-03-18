package Circle;

class Main{
    public static void main(String[] args) {
        Circle circle1 = new Circle(4, "red");
        Circle circle2 = new Circle(10, "yellow");


        System.out.println("S1 = " + circle1.area());
        System.out.println("P2 = " + circle2.perimeter());

        System.out.println("1 figure: \n" + circle1.toString());
        System.out.println("2 figure: \n" + circle2.toString());

    }
}

public class Circle {

    private double radius;
    private String color;
    private static final double Pi = 3.1415926535;


    protected Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    protected double area(){
        return Pi * radius * radius;
    }

    protected   double perimeter(){
        return 2 * Pi * radius;
    }

    @Override
    public String toString(){
        return "\tR = " + radius + "\n\tColor - " + color + "\n\tS = " + area() + "\n\tP = " + perimeter();
    }
}
