// 3. 본 로직

// 조건
// 1. 기울기를 알고 지나가는 한 점을 아는 상황
// 2. 두 좌표를 아는 상황
// 3. x절편과 y절편을 아는 상황

// 이상 세가지의 조건을 토대로 하여
// 4. 함수를 만드는 기능 (생성자)
// 5. x값이 주어졌을때 y값을 출력하는 기능
// 6. "y = ax + b" 형태로 공식을 출력

package main;

public class Function
{
	
	public double gradient;
	public double yIntercept;
	
	// 코어 로직
	// 일차 함수
	// y = ax + b;
	public Function(Position value1, Position value2)
	{
		double gd  = 0;
		double yic = 0;
		
		// gd(gradient) : 각도를 계산
		gd         = (value2.y - value1.y) / (value2.x - value1.x);
		
		// yic(y-intercept) : y절편을 계산
		yic        = value1.y - (gd * value1.x);
		
		gradient   = gd;
		yIntercept = yic;
	}
	
	public String printForm()
	{
		return "y = " + gradient + "x + " + yIntercept;
	}
}


