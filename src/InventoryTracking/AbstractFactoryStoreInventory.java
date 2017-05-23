package InventoryTracking;
/*
 * This is console demo to show the use of the abstract factory pattern 
 * to create non-fiction and fiction objects of type movie and book.
 * by Nalinie Nybo
 * Assignment 2 - MET CS 665
 */

//abstract factory class
public interface AbstractFactoryStoreInventory {

	//creates book and movie object
	public Book createBook(String book);
	public Movie createMovie(String movie);
}
