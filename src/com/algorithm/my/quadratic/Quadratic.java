package com.algorithm.my.quadratic;

public class Quadratic {
		
	private double a = 0;
	private double b = 0;
	private double c = 0;
	
	public Quadratic(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getSolution(boolean bPlus)
	{
		double solution = 0; // 2차 방정식의 근
		
		double d = Math.pow(b, 2) - (4 * a * c);
		
		if(d < 0)
		{
			System.out.println("허근이기 때문에 연산을 종료합니다.");
			return 0;
		}
		if(bPlus == true)
		{
			solution = (-b + Math.sqrt(d)) / (2 * a);
		}
		else
		{
			solution = (-b - Math.sqrt(d)) / (2 * a);
		}
		
		return solution;
	}
}