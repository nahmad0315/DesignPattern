/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author Nabeel Ahmad
 */
public class Animal {

    private String name;
    private double averageWeight;
    private int numberOfLegs;

// Getter methods
    public String getName() {
        return name;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
// Setter methods

    public void setName(String name) {
        this.name = name;
    }

    public void setAverageWeight(double averageWeight) {
        this.averageWeight = averageWeight;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

}
