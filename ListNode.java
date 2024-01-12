package program12;

public class ListNode 
{
	private Object element;
	private ListNode next;
	
	public ListNode(Object e, ListNode n)
	{
		element = e;
		next = n;
	}
	
	public Object getElement() { return element; }
	
	public ListNode getNext() { return next; }
	
	public void setElement(Object e) { element = e; }
	
	public void setNext(ListNode n) { next = n; }
	
	public String toString()
	{
		return element.toString();
	}
	
	public boolean equals(Object e)
	{
		return element.equals(e);
	}
}
