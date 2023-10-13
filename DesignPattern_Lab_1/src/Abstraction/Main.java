/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Abstraction;

/**
 *
 * @author Nabeel Ahmad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle(3.9);
        
        circle.calculateArea();
        circle.calculatePerimeter();
        circle.displayInfo();
    }
    
}
