package program12;

public class StackList implements Stack 
{
	private LinkedList list = new LinkedList();
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public Object push(Object e)
	{
		list.addFront(e);
		return e;
	}
	
	public Object pop()
	{
		return list.getFront();
	}
	
	public Object peek() 
	{
		Object temp = list.getFront();
		list.addFront(temp);
		return temp;
	}
	
	public int search(Object e)
	{
		int index = 1;
		ListNode temp = (ListNode) peek();
		
		while (temp != null)
		{
			if (temp.getElement().equals(e)) return index;
			temp = temp.getNext();
			index++;
		}
		
		return -1;
	}
	
	public String toString()
	{
		String t = "StackList: ";
		
		if (isEmpty()) return t;
		
		ListNode temp = (ListNode) peek();
		
		while (temp.getNext() != null)
		{
			t += temp.getElement() + "->";
			temp = temp.getNext();
		}
		
		t += temp.getElement();
		
		return t;
	}
}
