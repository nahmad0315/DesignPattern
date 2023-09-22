/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example_2;

/**
 *
 * @author Nabeel Ahmad
 */
public class Demo {

    public static void main(String[] args) {
        WhiteShirt shirt = new WhiteShirt();

        Person Peter = new Person("Peter");
        Person John = new Person("John");
        Person Sheraz = new Person("Sheraz");

        shirt.subscribe(Peter);
        shirt.subscribe(John);

        shirt.setInStock(true);
        shirt.setInStock(false);

        shirt.unscubscribe(Peter);
        shirt.setInStock(true);

    }

}
