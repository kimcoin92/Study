package com.example.teacher.wrapper;

public class Hello
{
	public static void main(String[] args)
	{
		// Boxing : 구버전
		Integer iii1 = new Integer(10);
		Double  ddd1 = new Double(20.32);
		
		Integer iii3 = Integer.valueOf("4"); // Boxing을 static method인 valueOf로 처리
		
		// Sugar-code
		// Boxing (Auto-Boxing) : 신버전
		Integer iii2 = 10;
		
		// Unboxing
		int iii = iii1.intValue();
		
		// Auto-Unboxing
		int jjj = iii2;
		
		iii2 = iii2 + 10;
		
		// 값의 강제변환
		double ddd = iii1.doubleValue();
		
		// -------------------------
		
		int aaa1 = 10;
		aaa1++;
		
		Integer aaa2 = 10;
		aaa2++;
		
//		자바에 허용하지 않는 Wrapper
//		IntData aaa3 = 10;
//		aaa3++;

	}

}
