package InventoryTracking;
/*
 * This is console demo to show the use of the abstract factory pattern 
 * to create non-fiction and fiction objects of type movie and book.
 * by Nalinie Nybo
 * Assignment 2 - MET CS 665 
 */

//parent class
public abstract class Book {
	//declare instance variables
	private String bookTitle;
	private String author;
	private String publisher;
	public int quantity;

	//constructor
	public Book()
	{

	}

	//set methods
	public void setBookTitle(String title)
	{
		this.bookTitle = title;
	}
	public void setAuthor(String writer)
	{
		this.author = writer;
	}
	public void setPublisher(String publish)
	{
		this.publisher = publish;
	}
	public void SetQuantity(int qty)
	{
		this.quantity = qty;
	}

	//get methods
	public String getBookTitle()
	{
		return	this.bookTitle;
	}
	public String getAuthor()
	{
		return this.author;
	}
	public String getPublisher()
	{
		return this.publisher;
	}
	public int getQuantity()
	{
		return quantity;
	}
	//display book info
	public String getBookDetails() {
		return "Book: \n Book Title: " + getBookTitle() + "\n Author: " + getAuthor() + "\n Publisher: " + getPublisher() + "\n Quantity: " + getQuantity();
	}

	//override toString method
	public String toString()
	{
		return getBookDetails();
	}
	
}
