/**
 * 
 * 작성자 : kimcoin92
 * 
 * 작성일 : 2022년 07월 04일
 * 
 * 제목 : 큐 (Queue)
 * 
 * 설명 : 선입선출 (FIFO : First In First Out)의 데이터 구조
 * 
 */

package com.queue;

import java.util.Arrays;

// ## 내 코드 ##

public class Queue {

	public static final int DEFAULT_SIZE       = 10;
	public static final int ERROR_FULL         = 0;
	public static final int ERROR_EMPTY        = Integer.MIN_VALUE;
	public static final int ERROR_INVAILD      = Integer.MAX_VALUE;
	public static final int SUCCESS_INSERT     = 1;
	public static final int INITIALIZE_POINTER = -1;
	public static final int FRAME_CLEAR        = 0;
	
	private int[] frame;
	private int   front;
	private int   rear;
	private int   size;
	private int   count;


	public Queue()
	{
		this(Queue.DEFAULT_SIZE);
	}
	
	public Queue(int _size)
	{
		count = 0;
		front  = INITIALIZE_POINTER;
		rear   = INITIALIZE_POINTER;
		size   = _size;
		frame  = new int[_size];
	}
	
	public int getSize()
	{
		return size;
	}
	
	public int getCount()
	{
		return count;
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
		boolean result;
		
		if(size == getCount())
		{
			result = true;
		}
		else
		{
			result = false;
		}
		
		return result;
	}
	
	private boolean isEmpty()
	{
		boolean result;
		
		if(0 == getCount())
		{
			result = true;
		}
		else
		{
			result = false;
		}
		
		return result;
	}
	
	public int enqueue(int _data)
	{
		if(isFull())
		{
			return ERROR_FULL;
		}
		
		if((_data == ERROR_EMPTY) || (_data == ERROR_INVAILD))
		{
			return ERROR_INVAILD;
		}
		
		rear = (rear + 1) % size;

		frame[rear] = _data;
		
		count++;
		
		return SUCCESS_INSERT;
	}
	
	public int dequeue()
	{
		int result = 0;
		
		if (isEmpty())
		{
			return ERROR_EMPTY;
		}
		
		front = (front + 1) % size;
		
		result = frame[front];

		frame[front] = FRAME_CLEAR;
		
		count--;
		
		if (isEmpty())
		{
			front = INITIALIZE_POINTER;
			rear  = INITIALIZE_POINTER;
		}
		return result;
	}

	@Override
	public String toString()
	{
		return "Queue ["
		     + "frame: " + Arrays.toString(frame) + ", "
			 + "size: " + size + ", "
			 + "count: " + count + ", "
			 + "front: " + front + ", "
			 + "rear: " + rear + "]";
	}
}

/*

## 강사님 코드 ##

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

*/