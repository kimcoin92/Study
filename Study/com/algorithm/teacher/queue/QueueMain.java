package com.algorithm.teacher.queue;

public class QueueMain {

	public static void main(String[] args) {
		
		int data;
		
		Queue a = new Queue();
		
		a.enqueue(11);
		a.enqueue(22);
		a.enqueue(33);
		a.enqueue(44);
		a.enqueue(55);
		a.enqueue(66);
		
		a.printAll();

	}

}
