package sta.base;

public class Stack {
	
//	���
//	1. �ڱ� ������ �״�� �ڵ��� ��.
//	2. �ڵ��� �����ص� �ȴ�. ������ ������ �����ϸ� �ȵ�.
//	3. �ڵ����� ������ �� ��. (�ּ�����, ������ �����ϰ� ���� ��)
//	4. ����� ���� ���� ���� �ǵ��.
//	5. ����, ť, ����Ʈ, ����, ���̳ʸ���ġ.
	
	public static int str = 0;
	
	private int[] stackFrame;
	
	public Stack()
	{
		
	}
	
	public Stack(int[] _stackFrame)
	{
		this.stackFrame = _stackFrame;
	}
	
	public boolean push(int _data)
	{
		str++;
		return true;
	}
	
	public int pop()
	{
		str--;
		return 0;
	}

}
