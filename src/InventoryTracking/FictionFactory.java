package InventoryTracking;
/*
 * This is console demo to show the use of the abstract factory pattern 
 * to create non-fiction and fiction objects of type movie and book.
 * by Nalinie Nybo
 * Assignment 2 - MET CS 665
 */

//concrete factory
//child class of abstract factory
//creates Fiction objects
public class FictionFactory implements AbstractFactoryStoreInventory{

	//create Book Fiction object
	public Book createBook(String book)
	{
		if(book == null)
		{
			return null;
		}
		if(book.equalsIgnoreCase("FICTION"))
		{
			return new FictionBook();
		}
		return null;
	}
	//create Movie fiction object
	public Movie createMovie(String movie)
	{
		if(movie == null)
		{
			return null;
		}
		if(movie.equalsIgnoreCase("FICTION"))
		{
			return new FictionMovie();
		}
		return null;
	}

}
