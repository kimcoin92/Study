package com.example.teacher.objectclass;

import java.lang.ClassCastException;
import java.lang.CloneNotSupportedException;

public class Rectangle implements Cloneable
{
	private Point upperLeft;
	private Point lowerRight;
	
	public Rectangle()
	{
		upperLeft  = new Point();
		lowerRight = new Point();
	}
	
	public Rectangle(int _left, int _top, int _right, int _bottom)
	{
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
	public String toString() {
		return "Rectangle [upperLeft=" + upperLeft + ", lowerRight=" + lowerRight + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
