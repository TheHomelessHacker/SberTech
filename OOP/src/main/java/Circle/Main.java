package Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4, "red");
        Circle circle2 = new Circle(10, "yellow");

        System.out.println("S1 = " + circle1.area());
        System.out.println("P2 = " + circle2.perimeter());

        System.out.println("1 figure: \n" + circle1.toString());
        System.out.println("2 figure: \n" + circle2.toString());
    }
}

