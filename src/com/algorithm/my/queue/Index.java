// 큐 (Queue)
// 선입선출 (FIFO : First In First Out)의 데이터 구조

package com.algorithm.my.queue;

public class Index {

	public static void main(String[] args)
	{
		int idx = 1;
		
		Queue object = new Queue();
		
		System.out.println("초기상태\n" + object.getPrint());
		
		for (int i = 0; i < 5; i++)
		{
			object.enqueue(idx);
			
			idx++;
		}
		
		System.out.println("5개 삽입\n" + object.getPrint());
		
		for (int j = 0; j < 4; j++)
		{
			object.dequeue();
		}
		
		System.out.println("4개 인출 (공백 현상)\n" + object.getPrint());
		
		for (int i = 0; i < 5; i++)
		{
			object.enqueue(idx);
			
			idx++;
		}
		
		System.out.println("5개 삽입\n" + object.getPrint());
		
		for (int j = 0; j < 4; j++)
		{
			object.dequeue();
		}
		
		System.out.println("4개 인출\n" + object.getPrint());
		
		for (int i = 0; i < 5; i++)
		{
			object.enqueue(idx);
			
			idx++;
		}
		
		System.out.println("5개 삽입\n" + object.getPrint());
		
		for (int i = 0; i < 5; i++)
		{
			object.enqueue(idx);
			
			idx++;
		}
		
		System.out.println("5개 삽입 (초과 삽입)\n" + object.getPrint());
		
		for (int j = 0; j < 4; j++)
		{
			object.dequeue();
		}
		
		System.out.println("4개 인출\n" + object.getPrint());
		
		for (int j = 0; j < 6; j++)
		{
			object.dequeue();
		}
		
		System.out.println("6개 인출 (위치 초기화 테스트)\n" + object.getPrint());
	}
}
