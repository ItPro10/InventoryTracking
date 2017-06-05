package Observer;
/*
 * This is console demo to show the use of the observer pattern 
 * by Nalinie Nybo
 * Assignment 4 - MET CS 665 
 */
//base class for other items such as music
public interface OtherItemsObservable {
	//add observer
	public void addObserver(Observer o);
	//remove observer
	public void removeObserver(Observer o);
	//used to notify the observer on state change
	public void notifyObserver();
}
