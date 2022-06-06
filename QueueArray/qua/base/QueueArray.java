package qua.base;

import java.util.Arrays;

public class QueueArray {

	public static void main(String[] args)
	{
		int idx = 1;
		
		QueueArray object = new QueueArray();
		
		for (int i = 0; i < 5; i++)
		{
			object.enqueue(idx);
			
			idx++;
		}
		
		System.out.println("5°³ »ðÀÔ : \n" + object.getPrint());
		
		for (int j = 0; j < 4; j++)
		{
			object.dequeue();
		}
		
		System.out.println("4°³ ÀÎÃâ : \n" + object.getPrint());
		
		for (int i = 0; i < 5; i++)
		{
			object.enqueue(idx);
			
			idx++;
		}
		
		System.out.println("5°³ »ðÀÔ : \n" + object.getPrint());
		
		for (int j = 0; j < 4; j++)
		{
			object.dequeue();
		}
		
		System.out.println("4°³ ÀÎÃâ : \n" + object.getPrint());
		
		for (int i = 0; i < 5; i++)
		{
			object.enqueue(idx);
			
			idx++;
		}
		
		System.out.println("5°³ »ðÀÔ : \n" + object.getPrint());
		
		for (int i = 0; i < 5; i++)
		{
			object.enqueue(idx);
			
			idx++;
		}
		
		System.out.println("5°³ »ðÀÔ : \n" + object.getPrint());
		
		for (int j = 0; j < 4; j++)
		{
			object.dequeue();
		}
		
		System.out.println("4°³ ÀÎÃâ : \n" + object.getPrint());
	}
		
	public static final int DEFAULT_SIZE        = 10;
	public static final int ERROR_FULL          = 0;
	public static final int ERROR_EMPTY         = Integer.MIN_VALUE;
	public static final int ERROR_INVAILD       = Integer.MAX_VALUE;
	public static final int SUCCESS_INSERT      = 1;
	public static final int INITIALIZED_POINTER = -1;
	
	private int[]           frame;
	private int             front;
	private int             rear;
	private int             size;
	private int             amount;
	
	public QueueArray()
	{
		this(QueueArray.DEFAULT_SIZE);
	}
	
	public QueueArray(int _size)
	{
		amount   = 0;
		front   = INITIALIZED_POINTER;
		rear    = INITIALIZED_POINTER;
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

//	public boolean resize()
//	{
//		if (getFront() == getRear())
//
//		return true;
//
//		return false;
//	}
	
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

		front = (front + 1) % size;

		frame[front] = _data;
		
		amount++;
		
		return SUCCESS_INSERT;
	}
	
	public int dequeue()
	{
		int result = 0;
		
		if (isEmpty())
			
			return ERROR_EMPTY;
		
		rear = (rear + 1) % size;
		
		result = frame[rear];

		frame[rear] = 0;
		
		amount--;

//		if (resize())
//		{
//			front = INITIALIZED_POINTER;
//			rear  = INITIALIZED_POINTER;
//		}

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