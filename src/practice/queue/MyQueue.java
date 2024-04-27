package practice.queue;

public class MyQueue implements Queue {
	int[] queue;
	int size;
	final int ADD_SIZE = 10;
	
	public MyQueue() {
		size += ADD_SIZE;
		queue = new int[size];
	}

	@Override
	public int dequeue() {
		if (queue[0] == 0) {
			System.out.println("큐가 비어있음");
		}
		int dequeue = queue[0];
		for (int i = 1; i < queue.length; i++) {
			queue[i - 1] = queue[i];
		}
		queue[size - 1] = 0;
		return dequeue;
	}

	@Override
	public void enqueue(int data) {
		for (int i = 0; i < queue.length; i++) {
			if (queue[i] == 0) {
				queue[i] = data;
				return;
			}
		}
		addQueue();
		queue[size - ADD_SIZE] = data;
	}

	@Override
	public boolean isEmpty() {
		for (int i = 0; i < queue.length; i++) {
			if (queue[i] == 0) {
				System.out.println("큐에 빈공간이" + (queue.length - i) + "개 있음");
				return true;
			}
		}
		System.out.println("큐가 가득참");
		return false;
	}

	private void addQueue() {
		int[] tempQueue = new int[size];
		for (int i = 0; i < queue.length; i++) {
			tempQueue[i] = queue[i];
		}
		queue = new int[size + ADD_SIZE];
		size += ADD_SIZE;
		for (int i = 0; i < tempQueue.length; i++) {
			queue[i] = tempQueue[i];
		}
	}

}
