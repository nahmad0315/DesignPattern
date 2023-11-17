/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Nabeel Ahmad
 */
public class Static_Polymorphism_Bird {
    public  void  fly()  {
System.out.println("The bird is flying.");
}
public  void  fly(int height)  {
System.out.println("The bird is flying "  + height +  " feet high.");
}
public  void  fly(String name,  int height)  {
System.out.println("The "  + name +  " is flying "  + height +  " feet high.");
}
}
