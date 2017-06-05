package Command;

import InventoryTracking.Book;
import InventoryTracking.FictionBook;

/*
 * This is console demo to show the use of the command pattern 
 * by Nalinie Nybo
 * Assignment 4 - MET CS 665 
 */
public class InventoryOrders {
	Book bookOrder = new FictionBook();
	//constructor
	public InventoryOrders(Book book)
	{
		this.bookOrder = book;
	}
	//order books method
	public void OrderBooks()
	{
		System.out.println("Ordering " + this.bookOrder);
	}
}
