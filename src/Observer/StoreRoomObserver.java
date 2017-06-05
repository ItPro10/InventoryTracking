package Observer;
/*
 * This is console demo to show the use of the observer pattern 
 * by Nalinie Nybo
 * Assignment 4 - MET CS 665 
 */

//class that observes music
//sends out update
public class StoreRoomObserver extends Observer{


	//constructor
	//add observer to music object
	public StoreRoomObserver(Music music)
	{
		this.music = music;
		this.music.addObserver(this);
	}

	//update method
	@Override
	public void update() {
		OrderStock();
	}

	//method to unsubscribe
	public void unsubscribe()
	{
		this.music.removeObserver(this);
	}

	//display warning about low stock levels
	public void OrderStock()
	{
		System.out.println("Warning!\n Please order stock due to low inventory levels.");
		System.out.println(" Low stock: " + music.getGroupName() + ", " + music.getGenre());
	}

}
