package InventoryTracking;
/*
 * This is console demo to show the use of the abstract factory pattern 
 * to create non-fiction and fiction objects of type movie and book.
 * by Nalinie Nybo
 * Assignment 2 - MET CS 665
 */

//child class of Movie
public class NonFictionMovie extends Movie{

	//constructor
	public NonFictionMovie()
	{
		super();
	}
	//methods that the movie object can perform
	//display book info
	public String getMovieDetails()
	{
		return "Non-Fiction Movie: \n Movie Title: " + getMovieTitle() + "\n Director: " + getDirector();
	}

	//override toString method
	public String toString()
	{
		return getMovieDetails();
	}
}
