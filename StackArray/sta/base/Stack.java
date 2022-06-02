package sta.base;

import java.util.Arrays;

public class Stack {
	
//	##########################################################
//	초기화
	
	private int              stackSize;     // 메모리 크기
	private int[] 	         stackFrame;    // 스택 메모리
	private int 	         stackPointer;  // 순서 정보
	private int              count;         // push pop 카운터

//	##########################################################
//	생성자
	
	public Stack()
	{
		
	}
	
	public Stack(int[] _stackSize)
	{
		stackPointer    = 0;
		count           = 0;
		this.stackFrame = _stackSize;
		stackFrame      = new int[stackSize];
	}
	
//	##########################################################
//	스택 리미터 : 가득 찬 상태와 비어있는 상태를 활성화
	
	public boolean full()
	{
		if (stackPointer == stackSize)
		{
			stackPointer = stackSize;
			
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean empty()
	{
		if (stackPointer <= 0)
		{
			stackPointer = 0;
			
			return true;
		}
		else
		{
			return false;
		}
	}
	
//	##########################################################
//	데이터 입력, 제거
	
	public boolean push(int _data)
	{
		
		if(full() == true)
		{
			return false;
		}
		else
		{
			stackFrame[stackPointer] = _data;
			
			stackPointer++;
		}
			return true;
	}

	
	public int pop()
	{
		if(empty() == true)
		{
			return 0;
		}
		else
		{
			int data = stackFrame[stackPointer - 1];
			
			stackFrame[stackPointer - 1] = 0;
			
			stackPointer--;
			
			return data;
		}
	}
	
//	##########################################################
//	현재 배열 데이터 출력
	
	public void print()
	{
		System.out.println(Arrays.toString(stackFrame) + " 배열위치 : " + stackPointer);
	}
}
