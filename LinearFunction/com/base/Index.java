// 일차함수 계산 로직
// 2. 메인 클래스

// 마지막 출력을 위한 본 클래스
package com.base;

import com.system.*;

public class Index {

	public static void main(String[] args)
	{
		// 의문점 : 각각의 값에 new가 추가된 이유, 없으면 "undefined for the type" 오류 발생
		Function lf = new Function(new Position(1,3), new Position(2,5));
		
		System.out.println(lf.printForm());
	}
}