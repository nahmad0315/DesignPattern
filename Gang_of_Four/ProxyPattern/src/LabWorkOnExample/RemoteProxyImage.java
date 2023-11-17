/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabWorkOnExample;

/**
 *
 * @author Nabeel Ahmad
 */
public class RemoteProxyImage {
    private String remoteSource;
    public RemoteProxyImage(String rSource){
        this.remoteSource = rSource;
    }
    @Override
    public void display(String rSource){
        if(remoteSource.equals(rSource)){
            new remoteImage().display(rSource);
        }
        else{
            System.out.println("Loading Image from fake source of type "+rSource);
        }
    }
}
