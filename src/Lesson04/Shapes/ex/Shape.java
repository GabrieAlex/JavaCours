package Lesson04.Shapes.ex;

public abstract class Shape {

    abstract double getArea(double length);
    abstract double getPerimeter(double length);

    public void printDetails(){

        System.out.println("Shape is a geometric figure ");
    }
}
