package CompositePattern;
/*
 * This is console demo to show the use of the different design patterns. 
 * by Nalinie Nybo
 * Assignment 3 - MET CS 665 
 */
//Composite Design Pattern
public abstract class Employee {
	//declare variables
	String name = "";
	String title = "";

	//constructor
	//pass name and title
	public Employee(String name, String title)
	{
		this.name = name;
		this.title = title;
	}

	//display details
	public void getDetails()
	{
		System.out.println(title + ": " + name);
	}

}
