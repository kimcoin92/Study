// 일차함수 계산 로직
// 1. 생성자

package com.system;

//	클래스명과 생성자 이름은 같아야한다
public class Position
{
	public double x;
	public double y;
	
//	초기화
	public Position()
	{
		x = 0;
		y = 0;
	}
	
//	오버로딩
	public Position(double _x, double _y)
	{
		x = _x;
		y = _y;
	}
}