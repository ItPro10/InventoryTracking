package InventoryTracking;
/*
 * This is console demo to show the use of the abstract factory pattern 
 * to create non-fiction and fiction objects of type movie and book.
 * by Nalinie Nybo
 * Assignment 2 - MET CS 665 
 */

//concrete factory
//child class of abstract factory
//creates Non-Fiction objects
public class NonFictionFactory implements AbstractFactoryStoreInventory {

	//create Book non-fiction object
	public Book createBook(String book)
	{
		if(book == null)
		{
			return null;
		}
		if(book.equalsIgnoreCase("NONFICTION"))
		{
			return new NonFictionBook();
		}
		return null;
	}
    //create Movie non-fiction object
	public Movie createMovie(String movie)
	{
		if(movie == null)
		{
			return null;
		}
		if(movie.equalsIgnoreCase("NONFICTION"))
		{
			return new NonFictionMovie();
		}
		return null;
	}
}
