package Singleton;

import InventoryTracking.Book;

/*
 * This is console demo to show the use of the Singleton pattern 
 * by Nalinie Nybo
 * MET CS 665 
 */


public class DataAccess {
	// private static member variable
	private static DataAccess dataAccess = new DataAccess();

	// constructor
	// make private
	private DataAccess() {
		// set up database connection
		// not implemented yet
		System.out.println("This is using the Singleton Pattern");
		SetConnections();
	}

	// public static method to access member
	// get object instance
	public static DataAccess getInstance() {
		return dataAccess;
	}

	// setup data connection
	public void SetConnections() {
		// not implemented
		System.out.println("Setting up connection to database...");
	}

	// verify data
	public void VerifyData() {
		// not implemented
		System.out.println("Verifying data...");
	}

	// methods to retrieve data
	public void getBookData() {
		// retrieve data from database
		System.out.println("Retrieving Books...");
		System.out.println(" Book: Harry Potter, Author: JK Rowling\n Book: Software Design, Author: Eric Braude");
	}

	public void getMovieData() {
		// retrieve data from database
		System.out.println("Retrieving Movies...");
		System.out.println(" Movie: Star Wars, Director: George Lucas");
	}

	// insert data
	public void addBookData(Book book) {
		// insert data
		VerifyData();
		System.out.println("Inserting Books...");
		System.out.println(" You have inserted: " + book.getBookDetails() );
	}

	public void addMovieData(String title, String director) {
		// insert data
		VerifyData();
		System.out.println("Inserting Movies...");
		System.out.println(" You have inserted: " + title + ", " + director);
	}

	// edit data
	public void editBookData(String title, String author, int quantity) {
		// edit data
		VerifyData();
		System.out.println("Editing Books...");
		System.out.println(" You have edited: " + title + ", " + author + " with a quantity of " + quantity);
	}

	public void editMovieData(String title, String director, int quantity) {
		// edit data
		VerifyData();
		System.out.println("Editing Movies...");
		System.out.println(" You have edited: " + title + ", " + director + " with a quantity of " + quantity);
	}

}
