/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Nabeel Ahmad
 */
public class Static_Polymorphism_TestBird_Static {

    public static void main(String[] args) {
        Static_Polymorphism_Bird myBird = new Static_Polymorphism_Bird();
        myBird.fly();
        myBird.fly(10000);
        myBird.fly("eagle", 10000);
    }
}
