package qua.base;

public class QueueIndex {

	public static void main(String[] args) {
		
		int data;
		
		QueueExample a = new QueueExample();
		
		a.enqueue(11);
		a.enqueue(22);
		a.enqueue(33);
		
		data = a.dequeue();
		data = a.dequeue();
		data = a.dequeue();
		
		data = a.dequeue();

	}

}
