/** 
 *  음수가 입력되면 예외처리하는 사용자 예외처리 class.
 */

package com.main.exception.examples;

import java.util.Scanner;

@SuppressWarnings("serial")
class ValueRangeException extends Exception
{
	public ValueRangeException()
	{
		super("0보다 작은 값은 입력할 수 없습니다.");
	}
}

public class CustomExcep
{
	public static int readValue() throws ValueRangeException
	{
		Scanner scan = new Scanner(System.in);
		
		int val = scan.nextInt();
		
		scan.close();
		
		if (val < 0)
		{
			throw new ValueRangeException();
		}
		
		return val;
	}
	
	public static void main(String[] args)
	{

		
		int value = 0;
		
		try
		{
			value = readValue();
			
			System.out.println("value = " + value);
		}
		catch (ValueRangeException excp)
		{
			System.out.println(excp.getMessage());
			
			return;
		}
		

	}

}
