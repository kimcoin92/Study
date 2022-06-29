package com.generic.teacher.restrict;

// 인터페이스도 충분히 T의 타입 제한으로써 올 수 있다.
// 타입 제한으로 온다는 것은 인터페이스에 정의한 eat를 안에서 호출한다.
interface Eatable
{
	public String eat();
}