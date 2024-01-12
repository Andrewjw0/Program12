package program12;

public class Drive
{
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
		
//		testStackList();
//		testQueueList();
	}
	
	private static void testStackList()
	{
		StackList myStackList = new StackList();
		
		myStackList.push("One");
		myStackList.push("Two");
		myStackList.push("Three");
		System.out.println(myStackList.toString());
		System.out.println(myStackList.search("One"));
		System.out.println(myStackList.search("Two"));
		System.out.println(myStackList.search("Three"));
		System.out.println(myStackList.search("Not in list"));
		myStackList.pop();
		System.out.println(myStackList.toString());
		System.out.println(myStackList.peek());
	}
	
	private static void testQueueList()
	{
		QueueList myQueueList = new QueueList();
		
		myQueueList.enqueue("One");
		myQueueList.enqueue("Two");
		myQueueList.enqueue("Three");
		System.out.println(myQueueList.toString());
		myQueueList.dequeue();
		System.out.println(myQueueList.toString());
	}
}