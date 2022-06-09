// �����Լ� ��� ����
// 3. �ھ�

package com.algorithm.lf;

public class AlgoLF
{
//	����
	public double gradient;
	
//	y����
	public double yIntercept;
	
//	�ʱ�ȭ
	public AlgoLF()
	{
		gradient   = 0;
		yIntercept = 0;
	}
	
//  ���� : �����Լ� (y = ax + b), ����� ���� �������� �� ���� �ƴ� ��Ȳ
	public AlgoLF(PosLF value1, PosLF value2)
	{
		double gd  = 0;
		double yic = 0;
		
		// gd(gradient) : ���� ���
		gd         = (value2.y - value1.y) / (value2.x - value1.x);
		
		// yic(y-intercept) : y���� ���
		yic        = value1.y - (gd * value1.x);
		
		gradient   = gd;
		yIntercept = yic;
	}
	
// 	x���� �־������� y���� ����ϴ� ���
	public double getValue(double x)
	{
		return gradient * x + yIntercept;
	}
	
//	��ǥ �� ������ �ƴ� ��Ȳ
//	x������ y������ �ƴ� ��Ȳ
	
//	"y = ax + b" ���·� ������ ���
	public String printForm()
	{
		return "y = " + gradient + "x + " + yIntercept;
	}
}