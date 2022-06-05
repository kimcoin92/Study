package qua.base;

import java.util.Arrays;

public class Queue {
		
	public static final int DEFAULT_QUEUE_SIZE   = 5;
	public static final int ERROR_QUEUE_FULL     = 0;
	public static final int ERROR_QUEUE_EMPTY    = Integer.MIN_VALUE;
	public static final int ERROR_QUEUE_INVAILD  = Integer.MAX_VALUE;
	public static final int SUCCESS_QUEUE_INSERT = 1;
	
	private int[]           frame;
	private int             enqueue;
	private int             dequeue;
	private int             size;
	private int             count;
	
	public Queue()
	{
		this(Queue.DEFAULT_QUEUE_SIZE);
	}
	
	public Queue(int _size)
	{
		count   = 0;
		enqueue = 0;
		size    = _size;
		frame   = new int[_size];
	}
	
	public int getSize()
	{
		return size;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public int getenqueue()
	{
		return enqueue;
	}
	
	public int getdequeue()
	{
		return dequeue;
	}
	
	public String getFrame()
	{
		return Arrays.toString(frame);
	}
	
	private boolean isFull()
	{
		if(size == getCount())
			
			return true;
		
			return false;
	}
	
	private boolean isEmpty()
	{
		if(0 == getCount())
			
			return true;
		
			return false;
			
	}
	
	public int push(int _data)
	{
		if(isFull())
			
			return ERROR_QUEUE_FULL;
		
		if((_data == ERROR_QUEUE_EMPTY) || (_data == ERROR_QUEUE_INVAILD))
			
			return ERROR_QUEUE_INVAILD;
		
		frame[enqueue] = _data;
		
		enqueue = (enqueue + 1) % size;
		
		count++;
		
		return SUCCESS_QUEUE_INSERT;
	}
	
	public int pop()
	{
		int result = 0;
		
		if (isEmpty())
			
			return ERROR_QUEUE_EMPTY;
		
		result = frame[enqueue];
		
		dequeue = (dequeue + 1) % size;
		
		count--;
		
		return result;
	}

}

