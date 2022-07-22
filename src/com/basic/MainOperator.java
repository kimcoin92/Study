package com.basic;

public class MainOperator
{
	public static void main(String[] args)
	{
		int x = 10;
		int y = 5;
		
		boolean result = false;
		
		
		// x에서 3을 나눠서 나오는 나머지 숫자와 2가 같으면 True
		// 아니면 y에서 2를 나눠서 나오는 숫자가 1과 같지 않으면 True
		// 아니면 False인 값을 출력하라.
		if((x % 3 == 2) || (y % 2 != 1))
		{
			result = true;
		}
		else
		{
			result = false;
		}
		
		System.out.println(result);
	}
}