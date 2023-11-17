/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example_3;

/**
 *
 * @author Nabeel Ahmad
 */
public class SMSSubscriber implements Subscriber{
	String userInfo;
	
	public SMSSubscriber(String userInfo) {
		this.userInfo = userInfo;
	}
	@Override
	public void update(String update) {
		System.out.println(this.toString()+": "+update);
		
	}
	@Override
	public String toString() {
		return "SMSSubscriber [userInfo=" + userInfo + "]";
	}

}