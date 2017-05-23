package InventoryTracking;
/*
 * This is console demo to show the use of the abstract factory pattern 
 * to create non-fiction and fiction objects of type movie and book.
 * by Nalinie Nybo
 * Assignment 2 - MET CS 665 
 */

//set up class that creates the concrete factories 
public class InventorySetup {

	public static AbstractFactoryStoreInventory getConcreteFactory(String choice)
	{
		//create fiction factory
		if(choice.equalsIgnoreCase("FICTION")){
			return new FictionFactory();
		//create non-fiction factory
		}else if(choice.equalsIgnoreCase("NONFICTION")){
			return new NonFictionFactory();
		}

		return null;

	}

}
