package com.algorithm.teacher.stack;

import java.util.Arrays;

public class Stack {
	
//	                        �⺻ ���� ������ �ʱ�ȭ
	public static final int DEFAULT_STACK_SIZE   = 10;
	
//	                        �� �� ���� ����
	public static final int ERROR_STACK_FULL     = 0;
	
//	                        �� ���� ����
	public static final int ERROR_STACK_EMPTY    = Integer.MIN_VALUE;
	
//                          ��ȿ���� �ʴ� ��
	public static final int ERROR_INVALID_VALUE  = Integer.MAX_VALUE;
	
//	                        ������ ����ŷ ����
	public static final int SUCCESS_STACK_INSERT = 1;
	

	
	//                      �޸� ũ��
	private int             size;
	
	//                      ���� �޸�
	private int[]           frame;
	
	//                      ������ ���� ��ġ ����
	private int             pointer;
	
//	                        ���� ������ ����
	private int             count;
	
	//                      �⺻ ������
	public                  Stack()
	{
		this(Stack.         DEFAULT_STACK_SIZE);
	}
	
	//                      �����ε� ������
	public                  Stack(int _size)
	{
		                    pointer    = 0;
		                    count      = 0;
		                    size       = _size;
		                    frame      = new int[size];
	}
//	                        ���� ����� ���Ѵ�
	public int              getSize()
	{
		return size;
	}
//	                        ���� ������ ��ȸ�Ѵ�
	public int              getCount()
	{
		return count;
	}
//	                        �� �� �������� üũ�Ѵ�
	private boolean         isFull()
	{
		if(count == getCount())
			
			return true;
			return false;
			
	}
	
//                          �� �������� üũ�Ѵ�
	private boolean         isEmpty()
	{
		if(0 == getCount())
			
			return true;
			return false;
			
	}
//	                        �����͸� �����Ѵ�
	public int              push(int _data) 
	{
		if(isFull())
			
			return ERROR_STACK_FULL;
		
		if((_data == ERROR_STACK_EMPTY) || (_data == ERROR_INVALID_VALUE))
			
			return ERROR_INVALID_VALUE;
		
		frame[pointer] = _data;
		pointer++;
		count++;
		
		return SUCCESS_STACK_INSERT;
	}
	
//                          �����͸� �����Ѵ�
	public int              pop()
	{
		int result = 0;
		
		if (isEmpty())
			
			return Stack.ERROR_STACK_EMPTY;
		
		result = frame[pointer];
		
		pointer--;
		count--;
		
		return result;
	}
	
	public String getAll()
	{
		return Arrays.toString(frame);
	}
}
