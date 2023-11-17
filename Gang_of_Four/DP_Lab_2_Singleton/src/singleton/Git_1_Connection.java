/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author Nabeel Ahmad
 */
public class Git_1_Connection {
	private static Git_1_Connection instance;
	private Git_1_Connection(){
		
	}
	public static Git_1_Connection getInstance(){
		if(instance == null){
			instance = new Git_1_Connection();
		}
		return instance;
	}
	public void getData(){
		System.out.println("This is the data retrieved from the DB");
	}

}

