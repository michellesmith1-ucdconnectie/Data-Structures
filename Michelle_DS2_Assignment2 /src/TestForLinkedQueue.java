

public class TestForLinkedQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // declaring a object and calling it methods
		LinkedQueue q=new LinkedQueue();
		System.out.println(q);
		q.enqueue("R");
		System.out.println(q);
		q.enqueue("E");
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		q.enqueue("M");
		System.out.println(q);
		q.enqueue("H");
		System.out.println(q);
		q.enqueue("E");
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		q.enqueue("L");
		System.out.println(q);
		q.enqueue("L");
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		q.enqueue("O");
		System.out.println(q);
	}

}
