package program12;

/**
 * Group: Logan Yeager, Andrew Wang, Sophie Byron, Dylan Peel
 * Class: AP CSA 3rd hour
 * Date:  1/17/2024
 * Descr: ListNode is a single object that "holds" another object with Object element.
 *        It also has a field variable ListNode next, which is the next in the sequence.
 *        ListNode will be used in LinkedList, a class that uses multiple ListNodes.
 */
public class ListNode 
{
	private Object element;   // field variable, what node "holds"
	private ListNode next;    // field variable, next node in sequence

	/**
 	 * Constructor method for empty node
         */
	public ListNode()
	{
		element = null;
		next    = null;
	}
	
	/**
	 * Main constructor method, parameters for both field variables
	 */
	public ListNode(Object e, ListNode n)
	{
		element = e;
		next = n;
	}

	// getElement() returns object inside node
	public Object getElement() { return element; }

	// getNext() returns the next node in the sequence
	public ListNode getNext() { return next; }

	// setElement will change what this node is holding
	public void setElement(Object e) { element = e; }

	// setNext will give this node a next node
	public void setNext(ListNode n) { next = n; }

	/**
	 * toString() will return a String of the element
	 */
	public String toString()
	{
		return element.toString();
	}

	/**
	 * equals will return a boolean 
	 * true if this and another node have the same element
	 * false if otherwise
	 */
	public boolean equals(Object e)
	{
		return element.equals(e);
	}
}
