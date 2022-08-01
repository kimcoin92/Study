package com.generic.box;

public class Apple<L, R>
{
	private L left;
	private R right;
	
	public Apple()
	{
		left  = null;
		right = null;
	}
	
	public Apple(L _left, R _right)
	{
		left   = _left;
		right  = _right;
	}
	
	public void setBox(L _left, R _right)
	{
		left   = _left;
		right  = _right;
	}
	
	@Override
	public String toString()
	{
		return "ABox [left=" + left + ", right=" + right + "]";
	}
}
