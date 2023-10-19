package Lesson04.Shapes.ex;

public class Circle extends Shape{
    final double PI =3.14;
    double getArea(double radius){
    return PI*radius*radius;
    }

    double getPerimeter(double radius){
    return PI *2 * radius;
    }
}


