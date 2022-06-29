package com.exception.teacher;

import java.util.Scanner;

public class ThrowableBasic {
	
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a = 0;
		try
		{
			a = s.nextInt();
			s.close();
		}
		catch (java.util.InputMismatchException excp)
		{
			excp.getMessage();
			
//			excp.printStackTrace();
		}
	}
}
