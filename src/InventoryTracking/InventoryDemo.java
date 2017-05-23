package InventoryTracking;
import javax.swing.JOptionPane;

/*
 * This is console demo to show the use of the abstract factory pattern 
 * to create non-fiction and fiction objects of type movie and book.
 * by Nalinie Nybo
 * Assignment 2 - MET CS 665  
 */

/*
 * PROMPTS
 * This class prompts the user for input
 * 1. User can select a Fiction or NonFiction item to create
 * 2. User can select a Book or Movie item to create
 * 3. Console displays created item and its details.
 */

/*
 * ABTRACT FACTORY DESIGN PATTERN
 * 1. Abstract Factory class - AbstractFactoryStoreInventory.java
 * 2. Concrete classes - NonFictionFactory.java and FictionFactory.java
 * 3. Setup class - InventorySetup.java
 * 4. Parent Product class - Movie.java and Book.java
 * 5. Child product class - NonFictionBook.java, FictionBook.java, FictionMovie.java, NonFictionMovie.java
 */
/*
 * HOW IT WORKS
 * 1. Concrete factory classes of type AbstractFactory class declared
 * 2. Setup class used to create concrete class based on type of product (FICTION or NONFICTION) needed by passing in the type as a string
 * 3. Concrete object uses create methods to return final product such as FICTIONBOOK 
 */

public class InventoryDemo {

	public static void main(String[] args) {
		//prompt for string input
		String input = JOptionPane.showInputDialog("Would you like to create a Non-Fiction or Fiction item? Enter N for Non-Fiction or F for Fiction: ");
		
		//declare concrete factory of type abstract factory (parent class)
		AbstractFactoryStoreInventory nonFictionFactory =  null ;
		AbstractFactoryStoreInventory fictionFactory = null;
		
		//using the InventorySetup class to initialize
		//and return the concrete factory object
		if(input.equalsIgnoreCase("N"))
		{
			//return the concrete NONFICTION factory object
			nonFictionFactory = InventorySetup.getConcreteFactory("NONFICTION");
			//prompt for user input
			input = JOptionPane.showInputDialog("Would you like to create a Book or Movie? Enter B for Book or M for Movie");
			if(input.equalsIgnoreCase("B"))
			{
				//create an object of Book NonFiction
				//using factory
				Book nonFictionBook = nonFictionFactory.createBook("NONFICTION");
				//hard code book info using setters
				nonFictionBook.setBookTitle("Software Design");
				nonFictionBook.setAuthor("Eric Braude");
				nonFictionBook.setPublisher("Wiley and Sons");
				//display object created
				System.out.println(nonFictionBook);
			}
			else if (input.equalsIgnoreCase("M"))
			{
				//create an object of Movie NonFiction
				//using factory
				Movie nonFictionMovie = nonFictionFactory.createMovie("NONFICTION");
				//hard code movie info using setters
				nonFictionMovie.setMovieTitle("History of Rome");
				nonFictionMovie.setDirector("Julius Caesar");
				nonFictionMovie.setProducer("Julius Caesar");
				//display objects created
				System.out.println(nonFictionMovie);
			}
			
		}
		else if (input.equalsIgnoreCase("F"))
		{
			//using the InventorySetup class to initialize
			//and return the concrete FICTION factory object
			fictionFactory = InventorySetup.getConcreteFactory("FICTION");
			//prompt for user input
			input = JOptionPane.showInputDialog("Would you like to create a Book or Movie? Enter B for Book or M for Movie");
			if(input.equalsIgnoreCase("B"))
			{
				//create an object of Book Fiction
				//using factory
				Book fictionBook = fictionFactory.createBook("FICTION");
				//hard code book info using setters
				fictionBook.setBookTitle("HarryPotter");
				fictionBook.setAuthor("JK Rowling");
				fictionBook.setPublisher("Random House");
				//display objects created
				System.out.println(fictionBook);
			}
			else if (input.equalsIgnoreCase("M"))
			{
				//create an object of Movie Fiction
				//using factory
				Movie fictionMovie = fictionFactory.createMovie("FICTION");
				//hard code movie info using setters
				fictionMovie.setMovieTitle("Star Wars");
				fictionMovie.setDirector("George Lucas");
				fictionMovie.setProducer("George Lucas");
				//display objects created
				System.out.println(fictionMovie);
			}
		}
	}

}
