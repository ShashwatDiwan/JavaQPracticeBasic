//1. Write a Java program to create an interface Shape with the getArea() method.
// Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
// Implement the getArea() method for each of the three classes.

package Interfaces;



interface Shape{
    double getArea();
    static double PI = 3.14;
}

class Rectangle implements Shape{
    private double length;
    private double breadth;

    Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
   public double getArea(){
        return length*breadth;
   }
}

 class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return PI*radius*radius;
    }
}
class Triangle implements Shape {
    private double base;
    private double height;

    Triangle(double base,double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
}




public class AreaofShapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,6);
        Circle circle = new Circle(2.5);
        Triangle triangle = new Triangle(3,6);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Triangle Area: " + triangle.getArea());
    }
}
