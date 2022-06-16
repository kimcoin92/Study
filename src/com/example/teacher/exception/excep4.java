package com.example.teacher.exception;

public class excep4 {
	
	public static void func2(int a)
	{
//		try
//		{
			int b = 10 / a; // 예외 발생 근원
//		}
//		catch (Exception e)
//		{
//			
//		}
		System.out.println(b);
	}
	
	public static void func1()
	{
//		try
//		{
			func2(0); // 예외가 이곳까지 영향을 끼치다.
//		}
//		catch (ArithmeticException e)
//		{
//			
//		}
	}
	
	public static void main(String[] args)
	{
//		try
//		{
			func1(); // 예외의 마지막 도착지
//		}
//		catch (Exception e)
//		{
//			
//		}
	}
}
