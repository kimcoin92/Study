package com.quadratic;

public class Quadratic
{
	private double a;
	private double b;
	private double c;
	
	public Quadratic(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getSolution(boolean bPlus)
	{
		 double result = 0;
		 
		 double d = Math.pow(b, 2) - (4 * a * c);
		 
		 if (d < 0)
		 {
			 System.out.println("허근이기 때문에 연산을 종료합니다.");
			 
			 return 0; 
		 }

		 if (bPlus == true)
		 {
			 result = (-b + Math.sqrt(d)) / (2 * a);
		 }
		 else
		 {
			 result = (-b - Math.sqrt(d)) / (2 * a);
		 }
		return result;
	}
}
