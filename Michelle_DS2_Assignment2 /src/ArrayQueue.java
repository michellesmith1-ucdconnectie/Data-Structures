


public class ArrayQueue<T> implements Queue<T> {
	private T[] array;
	private int rear;
	private int front;
	private int N;

	@Override
	public void enqueue(T object) {
		
		if (size() == (N-1)) throw new QueueFullException(); //It throws out an exception if the capacity is nore than N can manage
		array[rear]=object;
		rear=(rear+1)%N;//extending the elements of the array
		
	}

	@Override
	public T dequeue() {
		
		if(isEmpty()) throw new QueueEmptyException();//if the array is empty then throw an exception
		T e=array[front]; //
		array[front]=null; //the front object is empty in the array
		front=(front+1)%N; //
		
		return e;
	}

	@Override
	public T front() {
		
		return array[front];
	}

	@Override
	public int size() {
    
		return (N+rear-front)%N;
	}

	@Override
	public boolean isEmpty() {
		
		return size()==0;
	}

	public ArrayQueue()
	{
		this(10);
		N=10;
		front=0;
		rear=0;
	}
	public ArrayQueue(int capacity)
	{
		array = (T[]) new Object[capacity];
		rear=0;
		front=0;
		N=capacity;//N is the size the array can hold
	}
    // Method to return queue as string
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append(size()+" / "+N+" : ");
		for (int i=0;i<array.length;i++) {
			if(array[i]!=null)
			{
				buf.append(array[i]).append(" ");	}
			
		}
		return buf.toString();
	}
}
