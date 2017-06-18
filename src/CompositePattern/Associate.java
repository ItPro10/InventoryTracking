package CompositePattern;
/*
 * This is console demo to show the use of the different design patterns. 
 * by Nalinie Nybo
 * Assignment 3 - MET CS 665 
 */
//Composite Design Pattern
public class Associate extends Employee{

	//constructor
	//call super
	//pass parameters
	public Associate(String name, String title)
	{
		super(name, title);
	}
	//display details
	public void getDetails()
	{
		System.out.println(title + ": " + name);
	}

}
