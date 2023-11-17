/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example_2;

/**
 *
 * @author Nabeel Ahmad
 */
    public class Person implements Subscriber{
	String name;
	

	public Person(String name) {
		this.name = name;
	}


	@Override
	public void update() {
		System.out.println("Hello "+name+", product is now in stock");
		
	}

}

