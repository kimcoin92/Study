package qua.base;

import java.util.Arrays;

public class QueueArray {

	public static void main(String[] args)
	{
/*
 *		## 데이터의 순환 과정을 테스트합니다 ##
 */
		int idx = 1;
		
		QueueArray object = new QueueArray();
		
		System.out.println("초기상태\n" + object.getPrint());
		
		for (int i = 0; i < 5; i++)
		{
			object.enqueue(idx);
			
			idx++;
		}
		
		System.out.println("5개 삽입\n" + object.getPrint());
		
		for (int j = 0; j < 4; j++)
		{
			object.dequeue();
		}
		
		System.out.println("4개 인출 (공백 현상)\n" + object.getPrint());
		
		for (int i = 0; i < 5; i++)
		{
			object.enqueue(idx);
			
			idx++;
		}
		
		System.out.println("5개 삽입\n" + object.getPrint());
		
		for (int j = 0; j < 4; j++)
		{
			object.dequeue();
		}
		
		System.out.println("4개 인출\n" + object.getPrint());
		
		for (int i = 0; i < 5; i++)
		{
			object.enqueue(idx);
			
			idx++;
		}
		
		System.out.println("5개 삽입\n" + object.getPrint());
		
		for (int i = 0; i < 5; i++)
		{
			object.enqueue(idx);
			
			idx++;
		}
		
		System.out.println("5개 삽입 (초과 삽입)\n" + object.getPrint());
		
		for (int j = 0; j < 4; j++)
		{
			object.dequeue();
		}
		
		System.out.println("4개 인출\n" + object.getPrint());
		
		for (int j = 0; j < 6; j++)
		{
			object.dequeue();
		}
		
		System.out.println("6개 인출 (위치 초기화 테스트)\n" + object.getPrint());
	}
/*
 *	큐(Queue)는 선입선출 (FIFO : First In First Out)의 데이터 구조를 말합니다.
 *	링크 리스트를 활용하면 Front와 Back의 고정 + 데이터의 이동이 가능합니다.
 *	이 코드는 링크 리스트를 사용하지 않았습니다. 데이터를 인출한 배열에 공백이 발생하는 문제가 있습니다.
 */
	public static final int DEFAULT_SIZE        = 10;
	public static final int ERROR_FULL          = 0;
	public static final int ERROR_EMPTY         = Integer.MIN_VALUE;
	public static final int ERROR_INVAILD       = Integer.MAX_VALUE;
	public static final int SUCCESS_INSERT      = 1;
	public static final int INITIALIZE_POINTER = -1;
	
	private int[]           frame;
	private int             front;
	private int             rear;
	private int             size;
	private int             amount;
/*
 *		## 생성자 ##
 */
	public QueueArray()
	{
		this(QueueArray.DEFAULT_SIZE);
	}
	
	public QueueArray(int _size)
	{
		amount   = 0;
		front   = INITIALIZE_POINTER;
		rear    = INITIALIZE_POINTER;
		size    = _size;
		frame   = new int[_size];
	}
/*
 *		## 현재 상태값을 구하는 Getter ##
 */
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
/*
 *		## 배열 데이터가 꽉 찬 상태가 되면 발동 ##
 */
	private boolean isFull()
	{
		if(size == getAmount())
			
			return true;
		
			return false;
	}
/*
 *		## 배열 데이터가 비어있는 상태에 발동 ##
 */
	private boolean isEmpty()
	{
		if(0 == getAmount())
			
			return true;
		
			return false;
	}
/*
 *		## 데이터를 삽입 ##
 */
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
/*
 *		## 데이터를 인출 ##
 */
	public int dequeue()
	{
		int result = 0;
		
		if (isEmpty())
			
			return ERROR_EMPTY;
		
		rear = (rear + 1) % size;
		
		result = frame[rear];

		frame[rear] = 0;
		
		amount--;
/*
 *		## Dequeue를 모두 마치면 위치를 초기화합니다. (Experimental) ##
 *		## 인출량이 삽입량보다 적으면 잔류된 데이터로 인해 배열 중간에 공백이 발생합니다. ##
 */
		if (isEmpty())
		{
			front = INITIALIZE_POINTER;
			rear  = INITIALIZE_POINTER;
		}

		return result;
	}
/*
 * 		## Getter 값을 출력합니다. (Test Only) ##
 */
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