package com.example.teacher.exception;

import java.util.Scanner;

public class excep5 {
	
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
