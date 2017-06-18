package InventoryTracking;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Command.BookOrder;
import Command.InventoryOrders;
import Command.OrderAgent;
import CompositePattern.Associate;
import CompositePattern.Supervisor;
import Iterator.FictionBookList;
import Iterator.ListIterator;
import Observer.Music;
import Observer.StoreRoomObserver;
import Singleton.DataAccess;

/*
 * This is console demo to show the use of several design patterns 
 * such as Abstract Factory, Singleton, Composite, Iterator,
 * Observer and Command.
 * by Nalinie Nybo
 * Assignment 6 - MET CS 665 
 * 06/17/2017
 */
/*
 * PROMPTS - Week 6
 * This class prompts the user for input
 * 1. User can select A to see a demo of adding an item
 * 2. User can select E to see a demo of editing an item
 * 3. User can select V to see a demo of viewing a list of items
 * 4. User can select O to see a demo of ordering an item
 * 5. User can select L to see a demo of viewing low inventory levels
 * 6. User can select C to see a demo of viewing an organization chart
 * 7. User can select D to see a demo of the data access 
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
		//get which demo to perform
		String input = JOptionPane.showInputDialog("Enter A to add an inventory item, E to edit an inventory item , V to view a list of items, O to order an item, L for low levels, C to see an org chart, D to see a data access demo: ");

		//create books using abstract factory pattern
		//declare concrete factory of type abstract factory (parent class)
		AbstractFactoryStoreInventory fictionFactory = null;

		//using the InventorySetup class to initialize
		//and return the concrete FICTION factory object
		fictionFactory = InventorySetup.getConcreteFactory("FICTION");
		
		//create an object of Book Fiction
		//using factory
		Book fictionBook = fictionFactory.createBook("FICTION");
		
		//***********ADD AN ITEM**************
		if(input.equalsIgnoreCase("A"))
		{
			//prompt for more input
			String type = JOptionPane.showInputDialog("Enter inventory type: ");
			String name = JOptionPane.showInputDialog("Enter name of book: ");
			String author = JOptionPane.showInputDialog("Enter author of book: ");
			String publisher = JOptionPane.showInputDialog("Enter publisher of book: ");
			String quantity = JOptionPane.showInputDialog("Enter quantity of book: ");
			//set book info using setters
			fictionBook.setBookTitle(name);
			fictionBook.setAuthor(author);
			fictionBook.setPublisher(publisher);
			fictionBook.SetQuantity(Integer.parseInt(quantity));
			System.out.println("Demo showing adding a fiction book item.\nThe Abstract Factory pattern is being used to create the object.");
			System.out.println(fictionBook);
		}
		//**********EDIT AN ITEM**************
		else if(input.equalsIgnoreCase("E"))
		{
			//prompt for value to update quantity
			String input2 = JOptionPane.showInputDialog("Enter new quantity value to update item to: ");
			System.out.println("Original item values: ");
			Book product = new FictionBook();
			product.setBookTitle("The Hobbit");
			product.setAuthor("JRR Tolkien");
			product.setPublisher("Houghton Mifflin");
			product.SetQuantity(50);
			System.out.println(product);
		    product.SetQuantity(Integer.parseInt(input2));
		    System.out.println("Updating.... ");
			System.out.println("New item values: ");
			System.out.println(product); 
		}
		//*********VIEW LIST**************
		else if(input.equalsIgnoreCase("V"))
		{
			Book fictionBook1 = fictionFactory.createBook("FICTION");
			//hard code book info using setters
			fictionBook1.setBookTitle("The Man in the Brown Suit");
			fictionBook1.setAuthor("Agatha Christie");
			fictionBook1.setPublisher("Penguin");
			fictionBook1.SetQuantity(45);
			
			Book fictionBook2 = fictionFactory.createBook("FICTION");
			//hard code book info using setters
			fictionBook2.setBookTitle("Murder on the Orient Express");
			fictionBook2.setAuthor("Agatha Christie");
			fictionBook2.setPublisher("Penguin");
			fictionBook2.SetQuantity(55);

			Book fictionBook3 = fictionFactory.createBook("FICTION");
			//hard code book info using setters
			fictionBook3.setBookTitle("The Hobbit");
			fictionBook3.setAuthor("JRR Tolkien");
			fictionBook3.setPublisher("Houghton Mifflin Company");
			fictionBook3.SetQuantity(50);

			Book fictionBook4 = fictionFactory.createBook("FICTION");
			//hard code book info using setters
			fictionBook4.setBookTitle("The Lord of the Rings Trilogy");
			fictionBook4.setAuthor("JRR Tolkien");
			fictionBook4.setPublisher("Houghton Mifflin Company");
			fictionBook4.SetQuantity(80);

			//create book list
			//add books to list
			List<Book> books = new ArrayList<Book>();
			books.add(fictionBook1);
			books.add(fictionBook2);
			books.add(fictionBook3);
			books.add(fictionBook4);

			//create FictionBooklist from iterator package
			FictionBookList bookRepository = new FictionBookList(books);
			//use iterator design pattern to iterate through booklist
			//print name of books and details
			System.out.println("Iterator Demo showing a list of books.\nThe Iterator Design pattern is being used to iterate through the list.");
			System.out.println("Fiction Book list: ");
			for(ListIterator iter = bookRepository.getIterator(); iter.hasNext();){
				Book name = (Book)iter.next();
				System.out.println(" Title : " + name.getBookTitle() + ", Author: " + name.getAuthor() + ", Publisher: " + name.getPublisher() + ", Quantity: " + name.getQuantity());
			} 
		}

		//************OBSERVER PATTERN - LOW INVENTORY**********
		else if (input.equalsIgnoreCase("L"))
		{
			System.out.println("Observer Design Pattern Demo\nUsed to warn when inventory is low");
			Music music = new Music("Fleetwood Mac", "Rock");
			StoreRoomObserver store = new StoreRoomObserver(music);
			music.setLowStock(true);
		}
		//**********COMMAND PATTERN - ORDER ITEMS**************
		else if(input.equalsIgnoreCase("O"))
		{
			System.out.println("Command Design Pattern Demo\nUsed to order inventory");
			fictionBook.setBookTitle("Murder on the Orient Express");
			fictionBook.setAuthor("Agatha Christie");
			fictionBook.setPublisher("Penguin");
			fictionBook.SetQuantity(55);
			InventoryOrders inOrder = new InventoryOrders(fictionBook);
			BookOrder bookOrder = new BookOrder(inOrder);
			OrderAgent orderAgent = new OrderAgent();
			orderAgent.takeOrder(bookOrder);
			orderAgent.placeOrders();
		}
		//**********COMPOSITE PATTERN - VIEW ORG CHART**************
		else if(input.equalsIgnoreCase("C"))
		{
			System.out.println("Composite Design Pattern Demo\nUsed to view an organization chart");
			Associate tom = new Associate("Tom Thompson", "Associate");
			Associate john =  new Associate("John Smith", "Associate");
			Associate tim =  new Associate("Tim Tucker", "Associate");
			Supervisor jim = new Supervisor("James Kirk", "Supervisor");
			jim.add(tom);
			jim.add(john);
			jim.add(tim);
			jim.getDetails();
		}
		//**********SINGLETON PATTERN - DATA ACCESS**************
		else if(input.equalsIgnoreCase("D"))
		{
			// Singleton Pattern for data access
			//get instance
			DataAccess das = DataAccess.getInstance();
			//call methods
			//retrieve data
			das.getBookData();
			das.getMovieData();
			//insert data
			Book fictionBook3 = fictionFactory.createBook("FICTION");
			//hard code book info using setters
			fictionBook3.setBookTitle("The Hobbit");
			fictionBook3.setAuthor("JRR Tolkien");
			fictionBook3.setPublisher("Houghton Mifflin Company");
			fictionBook3.SetQuantity(50);
			das.addBookData(fictionBook3);
			das.addMovieData("Star Trek", "William Shatner");
			//edit data
			das.editBookData("Harry Potter", "JK Rowling", 30);
			das.editMovieData("Star Wars", "George Lucas", 15);
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


