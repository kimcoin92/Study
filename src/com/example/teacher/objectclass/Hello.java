package com.example.teacher.objectclass;

import java.lang.CloneNotSupportedException;
import java.util.Arrays;

public class Hello
{
	public static void main(String[] args)
	{
//		Point p1 = new Point(45, 2);
//		
//		Point cpPoint = null;
//		
//		try
//		{
//			cpPoint = (Point) p1.clone();
//			System.out.printf("%d, %d\n", cpPoint.xPos, cpPoint.yPos);
//		}
//		catch (CloneNotSupportedException excp)
//		{
//			excp.printStackTrace();
//		}
		
		Rectangle r1 = new Rectangle(0, 10, 10, 0);
		Rectangle r2 = null;
		
		try
		{
			r2 = (Rectangle) r1.clone();
		}
		catch (CloneNotSupportedException excp)
		{
			excp.printStackTrace();
		}
		
		r2 = new Rectangle(0, 0, 20, 20);
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
	}
}