package Lesson03.Shapes;

public class ShapesMain {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.width = 3.3;
        r1.height =4.4;
        r1.printArea();

        Triangle t1 = new Triangle();
        t1.width = 5.4;
        t1.height = 4.5;
        t1.printArea();

        Circle c1 = new Circle();
        c1.radius = 9.0;
        c1.pi = 3.14;
        c1.printArea();
    }
}
