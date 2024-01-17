package program12;

public class Drive
{
	/**
	 * Tests the push and toString methods on StackList, and tests the enqueue and toString methods on QueueList.
	 */
	public static void main(String a[]) 
	{
		StackList myStackList = new StackList();
		QueueList myQueueList = new QueueList();
		
		myStackList.push("Bill");
		myStackList.push("Fred");
		myStackList.push("Joe");
		myStackList.push("Henrietta");
		myStackList.push("Mr. M");
		myStackList.push("Noman");
		System.out.println(myStackList.toString());
		
		myQueueList.enqueue("Bill");
		myQueueList.enqueue("Fred");
		myQueueList.enqueue("Joe");
		myQueueList.enqueue("Henrietta");
		myQueueList.enqueue("Mr. M");
		myQueueList.enqueue("Noman");
		System.out.println(myQueueList.toString());
	}
}
