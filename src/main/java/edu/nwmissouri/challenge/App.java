package edu.nwmissouri.challenge;

/**
 * Starting point for our app.
 */
public class App {

    public static void main(String[] args) {

        // test Circle class
        double radius = 1.0;
        Circle circle = new Circle(radius);

        String type = circle.getShapeType();
        double area = circle.getArea();
        double perimeter = circle.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Circle");
        System.out.println("===========================================");
        System.out.println("Given radius: " + radius);
        System.out.println("A circle's area will be " + area);
        System.out.println("A circle's perimeter will be " + perimeter);
        System.out.println("===========================================");

        // test Rectangle Class
        double length = 1.0;
        double width = 2.0;
        Rectangle rectangle = new Rectangle(length, width);
        double rectangle_area = rectangle.getArea();
        double rectangle_perimeter = rectangle.getPerimeter();
        System.out.println("===========================================");
        System.out.println("Rectangle");
        System.out.println("===========================================");
        System.out.println("Given Length: " + length);
        System.out.println("Given Width: " + width);
        System.out.println("A Rectangle's area will be " + rectangle_area);
        System.out.println("A Rectangle's perimeter will be " + rectangle_perimeter);
        System.out.println("===========================================");

        // test Square Class
        double square_length = 4.0;
        Square square = new Square(square_length);
        double square_area = square.getArea();
        System.out.println("===========================================");
        System.out.println("Square");
        System.out.println("===========================================");
        System.out.println("Given Area: " + square_length);
        System.out.println("A Square's area will be " + square_area);
        System.out.println("===========================================");
    }

}
