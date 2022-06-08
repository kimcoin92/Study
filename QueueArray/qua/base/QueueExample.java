package qua.base;

public class QueueExample
{
	public static final int DEFAULT_SIZE = 5;

	// Queue�� �迭
	private int[] frame;
	
	private int size;
	
	// rear  (Enqueue�� ���� ��ġ����)
	private int rear;
	
	// front (Dequeue�� ���� ��ġ����)
	private int front;
	
	// Queue�� ����ִ� ������ ����
	private int count;
	
	// �⺻ ������
	public QueueExample()
	{
		size  = DEFAULT_SIZE;
		frame = new int[size];
		rear  = 0;
		front = 0;
		count = 0;
	}
	
	// ����� ������ �������� ����ִ� �����ε� ������
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
			// �迭�� �� ���� Enqueue�� ����`
			return false;
		
		// rear�� size�� �������� 0���� ��ȯ
		rear = rear % size;
		
		// �����͸� �־��ش�.
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
	
	// Queue�� ������ �����ϴ� ���ڿ��� ���
	public String toString()
	{
		return this.getClass().getName();
	}
}