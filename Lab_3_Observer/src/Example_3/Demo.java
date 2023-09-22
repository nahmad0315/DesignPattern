/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example_3;

/**
 *
 * @author Nabeel Ahmad
 */
public class Demo {

	public static void main(String[] args) {
		Commentary commentary = new Commentary();
		Subscriber subscriber = new SMSSubscriber("Irfan ");
		commentary.subsrcibe(subscriber);

		Subscriber subscriber2 = new SMSSubscriber("Ghufran");
		commentary.subsrcibe(subscriber2);

		commentary.setDesc("Welcome to live Soccer match");
		commentary.setDesc("Current score 0-0");
		commentary.unSubsrcibe(subscriber2);

		
		commentary.setDesc("It’s a goal!!");
		commentary.setDesc("Current score 1-0");

		Subscriber subscriber3 = new SMSSubscriber("Sher Khan");
		commentary.subsrcibe(subscriber3);
		commentary.setDesc("It’s another goal!!");
		commentary.setDesc("Half-time score 2-0");


	}

}
