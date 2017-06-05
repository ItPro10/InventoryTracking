package Command;
/*
 * This is console demo to show the use of the command pattern 
 * by Nalinie Nybo
 * Assignment 4 - MET CS 665 
 */
//class for Book orders
public class BookOrder implements Order {
	//declare private instance variables
	private InventoryOrders invOrder;

	//constructor
	public BookOrder(InventoryOrders io)
	{
		this.invOrder = io;
	}
	//execute
	//calls order books method
	//from inside execute
	@Override
	public void execute() {
		this.invOrder.OrderBooks();
	}
}
