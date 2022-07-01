package com.linkedlist.teacher.forth;

public class LinkedList
{
	public static void main(String[] args)
	{
		Queue que = new Queue();
		
		que.enqueue(1, "a");
		
		que.enqueue(11, "aa");
		que.enqueue(22, "bb");
		que.enqueue(33, "cc");
		
		que.printAll();
		
		int size = que.size();
		
		for (int i = 0; i < size; i++)
		{
			que.dequeue();
		}
		System.out.println("que size : " + que.size());
	}
}
