/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author Nabeel Ahmad
 */
public class Lazy_Implementation {

    private static volatile Lazy_Implementation instance = null;

    private Lazy_Implementation() {}

    public static Lazy_Implementation getInstance() {
        Lazy_Implementation instance = Lazy_Implementation.instance;
        if (instance == null) {
            synchronized(Lazy_Implementation.class) {
                instance = Lazy_Implementation.instance;
                if (instance == null) {
                    Lazy_Implementation.instance = instance = new Lazy_Implementation();
                }
            }
        }
        return instance;
    }
    
    public static void main(String args[]){
        Lazy_Implementation ob =  Lazy_Implementation.getInstance();
        System.out.println(ob);
    }

}
    
