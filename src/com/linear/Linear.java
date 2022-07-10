package com.linear;

public class Linear
{
//	기울기
	public double gradient;
	
//	y절편
	public double yIntercept;
	
//	초기화
	public Linear()
	{
		gradient   = 0;
		yIntercept = 0;
	}
	
//  로직 : 일차함수 (y = ax + b), 기울기와 축을 지나가는 한 점을 아는 상황
	public Linear(Position value1, Position value2)
	{
		double gd  = 0;
		double yic = 0;
		
		// gd(gradient) : 각도 계산
		gd         = (value2.y - value1.y) / (value2.x - value1.x);
		
		// yic(y-intercept) : y절편 계산
		yic        = value1.y - (gd * value1.x);
		
		gradient   = gd;
		yIntercept = yic;
	}
	
// 	x값이 주어졌을때 y값을 출력하는 기능
	public double getValue(double x)
	{
		return gradient * x + yIntercept;
	}
	
//	좌표 두 지점을 아는 상황
//	x절편과 y절편을 아는 상황
	
//	"y = ax + b" 형태로 공식을 출력
	public String printForm()
	{
		return "y = " + gradient + "x + " + yIntercept;
	}
}