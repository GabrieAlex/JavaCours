package Lesson04.Shapes.ex;

public class Square extends Shape{

    double getArea(double side){
        return side * side;
    }
    double getPerimeter(double side){
    return side * 4;
    }
}
