package sta.base;

import java.util.Arrays;

public class Stack {
	
//	���
//	1. �ڱ� ������ �״�� �ڵ��� ��.
//	2. �ڵ��� �����ص� �ȴ�. ������ ������ �����ϸ� �ȵ�.
//	3. �ڵ����� ������ �� ��. (�ּ�����, ������ �����ϰ� ���� ��)
//	4. ����� ���� ���� ���� �ǵ��.
//	5. ����, ť, ����Ʈ, ����, ���̳ʸ���ġ.
	
	public static int count = 0;
	
	private int[] stackFrame = new int[10];
	
	public Stack()
	{
		this.stackFrame = null;
	}
	
	public Stack(int[] _stackFrame)
	{
		this.stackFrame = _stackFrame;
	}
	
	public boolean push(int _data)
	{
		for(int i = 0; i < stackFrame.length; i++)
		{
			int idx = 0;
			
			stackFrame[idx] = idx;
		}
		
		count++;
		return true;
	}
	
	public int pop()
	{
		count--;
		return 0;
	}
	
	public void printout()
	{
		System.out.println(Arrays.toString(stackFrame));
	}

}
