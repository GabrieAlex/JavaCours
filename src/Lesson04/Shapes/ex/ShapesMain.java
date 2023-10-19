package Lesson04.Shapes.ex;

public class ShapesMain {
    static double circleValue = 3.5;
    static double squareValue = 5.0;
    public static void main(String[] args) {
        Circle c1 =new Circle();
        Square s1 = new Square();

        c1.printDetails();
        System.out.println("Area of circle with radius of: " + circleValue + " is: " + c1.getArea(circleValue));
        System.out.println("Perimeter of circle with radius of: " + circleValue + " is: " + c1.getPerimeter(circleValue));

        s1.printDetails();
        System.out.println("Area of square with side of: " + squareValue + " is: " + s1.getArea(squareValue));
        System.out.println("Perimeter of square with side of: " + squareValue + " is: " + s1.getPerimeter(squareValue));
    }
}
