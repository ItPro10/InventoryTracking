package Iterator;
/*
 * This is console demo to show the use of the iterator pattern 
 * by Nalinie Nybo
 * Assignment 4 - MET CS 665 
 */
//base class for iterator
public interface ParentIterator {
	//has next
	public boolean hasNext();
	//next
	public Object next();

}
