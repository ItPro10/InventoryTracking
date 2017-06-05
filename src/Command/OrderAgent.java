package Command;
/*
 * This is console demo to show the use of the command pattern 
 * by Nalinie Nybo
 * Assignment 4 - MET CS 665 
 */

//set  up done here
import java.util.ArrayList;
import java.util.List;

public class OrderAgent {
	//private instance variables
	private List<Order> orderList = new ArrayList<Order>(); 
	//constructor
	public OrderAgent()
	{

	}
	//take order
	//add order to order list
	public void takeOrder(Order order){
		orderList.add(order);	
		System.out.println("Taking order...");
	}
	//place order
	//call execute for each order in list
	public void placeOrders(){
		System.out.println("Placing order....");
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
