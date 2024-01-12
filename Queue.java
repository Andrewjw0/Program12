package program12;

public interface Queue 
{
	boolean isEmpty();
	Object dequeue();
	Object enqueue(Object e);
	Object getBack();
	Object getFront();
}
