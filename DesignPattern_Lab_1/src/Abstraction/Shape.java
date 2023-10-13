/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

/**
 *
 * @author Nabeel Ahmad
 */
abstract class Shape {
    abstract double calculateArea();
    
    abstract double calculatePerimeter();
    
    public void displayInfo(){
        System.out.println("This is a shape");
    }
    
}
