package com.intrface.teacher.msdevice;

// MS에서 만들어서 제공함
public interface Printable
{
	// interface의 특징
	// static 메소드 선언만 가능하다. 변수 선언은 불가하다.
	// static final 생략이 가능하다.
	// 기본 public이기 때문에 public 생략이 가능하다
	
	/* public static final */ int HP_ID = 1003;
							  int LG_ID = 1004;
	
	public static String getVersion()
	{
		return "ver 1.0 copyright Microsoft";
	}
	
	// 프린터를 초기화
	/* public */ boolean initPrinter();
	
	// 문서를 출력
	/* public */ boolean printDoc(String doc);

}