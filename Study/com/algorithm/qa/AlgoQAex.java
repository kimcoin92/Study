package com.algorithm.qa;

public class AlgoQAex
{
	public static final int DEFAULT_SIZE = 5;

	// Queue�� �迭
	private int[] frame;
	
	private boolean[] swtch; // ********************
	
	private int size;
	
	// rear  (Enqueue�� ���� ��ġ����)
	private int rear;
	
	// front (Dequeue�� ���� ��ġ����)
	private int front;
	
	// Queue�� ����ִ� ������ ����
	private int count;
	
	// �⺻ ������
	public AlgoQAex()
	{
		size  = DEFAULT_SIZE;
		frame = new int[size];
		swtch = new boolean[size]; // ********************
		SettingSwtch();
		rear  = 0;
		front = 0;
		count = 0;
	}
	
	// ����� ������ �������� ����ִ� �����ε� ������
	public AlgoQAex(int _size)
	{
		size  = _size;
		frame = new int[size];
		swtch = new boolean[size]; // ********************
		SettingSwtch();
		rear  = 0;
		front = 0;
		count = 0;
	}
	
	public boolean[] getSwtch() // ********************
	{
		return swtch;
	}
	
	public boolean[] SettingSwtch() // ********************
	{
		for(int i = 0; i < swtch.length; i++)
		{
			swtch[i] = false;
		}
		
		return swtch;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public int getCount()
	{
		return count;
	}
	
	private boolean isFull()
	{
		if (count == size)
			return true;
		
		return false;
	}
	
	private boolean isEmpty()
	{
		if (count == 0)
			return true;
		
		return false;
	}
	
	public boolean enqueue(int _data)
	{
		if(isFull())
			// �迭�� �� ���� Enqueue�� ����`
			return false;
		
		// rear�� size�� �������� 0���� ��ȯ
		rear = rear % size;
		
		// �����͸� �־��ش�.
		frame[rear] = _data;
		swtch[rear] = true; // ********************
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
		swtch[front] = false; // ********************
		
		front++;
		count--;
		return result;
	}
	
	public void printAll() // ********************
	{
		// true�� �͸� ���
		for(int i = 0; i < swtch.length; i++)
		{
			if(swtch[i] == true)
				System.out.println(frame[i]);
		}
	}
	
	// Queue�� ������ �����ϴ� ���ڿ��� ���
	public String toString()
	{
		return this.getClass().getName();
	}
}