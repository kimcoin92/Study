// ť (Queue)
// ���Լ��� (FIFO : First In First Out)�� ������ ����

package com.algorithm.my.queue;

public class Index {

	public static void main(String[] args)
	{
		int idx = 1;
		
		Queue object = new Queue();
		
		System.out.println("�ʱ����\n" + object.getPrint());
		
		for (int i = 0; i < 5; i++)
		{
			object.enqueue(idx);
			
			idx++;
		}
		
		System.out.println("5�� ����\n" + object.getPrint());
		
		for (int j = 0; j < 4; j++)
		{
			object.dequeue();
		}
		
		System.out.println("4�� ���� (���� ����)\n" + object.getPrint());
		
		for (int i = 0; i < 5; i++)
		{
			object.enqueue(idx);
			
			idx++;
		}
		
		System.out.println("5�� ����\n" + object.getPrint());
		
		for (int j = 0; j < 4; j++)
		{
			object.dequeue();
		}
		
		System.out.println("4�� ����\n" + object.getPrint());
		
		for (int i = 0; i < 5; i++)
		{
			object.enqueue(idx);
			
			idx++;
		}
		
		System.out.println("5�� ����\n" + object.getPrint());
		
		for (int i = 0; i < 5; i++)
		{
			object.enqueue(idx);
			
			idx++;
		}
		
		System.out.println("5�� ���� (�ʰ� ����)\n" + object.getPrint());
		
		for (int j = 0; j < 4; j++)
		{
			object.dequeue();
		}
		
		System.out.println("4�� ����\n" + object.getPrint());
		
		for (int j = 0; j < 6; j++)
		{
			object.dequeue();
		}
		
		System.out.println("6�� ���� (��ġ �ʱ�ȭ �׽�Ʈ)\n" + object.getPrint());
	}
}
