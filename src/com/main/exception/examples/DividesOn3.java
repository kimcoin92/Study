package com.main.exception.examples;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DividesOn3
{
	public static void main(String[] args)
	{
		Scanner kbScan = new Scanner(System.in);
		int a = 0; int b = 0; int c = 0;
		
		int live = 2;
		
		for (int i = 0; i < 3; i++)
		{
			try
			{
				System.out.println("숫자를 입력하세요.");
				a = kbScan.nextInt();
				System.out.println("a = " + a);
				System.out.println("숫자를 입력하세요.");
				b = kbScan.nextInt();
				System.out.println("b = " + b);
				c = a / b;
			}
			catch (ArithmeticException zero)
			{
				live--;

				if (live != -1)
				{
					System.out.println("0은 안됩니다!");
					System.out.println("♥ x " + live);
					
					continue;
				}
				else
				{
					System.out.println("GAME OVER");
					
					kbScan.close();
					
					return;
				}
			}
			catch (InputMismatchException InputMiss)
			{
				i--;
				
				System.out.println("숫자가 아닙니다!");
				
				kbScan.nextLine();

				// kbScan buffer flush.
				// "남아있는 데이터를 다 가져와라."
				
				continue;
			}
			break;
		}
		
		kbScan.close();
		
		System.out.println("c = " + c);
	}
}
