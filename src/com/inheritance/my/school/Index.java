// 연습문제

// 요구사항
// - 중학생은 학년, 반, 과목 4개(국영수과)가 있다. 또한 과목당 6학기 점수가 있다.
// - 고등학생은 학년, 반, 과목 6개(국영수과사역)가 있다. 또한 과목당 6학기 점수가 있다.
// - 학기는 1-1, 1-2, 2-1, 2-2, 3-1, 3-2학기가 있다.
// - 모든 학생은 이름, 생년월일, 성별 정보가 있다.

// 요구 메소드
// - 과목별, 학기별 평균점수를 구하는 메소드 
// - 학년별 평균점수를 구하는 메소드
// - 이름, 학년, 반을 출력하는 메소드
// - 기타 필요한 메소드

package com.inheritance.my.school;

public class Index
{
	
	public static void main(String[] args)
	{
		Middle mstu = new Middle ("Kim", "09-01-01", "M", "1", "2");
		
		int[][] mstuScore = new int[][] {
			
				{40,  45,  35,  45},
				{45,  50,  40,  50},
				{65,  75,  65,  75},
				{45,  55,  70,  80},
				{70,  85,  100, 90},
				{100, 100, 100, 100}};
		
		mstu.setScore(mstuScore);
		
		System.out.println(mstu.getAveragebySubject("과학"));
	}
}
