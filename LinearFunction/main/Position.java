// 자바 일차함수 코드 제작 일지
//
// 두 달만에 다시 시작한 자바 훈련과정에서 모든 제작법을 잊어버린 필자가 강사님의 코드를 분석하며
// 되새김질하는 과정에서 상세한 기록으로 장기적 기억을 도모하는 취지로 기록하게 된 일지
//
// 훈련일 : 2022년 05월 30일
// 기록일 : 2022년 05월 30일
// 
// 일차함수 계산 로직

// 1. 생성자를 초기화한다.
// 주의 : 클래스명과 생성자 이름은 같아야한다.

package main;

public class Position
{
	
	public double x;
	public double y;
	
	public Position()
	{
		x = 0;
		y = 0;
	}
	
	public Position(double _x, double _y)
	{
		x = _x;
		y = _y;
	}

}
