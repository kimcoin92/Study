package com.algorithm.my.queue;

import java.util.Arrays;

public class Queue {

	public static final int DEFAULT_SIZE        = 10;
	public static final int ERROR_FULL          = 0;
	public static final int ERROR_EMPTY         = Integer.MIN_VALUE;
	public static final int ERROR_INVAILD       = Integer.MAX_VALUE;
	public static final int SUCCESS_INSERT      = 1;
	public static final int INITIALIZE_POINTER = -1;
	public static final int FRAME_CLEAR = 0;
	
	private int[]           frame;
	private int             front;
	private int             rear;
	private int             size;
	private int             amount;

//  생성자
	
	public Queue()
	{
		this(Queue.DEFAULT_SIZE);
	}
	
	public Queue(int _size)
	{
		amount   = 0;
		front   = INITIALIZE_POINTER;
		rear    = INITIALIZE_POINTER;
		size    = _size;
		frame   = new int[_size];
	}
	
	public int getSize()
	{
		return size;
	}
	
	public int getAmount()
	{
		return amount;
	}
	
	public int getFront()
	{
		return front;
	}
	
	public int getRear()
	{
		return rear;
	}
	
	private boolean isFull()
	{
		if(size == getAmount())
			
			return true;
		
			return false;
	}
	
	private boolean isEmpty()
	{
		if(0 == getAmount())
			
			return true;
		
			return false;
	}
	
	public int enqueue(int _data)
	{
		if(isFull())
			
			return ERROR_FULL;
		
		if((_data == ERROR_EMPTY) || (_data == ERROR_INVAILD))
			
			return ERROR_INVAILD;

		rear = (rear + 1) % size;

		frame[rear] = _data;
		
		amount++;
		
		return SUCCESS_INSERT;
	}
	
	public int dequeue()
	{
		int result = 0;
		
		if (isEmpty())
			
			return ERROR_EMPTY;
		
		front = (front + 1) % size;
		
		result = frame[front];

		frame[front] = FRAME_CLEAR;
		
		amount--;
		
		if (isEmpty())
		{
			front = INITIALIZE_POINTER;
			rear  = INITIALIZE_POINTER;
		}

		return result;
	}
	
	public String getPrint()
	{
		String message = new String();
		
		message = 
		"Size             : " + getSize() + "\n" +
		"Amount           : " + getAmount() + "\n" +
		"Front Position   : " + getFront() + "\n" +
		"Rear Position    : " + getRear() + "\n" +
		"Array Inspection : " + Arrays.toString(frame) + "\n";
		
		return message;
	}
}