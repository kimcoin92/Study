package com.example.teacher.generic.dbox;

public class DBox <L, R>
{
	private L left;
	private R right;
	
	public void setBox(L _left, R _right)
	{
		left = _left;
		right = _right;
	}

	public L getLeft()
	{
		return left;
	}

	public R getRight()
	{
		return right;
	}

	@Override
	public String toString() {
		return "DBox [left=" + left + ", right=" + right + "]";
	}
}
