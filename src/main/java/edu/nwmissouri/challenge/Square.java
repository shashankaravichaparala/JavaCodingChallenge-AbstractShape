/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.challenge;

/**
 *
 * @author S545113
 */
public class Square extends AbstractShape {

    private double area;

    public Square(double area) {
        super("Square");
        this.area = area;
    }

    @Override
    public double getArea() {
        return area * area;
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // add an executable main() method to test it
    public static void main(String[] args) {
        double area = 4.0;
        Square square = new Square(area);
        double square_area = square.getArea();

        System.out.println("===========================================");
        System.out.println("Square");
        System.out.println("===========================================");
        System.out.println("Given Area: " + area);
        System.out.println("A Square's area will be " + square_area);
        System.out.println("===========================================");
    }

}
