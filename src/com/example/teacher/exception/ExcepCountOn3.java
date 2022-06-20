package com.example.teacher.exception;

import java.util.Scanner;

public class ExcepCountOn3 {
	
	public static void main(String[] args)
	{
		Scanner kbScan = new Scanner(System.in);
		
		int excpcount = 0;
		
		int a = 0; int b = 0; int c = 0;
		
		// 일단 두 수를 입력받는다...
		
		// 정상적이라면 (예외가 없다면) a / b
		// 예외가 발생했다면 다시 두 수를 입력받는다.
		// 예외가 3회를 넘어가면 종료
		
		do
		{
			try
			{
				a = kbScan.nextInt();
				b = kbScan.nextInt();
				c = a / b;
				
				break;
			}
			catch (java.util.InputMismatchException | ArithmeticException excp)
			{
				excpcount++;
				
				kbScan.nextLine();
				System.out.println("잘못된 입력입니다.");
			}
		}
		while (excpcount < 3);
		
		kbScan.close();
		
		if(excpcount == 3)
		{
			System.out.println("3회 입력 오류로 프로그램은 종료합니다.");
		}
		else
		{
			System.out.println("c = " + c);
		}
	}
}
