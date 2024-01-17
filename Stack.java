package program12;

public interface Stack 
{
	//This method tests whether a list is empty or not
	boolean isEmpty();

	//returns an object, adds an element to the front of the list.
	Object push(Object e);	

	//returns an object, gets an element from the front of the list.
	Object pop();		

	//returns an object, gets an element from the front of the list and adds the element to the front of the list.
	Object peek();		

	//returns an int,
	int search(Object e);	
}
