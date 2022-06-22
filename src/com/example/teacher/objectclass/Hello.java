package com.example.teacher.objectclass;

import java.lang.CloneNotSupportedException;

public class Hello
{
	public static void main(String[] args)
	{	
		Rectangle r1 = new Rectangle(0, 10, 10, 0);
		Rectangle r2 = r1;
		

		System.out.println(r1.toString());
		System.out.println(r2.toString());
		
		try
		{
			r2 = (Rectangle) r1.clone();
		}
		catch (CloneNotSupportedException excp)
		{
			excp.printStackTrace();
		}
		
		r2.setRect(0, 0, 20, 20);
		
		// String은 clone없이 자동으로 메모리에 복사되어 깊은 복사 현상되는 특성
		r1.name = "abc";
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
	}
}