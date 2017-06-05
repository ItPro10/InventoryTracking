package Iterator;

import java.util.ArrayList;
import java.util.List;

import InventoryTracking.Book;

/*
 * This is console demo to show the use of the iterator pattern 
 * by Nalinie Nybo
 * Assignment 4 - MET CS 665 
 */

//fiction book list class
public class FictionBookList implements BookList{
	//declare instance variables
	public List<Book> bookList =  new ArrayList<Book>();

	//constructor
	public FictionBookList(List<Book> books)
	{
		this.bookList = books;
	}
	//returns aggregate object
	@Override
	public ParentIterator getIterator() {
		return new BookIterator();
	}

	//BookIterator class as an aggregate of FictionBookList
	private class BookIterator implements ParentIterator{
		//declare variables
		int index;
		//has next method
		//determine if list has more items
		@Override
		public boolean hasNext() {
			if(index < bookList.size()){  //if(index < names.length){
				return true;
			}
			return false;

		}
		//return next item in list
		@Override
		public Object next() {
			if(this.hasNext()){
				return bookList.get(index++);   // return names[index++];
			}
			return null;
		}
	}
}
