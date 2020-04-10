


public class LinkedQueue<T> implements Queue<T>{
	
	 //The reference to the first node in the queue
	 
	private Node<T> front;
	private Node<T> rear;
	
	 //The number of elements stored in the queue
	 
	private int size;

	@Override
	public void enqueue(T object) {
    
		Node newNode = new Node(object, null);
		if(isEmpty())
		{
			front=newNode;
			rear=newNode;
		}
		else{
			rear.next=newNode;
			rear=newNode;
		}
		size++;
	}

	@Override
	public T dequeue() { //removing the front element
    
		if(isEmpty()) throw new QueueEmptyException();
		Node node=front;
		front=front.next;
		node.next=null;
		size--;
		return (T) node.element;
	}

	@Override
	public T front() {
		// returning the front element
		return front.element;
	}

	@Override
	public int size() {
		// returning the size of the queue
		return size;
	}

	@Override
	public boolean isEmpty() {
		
		return size==0;
	}

    //Node class to implement the node 
	private static class Node<T> {
		T element;
		Node<T> next;
		
		Node(T element, Node<T> next) {
			this.element = element;
			this.next = next;
		}
	}
	
	//This method is returning queue as a string
	public String toString() {
		StringBuffer buf = new StringBuffer();
		Node<T> cur = front;
		buf.append(size+" : ");
		while (cur != null) {
			buf.append(cur.element).append(" ");
			cur = cur.next;
		}
		return buf.toString();
	}

}
