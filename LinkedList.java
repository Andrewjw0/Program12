package program12;

/**
 * Group: Logan Yeager, Andrew Wang, Sophie Byron, Dylan ?
 * Class: AP CSA 3rd hour
 * Date:  1/17/2024
 * Descr: LinkedList has a field variable ListNode start.
 *        This class uses this first node to hold others 
 *        by calling start's get and set methods.
 */
public class LinkedList 
{
	private ListNode start;  // first node in list

	/**
	 * isEmpty() returns a boolean.
	 * if start == null, that means the list has to be empty.
	 */
	public boolean isEmpty()
	{
		return start == null;
	}

	/**
	 * getFront() will return and delete the first node in the list.
	 * It uses a temporary node and sets start to its own next node.
	 */
	public Object getFront()
	{
		if (isEmpty()) return null;
		
		Object temp = start;
		start = start.getNext();
		return temp;
	}

	/**
	 * getBack returns and deletes the last node in the list.
	 * It uses a temporary node and cycles through until temp's next's next is null.
	 * It makes another node, last, which is after temp, which is now second to last.
	 * It sets temp's next to null, removing last from the list, and returns last.
	 */
	public Object getBack()
	{
		if (isEmpty()) return null;
		
		ListNode temp = start;
		
		while (temp.getNext().getNext() != null)
		{
			temp = temp.getNext();
		}
		
		Object last = temp.getNext();
		temp.setNext(null);
		
		return last;
	}

	/**
	 * addFront() pushes a new node into the list.
	 */
	public void addFront(Object e)
	{
		start = new ListNode(e, start);
	}

	/**
	 * addBack() adds a node to the back with the help of a temporary node.
	 */
	public void addBack(Object e)
	{
		ListNode temp = start;
		
		while (temp.getNext() != null)
		{
			temp = temp.getNext();
		}
		
		temp.setNext(new ListNode(e, null));
	}

	/**
	 * toString() will return a String describing the list.
	 * A temporary node sccles through the list.
	 * It adds that node's element to a String.
	 * When the temporary node is done cycling, the String is returned.
	 */
	public String toString()
	{
		String t = "LinkedList: ";
		
		if (isEmpty()) return t;
		
		ListNode temp = start;
		
		while (temp.getNext() != null)
		{
			t += temp.getElement() + "->";
			temp = temp.getNext();
		}
		
		t += temp.getElement();
		
		return t;
	}
}
