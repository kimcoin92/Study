package com.queue.teacher;

public class Queue {
	public static final int DEFAULT_SIZE = 5;
	
	private int[] frame;		// queue의 배열
	private int size;			// queue frame의 크기
	private int rear;			// enqueue를 위한 위치정보
	private int front;			// dequeue를 위한 위치정보
	private int count;			// queue에 들어있는 data count
	
	public Queue()
	{
		size = DEFAULT_SIZE;
		frame = new int[size];
		rear = 0;
		front = 0;
		count = 0;
		
	}
	
	
	public Queue(int _size)
	{
		size = _size;
		frame = new int[size];
		rear = 0;
		front = 0;		
		count = 0;
		
	}
	
	public int getSize()
	{
		return size;
		
	}
	
	public int getCount()
	{
		return count;
		
	}
	
	private boolean	isFull()
	{
		if (count == size)
			return true;
		
		return false;
		
	}
	
	private boolean	isEmpty()
	{
		if (count == 0)
			return true;
		
		return false;
	
	}
	
	public boolean enqueue(int _data)
	{
		if (isFull())
			return false;
		
		//데이터를 넣어준다.
		rear = rear % size;
		frame[rear] = _data;
		
		rear++;
		count++;
		
		return true;
	}
	
	
	public int dequeue()
	{
		int result;
		if (isEmpty())
			return Integer.MIN_VALUE;
		
		front = front % size;
		result = frame[front];
		
		front++;
		count--;
		return result;
		
	}
		
	public void printAll()
	{
		int idx = 0;		
		idx = rear - 1;
		
		for (int i = 0; i < count; i++)
		{
			System.out.println(frame[idx - i]);
			
		}
		
	}
	
	public String toString()
	{
		// 추후에 queue의 내용을 덤프하는 문자열로 교체.
		return getClass().getName();
	}
	
}
