/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example_3;

/**
 *
 * @author Nabeel Ahmad
 */
public interface Publisher {
	void subsrcibe(Subscriber s);
	void unSubsrcibe(Subscriber s);
	void notifySubscribers();
}