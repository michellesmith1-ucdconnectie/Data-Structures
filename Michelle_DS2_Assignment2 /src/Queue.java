

public interface Queue<T> {
	public void enqueue(T object); //adding elements to the queue
	public T dequeue(); //removing elements from the queue
	public T front(); //returning what the front element is
	
	public int size(); // returning the size of the queue
	public boolean isEmpty();//checking if the queue is empty
}
