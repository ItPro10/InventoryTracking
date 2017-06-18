package CompositePattern;

import java.util.ArrayList;
import java.util.List;
/*
 * This is console demo to show the use of the different design patterns. 
 * by Nalinie Nybo
 * Assignment 3 - MET CS 665 
 */
//Composite Design Pattern
public class Supervisor extends Employee {
	//declare instance variables
	List<Employee> employees;

	//constructor
	//call super
	//pass parameters
	public Supervisor(String name, String title)
	{
		super(name, title);
		employees = new ArrayList<Employee>();
	}

	//add employee 
	//this is the list of employees the supervisor manages
	public void add(Employee employee) {
		employees.add(employee);
	}

	//display list details
	public void getDetails()
	{
		System.out.println(title + ": " + name);
		//loop through list
		for(Employee e : employees)
		{
			e.getDetails();
		}
	}
}
