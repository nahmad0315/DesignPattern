/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod.Wikipedia_Example;

/**
 *
 * @author Nabeel Ahmad
 */
public class PersonFactory {
    public IPerson getPerson(PersonType type) {
        switch (type) {
            case Rural -> {
                return new Villager();
            }
            case Urban -> {
                return (IPerson) new CityPerson();
            }
            default -> throw new UnsupportedOperationException();
        }
    }
}