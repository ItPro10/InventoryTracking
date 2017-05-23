package InventoryTracking;
/*
 * This is console demo to show the use of the abstract factory pattern 
 * to create non-fiction and fiction objects of type movie and book.
 * by Nalinie Nybo
 * Assignment 2 - MET CS 665 
 */

//child class of Book
public class NonFictionBook extends Book {
	//constructor
	public NonFictionBook()
	{
		super();
	}



	//display book info
	@Override
	public String getBookDetails()
	{
		return "Non-Fiction Book: \n Book Title: " + getBookTitle() + "\n Author: " + getAuthor();
	}

	//override toString method
	public String toString()
	{

		return getBookDetails();

	}
}
