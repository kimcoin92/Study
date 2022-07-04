/**
 * 
 * 작성자 : kimcoin92
 * 
 * 작성일 : 2022년 07월 04일
 * 
 * 제목 : 스택 (Stack)
 * 
 * 설명 : 선입후출 (FILO : First In Last Out)의 데이터 구조
 * 
 */

// ## 내 코드 (강사님 코드 참조했음) ##

package com.stack;

import java.util.Arrays;

public class Stack {
	
	public static final int DEFAULT_STACK_SIZE   = 10;
	public static final int ERROR_STACK_FULL     = 0;
	public static final int ERROR_STACK_EMPTY    = Integer.MIN_VALUE;
	public static final int ERROR_INVALID_VALUE  = Integer.MAX_VALUE;
	public static final int SUCCESS_STACK_INSERT = 1;
	
	private int   size;
	private int[] frame;
	private int   pointer;
	private int   count;
	
	public Stack()
	{
		this(Stack.DEFAULT_STACK_SIZE);
	}
	
	public Stack(int _size)
	{
		pointer = 0;
		count   = 0;
		size    = _size;
		frame   = new int[size];
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
		boolean result = false;
		
		if (count == getCount())
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
		boolean result = false;
		
		if (0 == getCount())
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}

	public int push(int _data)
	{
		if (true == isFull())
		{
			return ERROR_STACK_FULL;
		}
		else if ((_data == ERROR_STACK_EMPTY) ||
				 (_data == ERROR_INVALID_VALUE))
		{
			return ERROR_INVALID_VALUE;
		}
		
		frame[pointer] = _data;
		
		pointer++;
		
		count++;
		
		return SUCCESS_STACK_INSERT;
	}

	public int pop()
	{
		int result = 0;
		
		if (true == isEmpty())
		{
			return ERROR_STACK_EMPTY;
		}
		
		result = frame[pointer];
		
		pointer--;
		
		count--;
		
		return result;
	}

	@Override
	public String toString()
	{
		return "Stack ["
			 + "frame: " + Arrays.toString(frame) + ", "
			 + "size: " + size + ", "
			 + "count: " + count + ", "
			 + "pointer: " + pointer + "]";
	}
}

/*

	## 강사님 코드 ##

public class Stack {
	
//	                        기본 스택 사이즈 초기화
	public static final int DEFAULT_STACK_SIZE   = 10;
	
//	                        꽉 찬 스택 에러
	public static final int ERROR_STACK_FULL     = 0;
	
//	                        빈 스택 에러
	public static final int ERROR_STACK_EMPTY    = Integer.MIN_VALUE;
	
//                          유효하지 않는 값
	public static final int ERROR_INVALID_VALUE  = Integer.MAX_VALUE;
	
//	                        데이터 스태킹 성공
	public static final int SUCCESS_STACK_INSERT = 1;
	

	
	//                      메모리 크기
	private int             size;
	
	//                      스택 메모리
	private int[]           frame;
	
	//                      데이터 수정 위치 지정
	private int             pointer;
	
//	                        스택 데이터 개수
	private int             count;
	
	//                      기본 생성자
	public                  Stack()
	{
		this(Stack.         DEFAULT_STACK_SIZE);
	}
	
	//                      오버로딩 생성자
	public                  Stack(int _size)
	{
		                    pointer    = 0;
		                    count      = 0;
		                    size       = _size;
		                    frame      = new int[size];
	}
//	                        스택 사이즈를 구한다
	public int              getSize()
	{
		return size;
	}
//	                        스택 개수를 조회한다
	public int              getCount()
	{
		return count;
	}
//	                        꽉 찬 스택인지 체크한다
	private boolean         isFull()
	{
		if(count == getCount())
			
			return true;
			return false;
			
	}
	
//                          빈 스택인지 체크한다
	private boolean         isEmpty()
	{
		if(0 == getCount())
			
			return true;
			return false;
			
	}
//	                        데이터를 삽입한다
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
	
//                          데이터를 인출한다
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


*/
