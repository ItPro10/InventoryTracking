package Observer;
/*
 * This is console demo to show the use of the observer pattern 
 * by Nalinie Nybo
 * Assignment 4 - MET CS 665 
 */
import java.util.ArrayList;

//class being observed
public class Music implements OtherItemsObservable {
	//declare private instance variables
	private ArrayList<Observer> storeRoom = new ArrayList<Observer>();
	private boolean lowStock = false;
	private String groupName;
	private String genre;


	//constructor
	public Music(String name, String genre)
	{
		this.groupName = name;
		this.genre = genre;
	}

	//setters
	//calls notify observer if stock is low
	public void setLowStock(boolean lowStock)
	{
		this.lowStock = lowStock;
		if(this.lowStock)
		{
			notifyObserver();
		}
	}
	public void setGroupTitle(String name)
	{
		this.groupName = name;
	}
	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	//getters
	public boolean getLowStock()
	{
		return lowStock;
	}
	public String getGroupName()
	{
		return groupName;
	}
	public String getGenre()
	{
		return genre;
	}
	
	//add observer
	@Override
	public void addObserver(Observer o) {
		storeRoom.add(o);
	}
	//remove observer
	@Override
	public void removeObserver(Observer o) {
		storeRoom.remove(o);
	}

	// notify observer
	@Override
	public void notifyObserver() {
		// for each observer
		// call update
		for (Observer obs : storeRoom) {
			obs.update();
		}
	}

}
