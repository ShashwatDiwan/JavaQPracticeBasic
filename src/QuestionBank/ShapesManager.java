/*3.You are required to design a system for managing different types of shapes.
The system should be able to calculate the area and perimeter of various shapes such as circles, rectangles, and triangles.
Each shape has different methods to calculate its area and perimeter.
(Use abstract methods-calculateArea(), calculatePerimeter(), displayDetails())*/

package QuestionBank;

//Redo this program and take input from the user

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


//with user input
/*package QuestionBank;

import java.util.Scanner;

// Abstract Shape class
abstract class Shape {
    final double pie = 3.14;

    public abstract double calculatePerimeter();
    public abstract double calculateArea();
}

// Circle subclass
class Circle extends Shape {
    double radius;

    // Constructor to accept radius as input
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * pie * radius;
    }

    @Override
    public double calculateArea() {
        return pie * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    double length;
    double breadth;

    // Constructor to accept length and breadth as input
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

// Triangle subclass
class Triangle extends Shape {
    double base;
    double height;
    double side1;
    double side2;
    double side3;

    // Constructor to accept base, height, and sides as input
    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}

// Main class to manage the shapes
public class ShapesManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for Circle
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);
        System.out.println("Perimeter of Circle = " + circle.calculatePerimeter());
        System.out.println("Area of Circle = " + circle.calculateArea());

        // Get input for Rectangle
        System.out.println("Enter the length and breadth of the rectangle:");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        Shape rectangle = new Rectangle(length, breadth);
        System.out.println("Perimeter of Rectangle = " + rectangle.calculatePerimeter());
        System.out.println("Area of Rectangle = " + rectangle.calculateArea());

        // Get input for Triangle
        System.out.println("Enter the base and height of the triangle:");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println("Enter the three sides of the triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        Shape triangle = new Triangle(base, height, side1, side2, side3);
        System.out.println("Perimeter of Triangle = " + triangle.calculatePerimeter());
        System.out.println("Area of Triangle = " + triangle.calculateArea());

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
*/
