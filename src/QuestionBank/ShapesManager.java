/*3.You are required to design a system for managing different types of shapes.
The system should be able to calculate the area and perimeter of various shapes such as circles, rectangles, and triangles.
Each shape has different methods to calculate its area and perimeter.
(Use abstract methods-calculateArea(), calculatePerimeter(), displayDetails())*/

package QuestionBank;

import org.w3c.dom.ls.LSOutput;

abstract class Shape{
    final double pie = 3.14;
    public abstract double calculatePerimeter();
    public abstract double calculateArea();

}
class Circle extends Shape{
    double radius = 4.5;

    @Override
    public double calculatePerimeter(){
        return 2*pie*radius;
    }

    @Override
    public double calculateArea(){
        return pie*radius*radius;
    }
}

class Rectangle extends Shape{
    double length = 5.5;
    double breadth = 6.5;

    @Override
    public double calculatePerimeter(){
        return 2*(length + breadth);
  }

    @Override
    public double calculateArea(){
        return length*breadth;
    }
}
class Triangle extends Shape{
    double base = 5;
    double height = 6.7;
    double side1 = 3;
    double side2 = 4;
    double side3 = 5;

    @Override
    public double calculatePerimeter(){
        return side1 + side2 + side3;
    }

    public double calculateArea(){
        return (base*height)/2;
    }
}


public class ShapesManager {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        System.out.println("Perimeter of Circle = " + circle.calculatePerimeter());
        System.out.println("Perimeter of Rectangle = " + rectangle.calculatePerimeter());
        System.out.println("Perimeter of Triangle = " + triangle.calculatePerimeter());

        System.out.println("Area of Circle = " + circle.calculateArea());
        System.out.println("Area of Rectangle = " + rectangle.calculateArea());
        System.out.println("Area of Triangle = " + triangle.calculateArea());
    }
}
