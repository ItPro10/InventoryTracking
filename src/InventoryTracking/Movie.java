package InventoryTracking;
/*
 * This is console demo to show the use of the abstract factory pattern 
 * to create non-fiction and fiction objects of type movie and book.
 * by Nalinie Nybo
 * Assignment 2 - MET CS 665 
 */

//parent class
public abstract class Movie {
	//declare instance variables
	private String movieTitle;
	private String producer;
	private String director;

	//set methods
	public void setMovieTitle(String title)
	{
		this.movieTitle = title;
	}
	public void setProducer(String prod)
	{
		this.producer = prod;
	}
	public void setDirector(String direct)
	{
		this.director = direct;
	}


	//get methods
	public String getMovieTitle()
	{
		return	this.movieTitle;
	}
	public String getProducer()
	{
		return this.producer;
	}
	public String getDirector()
	{
		return this.director;
	}

	//methods that the movie object can perform
	//display book info
	public String getMovieDetails()
	{
		return "Movie: \n Movie Title: " + getMovieTitle() + "\n Director: " + getDirector();
	}

	//override toString method
	public String toString()
	{
		return getMovieDetails();
	}
}
