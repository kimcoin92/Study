package sta.base;

public class Stack {
	
//	경고
//	1. 자기 생각을 그대로 코딩할 것.
//	2. 코딩을 실패해도 된다. 하지만 생각을 실패하면 안됨.
//	3. 코딩부터 덤비지 말 것. (주석부터, 생각을 정리하고 덤빌 것)
//	4. 목요일 전원 제출 전원 피드백.
//	5. 스택, 큐, 리스트, 정렬, 바이너리서치.
	
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
