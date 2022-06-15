// 연습문제
// 두 개의 int 배열을 입력받아 합하여 새로운 배열을 리턴하는 함수를 만드시오.
// 예를 들어 {1, 2, 3, 4} {5, 6, 7, 8} 두 개의 배열을 입력하면 {1, 2, 3, 4, 5, 6, 7, 8)을 리턴.

package com.example.teacher.array;

public class Linkage {

	public static void main(String[] args) {
		
		Linkage object = new Linkage();
		
		int[] a = new int[] {1, 2, 3, 4};
		int[] b = new int[] {5, 6, 7, 8};
		
		object.joinArray(a, b);
	}
	
	public int addArray(int[] arr)
	{
		int total = 0;
		
		for(int sum : arr)
		{
			total += sum;
		}
		
		return total;
	}
	
	public int[] joinArray(int[] arr1, int[] arr2)
	{
		int[] total = new int[arr1.length + arr2.length];
		
		int idx = 0;
		
		for(int val : arr1)
		{
			total[idx] = val;
					
			idx++;
		}
		
		for(int val : arr2)
		{
			total[idx] = val;
					
			idx++;
		}
		
		return total;
	}
}
