package qe.system;

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
		double solution = 0; // 2�� �������� ��
		
		double d = Math.pow(b, 2) - (4 * a * c);
		
		if(d < 0)
		{
			System.out.println("����̱� ������ ������ �����մϴ�.");
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
