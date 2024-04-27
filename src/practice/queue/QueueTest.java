package practice.queue;

public class QueueTest {

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);
		System.out.println(q.queue.length);
		q.enqueue(11);
		System.out.println(q.queue.length);
		MyQueue q2 = new MyQueue();
		q2.enqueue(1);
		q2.enqueue(2);
		q2.enqueue(3);
		q2.isEmpty();
		System.out.println(q2.dequeue());
		q2.isEmpty();
		System.out.println(q2.dequeue());
		q2.isEmpty();
		System.out.println(q2.dequeue());
		q2.isEmpty();
	}

}
