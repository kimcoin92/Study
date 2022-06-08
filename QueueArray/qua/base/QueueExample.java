package qua.base;

public class QueueExample
{
	public static final int DEFAULT_SIZE = 5;

	// Queue의 배열
	private int[] frame;
	
	private int size;
	
	// rear  (Enqueue를 위한 위치정보)
	private int rear;
	
	// front (Dequeue을 위한 위치정보)
	private int front;
	
	// Queue에 들어있는 데이터 개수
	private int count;
	
	// 기본 생성자
	public QueueExample()
	{
		size  = DEFAULT_SIZE;
		frame = new int[size];
		rear  = 0;
		front = 0;
		count = 0;
	}
	
	// 사이즈가 들어오면 프레임을 잡아주는 오버로딩 생성자
	public QueueExample(int _size)
	{
		size  = _size;
		frame = new int[size];
		rear  = 0;
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
			// 배열이 꽉 차면 Enqueue를 중지`
			return false;
		
		// rear와 size가 같아지면 0으로 순환
		rear = rear % size;
		
		// 데이터를 넣어준다.
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
	
	// Queue의 내용을 덤프하는 문자열을 출력
	public String toString()
	{
		return this.getClass().getName();
	}
}