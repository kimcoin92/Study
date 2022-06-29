package com.objclass.teacher;

import java.lang.CloneNotSupportedException;

// Clonable
public class Point implements Cloneable {
	
	public int xPos;
	public int yPos;
	
	public Point()
	{
		xPos = 0;
		yPos = 0;
	}
	
	public Point(int _x, int _y)
	{
		xPos = _x;
		yPos = _y;
	}
	
	public boolean equals(Object obj)
	{
		try
		{
			if((this.xPos == ((Point)obj).xPos) &&
			   (this.yPos == ((Point)obj).yPos))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (ClassCastException e)
		{
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Point [xPos=" + xPos + ", yPos=" + yPos + "]";
	}

//	외부에서 호출하기 위해서 public으로 설정한다.
//	public에서 protected로 재정의(영역을 좁히는 행위)는 불가 : 상위 클래스에 대한 설계 원칙을 위배한다.
//	상위 클래스의 기준을 맞추는 것이 중요하다.
	public Object clone() throws CloneNotSupportedException
	{
		// Object class에서 하위에 있는 정보를 자동으로 읽어서 처리하도록 설정
		return super.clone();
	}
}