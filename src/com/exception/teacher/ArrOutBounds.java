package com.exception.teacher;

public class ArrOutBounds {
	
	public static void main(String[] args)
	{
		int[] ar = {1, 2, 3, 4};
		
		for (int i = 0; i < ar.length + 1; i++)
		{
			System.out.println(ar[i]);
		}
	}
}
