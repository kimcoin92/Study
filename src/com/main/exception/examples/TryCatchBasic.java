package com.main.exception.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBasic {
	
	public static void main(String[] args)
	{
		Scanner kbScan = new Scanner(System.in);
		
		// try - catch문 : 예외를 처리한다.
		int a = 0;
		int b = 0;
		
		try
		{
			a = kbScan.nextInt();
			b = kbScan.nextInt();
		}
		catch (InputMismatchException ime)
		{
			
		}

		kbScan.close();
		
		System.out.println(a / b);
		
		System.out.println("end");
	}
}
