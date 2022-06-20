package com.example.teacher.exception;

import java.util.Scanner;

public class InputArithExcep {
	
	public static void main(String[] args)
	{
		Scanner kbScan = new Scanner(System.in);
		
		int a = 0; int b = 0; int c = 0;
		
		// 숫자가 아닌 데이터를 입력하면 java.util.InputMismatchException 발생
		a = kbScan.nextInt();
		b = kbScan.nextInt();
		
		// b가 0일 경우 java.lang.ArithmedicException 발생
		c = a / b;
		
		kbScan.close();
		
		System.out.println("c = " + c);
	}
}
