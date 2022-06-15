package com.example.teacher.intrface.ms;

public interface Scanable
{
	// 추상 인터페이스
	// "이렇게 구현 했습니다." (X)
	// "이렇게 구현 해야 해." 라고 제시하는 기능
	boolean initScanner();
	boolean scanDoc(String doc);
}
