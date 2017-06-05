package InventoryTracking;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Command.BookOrder;
import Command.InventoryOrders;
import Command.OrderAgent;
import Iterator.FictionBookList;
import Iterator.ParentIterator;
import Observer.Music;
import Observer.StoreRoomObserver;

/*
 * This is console demo to show the use of the Iterator, Observer and Command pattern 
 * by Nalinie Nybo
 * Assignment 4 - MET CS 665 
 * 06/05/2017
 */
/*
 * PROMPTS - Week 4
 * This class prompts the user for input
 * 1. User can select I to see a demo of the Iterator Pattern
 * 2. User can select O to see a demo of the Observer Pattern
 * 3. User can select C to see a demo of the Command Pattern
 */

//OLDER WEEK 2
/*
 * This is console demo to show the use of the abstract factory pattern 
 * to create non-fiction and fiction objects of type movie and book.
 * by Nalinie Nybo
 * Assignment 2 - MET CS 665  
 * 05/28/2017
 */

/*
 * PROMPTS - Week 2
 * This class prompts the user for input
 * 1. User can select a Fiction or NonFiction item to create
 * 2. User can select a Book or Movie item to create
 * 3. Console displays created item and its details.
 *  Assignment 2 - MET CS 665  
 * 05/28/2017
 */

/*
 * Week 2
 * ABTRACT FACTORY DESIGN PATTERN
 * 1. Abstract Factory class - AbstractFactoryStoreInventory.java
 * 2. Concrete classes - NonFictionFactory.java and FictionFactory.java
 * 3. Setup class - InventorySetup.java
 * 4. Parent Product class - Movie.java and Book.java
 * 5. Child product class - NonFictionBook.java, FictionBook.java, FictionMovie.java, NonFictionMovie.java
 */
/*
 * Week 2
 * HOW IT WORKS
 * 1. Concrete factory classes of type AbstractFactory class declared
 * 2. Setup class used to create concrete class based on type of product (FICTION or NONFICTION) needed by passing in the type as a string
 * 3. Concrete object uses create methods to return final product such as FICTIONBOOK 
 */

public class InventoryDemo {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter I for Iterator Demo, O for Observer Demo , or C for Command Demo: ");
		//create books using abstract factory pattern
				//declare concrete factory of type abstract factory (parent class)
				AbstractFactoryStoreInventory fictionFactory = null;
				
				//using the InventorySetup class to initialize
				//and return the concrete FICTION factory object
				fictionFactory = InventorySetup.getConcreteFactory("FICTION");
				
					//create an object of Book Fiction
					//using factory
					Book fictionBook = fictionFactory.createBook("FICTION");
					//hard code book info using setters
					fictionBook.setBookTitle("Harry Potter");
					fictionBook.setAuthor("JK Rowling");
					fictionBook.setPublisher("Random House");
		if(input.equalsIgnoreCase("I"))
		{
		
			
			
			Book fictionBook2 = fictionFactory.createBook("FICTION");
			//hard code book info using setters
			fictionBook2.setBookTitle("Murder on the Orient Express");
			fictionBook2.setAuthor("Agatha Christie");
			fictionBook2.setPublisher("Penguin");
			
			Book fictionBook3 = fictionFactory.createBook("FICTION");
			//hard code book info using setters
			fictionBook3.setBookTitle("The Hobbit");
			fictionBook3.setAuthor("JRR Tolkien");
			fictionBook3.setPublisher("Houghton Mifflin Company");
			
			Book fictionBook4 = fictionFactory.createBook("FICTION");
			//hard code book info using setters
			fictionBook4.setBookTitle("The Lord of the Rings Trilogy");
			fictionBook4.setAuthor("JRR Tolkien");
			fictionBook4.setPublisher("Houghton Mifflin Company");
			
			//create book list
			//add books to list
			List<Book> books = new ArrayList<Book>();
			books.add(fictionBook);
			books.add(fictionBook2);
			books.add(fictionBook3);
			books.add(fictionBook4);
			
			//create FictionBooklist from iterator package
			FictionBookList bookRepository = new FictionBookList(books);
			//use iterator design pattern to iterate through booklist
			//print name of books and details
			System.out.println("Iterator Demo showing a list of books.\nThe Iterator Design pattern is being used to iterate through the list.");
			System.out.println("Fiction Book list: ");
			for(ParentIterator iter = bookRepository.getIterator(); iter.hasNext();){
		         Book name = (Book)iter.next();
		         System.out.println(" Title : " + name.getBookTitle() + ", Author: " + name.getAuthor() + ", Publisher: " + name.getPublisher());
		      } 
		}
		//************OBSERVER PATTERN**********
		else if (input.equalsIgnoreCase("O"))
		{
			System.out.println("Observer Design Pattern Demo\nUsed to warn when inventory is low");
			 Music music = new Music("Fleetwood Mac", "Rock");
				StoreRoomObserver store = new StoreRoomObserver(music);
				music.setLowStock(true);
		}
		//**********COMMAND PATTERN**************
		else if(input.equalsIgnoreCase("C"))
		{
			System.out.println("Command Design Pattern Demo\nUsed to order inventory");
				InventoryOrders inOrder = new InventoryOrders(fictionBook);
				BookOrder bookOrder = new BookOrder(inOrder);
				OrderAgent orderAgent = new OrderAgent();
				orderAgent.takeOrder(bookOrder);
				orderAgent.placeOrders();
		}
		
		
		
		
		
		//OLDER WEEK2
		/*	//prompt for string input
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
			}*/
		}
	}


