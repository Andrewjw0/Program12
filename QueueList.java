package program12;

public class QueueList implements Queue 
{
	private LinkedList list = new LinkedList();
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public Object dequeue()
	{
		if (isEmpty()) return null;
		
		ListNode temp = (ListNode) getFront();
		
		while (temp.getNext().getNext() != null)
		{
			temp = temp.getNext();
		}
		
		ListNode returner = temp.getNext();
		temp.setNext(null);
		
		return returner;
	}
	
	public Object enqueue(Object e)
	{
		list.addFront(e);
		return null;
	}
	
	public Object getBack()
	{
		Object temp = list.getBack();
		list.addBack(temp);
		return temp;
	}
	
	public Object getFront()
	{
		Object temp = list.getFront();
		list.addFront(temp);
		return temp;
	}
	
	public String toString()
	{
		String t = "QueueList: ";
		
		if (isEmpty()) return t;
		
		ListNode temp = (ListNode) getFront();
		
		while (temp.getNext() != null)
		{
			t += temp.getElement() + "->";
			temp = temp.getNext();
		}
		
		t += temp.getElement();
		
		return t;
	}
}
