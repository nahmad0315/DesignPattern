/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author Nabeel Ahmad
 */
public class TestAnimal {
  public  static  void  main(String[] args)  {
Animal myAnimal =  new Animal();
myAnimal.setName("Zebra");
myAnimal.setAverageWeight(85);
myAnimal.setNumberOfLegs(4);
System.out.println("Name: "  + myAnimal.getName());
System.out.println("Average weight: "  + myAnimal.getAverageWeight()  +  "kg");
System.out.println("Number of legs: "  + myAnimal.getNumberOfLegs());
}
}

