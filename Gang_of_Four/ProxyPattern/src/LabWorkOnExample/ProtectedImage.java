/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabWorkOnExample;

/**
 *
 * @author Nabeel Ahmad
 */
public abstract class ProtectedImage implements Image {
    @Override
    public void display(String imageType) {
        System.out.println("Displaying image for correct user of Type "+imageType);
    }
}