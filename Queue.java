package program12;

public interface Queue 
{
	//This method tests whether a list is empty or not.
	boolean isEmpty();

	//returns an object, will get the next element in the list.
	Object dequeue();

	//returns an object, will add an element to the front of the list.
	Object enqueue(Object e);

	//returns an object, will get an element from the back of the list.
	Object getBack();

	//returns and object, will get an element from the front of the list.
	Object getFront();
}
