// 2. 메인 클래스
// 마지막 출력을 위한 본 클래스

package main;

public class Main {

	public static void main(String[] args)
	{
		// 의문점 : 각각의 값에 new가 적힌 이유
		// 없으면 타입이 없다는 오류 발생
		Function lf = new Function(new Position(1,3), new Position(2,5));
		
		System.out.println(lf.printForm());
		
	}

}
