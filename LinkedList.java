package program12;

public class LinkedList 
{
	private ListNode start; 
	
	public boolean isEmpty()
	{
		return start == null;
	}
	
	public Object getFront()
	{
		if (isEmpty()) return null;
		
		Object temp = start;
		start = start.getNext();
		return temp;
	}
	
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
	
	public void addFront(Object e)
	{
		start = new ListNode(e, start);
	}
	
	public void addBack(Object e)
	{
		ListNode temp = start;
		
		while (temp.getNext() != null)
		{
			temp = temp.getNext();
		}
		
		temp.setNext(new ListNode(e, null));
	}
	
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
