package com.example.my.generic;

public class ABox<L, R>
{
	private L left;
	private R right;
	
	public ABox()
	{
		left   = null;
		right = null;
	}
	
	public ABox(L _left, R _right)
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
	public String toString() {
		return "ABox [left=" + left + ", right=" + right + "]";
	}

	public static void main(String[] args)
	{
		ABox<String, Integer> boxx = new ABox<>("Apple", 10);
		
		ABox<ABox<String, Integer>, ABox<String, Integer>> boxx2 = new ABox<>();
		
		boxx2.setBox(boxx, boxx);
		
		System.out.println(boxx2);
	}
}
