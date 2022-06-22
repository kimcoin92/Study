package com.example.teacher.objectclass;

import java.lang.ClassCastException;
import java.lang.CloneNotSupportedException;

public class Rectangle implements Cloneable
{
	public  String name;
	private Point upperLeft;
	private Point lowerRight;
	
	public Rectangle()
	{
		name = "no-name";
		upperLeft  = new Point();
		lowerRight = new Point();
	}
	
	public Rectangle(int _left, int _top, int _right, int _bottom)
	{
		name = "no-name";
		upperLeft  = new Point(_left, _top);
		lowerRight = new Point(_right, _bottom);
	}
	
	public void setRect(int _left, int _top, int _right, int _bottom)
	{
		upperLeft.xPos = _left;
		upperLeft.yPos = _top;
		
		lowerRight.xPos = _right;
		lowerRight.yPos = _bottom;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Point ul = null;
		Point lr = null;
		
		try
		{
			ul = ((Rectangle)obj).upperLeft;
			lr = ((Rectangle)obj).lowerRight;
		}
		catch (ClassCastException excp)
		{
			return false;
		}
		
		if((true == upperLeft.equals(ul)) && (true == lowerRight.equals(lr)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getSize()
	{
		int result = (upperLeft.xPos - lowerRight.xPos) * (upperLeft.yPos - lowerRight.yPos);
		
		return result;
	}
	
	@Override
	public String toString()
	{
		return "Rectangle [upperLeft=" + upperLeft + ", lowerRight=" + lowerRight + ", name = " + name + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Rectangle result = null;
		
		// 깊은 복사
		result = (Rectangle) super.clone();
		
		result.upperLeft  = (Point) upperLeft.clone();
		result.lowerRight = (Point) lowerRight.clone();
		
//		String은 자동으로 메모리에 할당하기 때문에 clonable을 허용하지 않는다.
//		result.name = (String) name.clone();
		result.name = new String(this.name);
		
		return result;
	}
}
