// 3. �� ����

// ����
// 1. ���⸦ �˰� �������� �� ���� �ƴ� ��Ȳ
// 2. �� ��ǥ�� �ƴ� ��Ȳ
// 3. x����� y������ �ƴ� ��Ȳ

// �̻� �������� ������ ���� �Ͽ�
// 4. �Լ��� ����� ��� (������)
// 5. x���� �־������� y���� ����ϴ� ���
// 6. "y = ax + b" ���·� ������ ���

package main;

public class Function
{
	
	public double gradient;
	public double yIntercept;
	
	// �ھ� ����
	// ���� �Լ�
	// y = ax + b;
	public Function(Position value1, Position value2)
	{
		double gd  = 0;
		double yic = 0;
		
		// gd(gradient) : ������ ���
		gd         = (value2.y - value1.y) / (value2.x - value1.x);
		
		// yic(y-intercept) : y������ ���
		yic        = value1.y - (gd * value1.x);
		
		gradient   = gd;
		yIntercept = yic;
	}
	
	public String printForm()
	{
		return "y = " + gradient + "x + " + yIntercept;
	}
}


