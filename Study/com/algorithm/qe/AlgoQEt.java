package com.algorithm.qe;

// ax^2 + bx + c = 0�� ���� ���ϴ� Ŭ����.
public class AlgoQEt
{
	private double a;
	private double b;
	private double c;
	
	public AlgoQEt(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	public double getSolution(boolean bPlus)
	{
		 double solution = 0;		// 2�� �������� ��.
		 
		 double d = Math.pow(b, 2) - (4 * a * c);
		 
		 
		 if (d < 0)
		 {
			 System.out.println("����̱� ������ ������ �����մϴ�.");
			 return 0; 
			 
		 }
		 
		 
		 if (bPlus == true)
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
