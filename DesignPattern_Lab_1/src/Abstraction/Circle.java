/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

/**
 *
 * @author Nabeel Ahmad
 */
public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        System.out.println("This method calculates the peri of the circle " + 2 * Math.PI * radius );
        return 2 * Math.PI * radius;
    }
    
    public void displayInfo(){
        System.out.println("This is a circle");
    
    }
}