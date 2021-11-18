/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.challenge;

/**
 *
 * @author S545113
 */
public class Rectangle extends AbstractShape {
    
    private double length ;
    private double width;

    public Rectangle(double length, double width) {
         super("Rectangle");
        this.length = length;
        this.width = width;
    }
    
     @Override
    public double getArea() {
        return length * width;
    }
    
     @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
        // add an executable main() method to test it
    public static void main(String[] args){
        double length = 1.0;
        double width = 2.0;
        Rectangle rectangle = new Rectangle(length, width);
        String type = rectangle.getShapeType();
        double area = rectangle.getArea();
        double perimeter = rectangle.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Rectangle");
        System.out.println("===========================================");
        System.out.println("Given Length: " +  length);
        System.out.println("Given Width: " +  width);
        System.out.println("A Rectangle's area will be " + area);
        System.out.println("A Rectangle's perimeter will be " + perimeter);
        System.out.println("===========================================");
    }

   
    
}
