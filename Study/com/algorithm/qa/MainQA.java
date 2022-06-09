package com.algorithm.qa;

public class MainQA {

	public static void main(String[] args) {
		
		int data;
		
		AlgoQAt a = new AlgoQAt();
		
		a.enqueue(11);
		a.enqueue(22);
		a.enqueue(33);
		
		data = a.dequeue();
		data = a.dequeue();
		data = a.dequeue();
		
		data = a.dequeue();
		
		System.out.println(data);

	}

}
