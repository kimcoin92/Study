package sta.base;

import java.util.Arrays;

public class Stack {
	
//	##########################################################
//	�ʱ�ȭ
	
	private int              stackSize;     // �޸� ũ��
	private int[] 	         stackFrame;    // ���� �޸�
	private int 	         stackPointer;  // ���� ����
	private int              count;         // push pop ī����

//	##########################################################
//	������
	
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
//	���� ������ : ���� �� ���¿� ����ִ� ���¸� Ȱ��ȭ
	
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
//	������ �Է�, ����
	
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
//	���� �迭 ������ ���
	
	public void print()
	{
		System.out.println(Arrays.toString(stackFrame) + " �迭��ġ : " + stackPointer);
	}
}
