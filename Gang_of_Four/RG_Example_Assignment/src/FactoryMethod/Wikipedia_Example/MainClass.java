/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod.Wikipedia_Example;

/**
 *
 * @author Nabeel Ahmad
 */
public class MainClass {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();

        // Create a rural person (Villager)
        IPerson ruralPerson = personFactory.getPerson(PersonType.Rural);
        System.out.println("Rural Person: " + ruralPerson.getName());

        // Create an urban person (CityPerson)
        IPerson urbanPerson = personFactory.getPerson(PersonType.Urban);
        System.out.println("Urban Person: " + urbanPerson.getName());
    }
}