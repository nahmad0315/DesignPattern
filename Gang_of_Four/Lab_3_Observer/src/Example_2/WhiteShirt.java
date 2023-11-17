/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example_2;
    import java.util.ArrayList;
/**
 *
 * @author Nabeel Ahmad
 */



public class WhiteShirt implements Publisher{
	private ArrayList<Subscriber> subscribers;
	boolean inStock = false;

	public WhiteShirt() {
		subscribers = new ArrayList<Subscriber>();
	}
	
	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
		if(inStock){
			notifySubscribers();
		}
	}

	@Override
	public void subscribe(Subscriber s) {
		if(!subscribers.contains(s)){
			subscribers.add(s);
		}	
	}

	@Override
	public void unscubscribe(Subscriber s) {
		if(subscribers.contains(s)){
			subscribers.remove(s);
		}
	}
	
	public void notifySubscribers(){
		for(Subscriber s: subscribers){
			s.update();
		}
	}

}
