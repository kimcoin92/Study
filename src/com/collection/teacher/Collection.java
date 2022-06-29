package com.collection.teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Collection
{
	public static void main(String[] args)
	{
		// 컬렉션 인스턴스 (컬렉션 클래스)의 생성
		// ArrayList는 배열을 기반으로 데이터를 유지한다.
		// 장점 : 참조, 즉 읽기가 빠르다.
		// 단점 : 데이터 구조 (데이터 개수)가 바뀌는 경우 느려진다.
		List<String> list = new ArrayList<>();
		
		// 리스트에 데이터를 넣었다.
		list.add("ABC");
		list.add("DEF");
		list.add("DEF");
		list.add("DEF");
		list.add("DEF");
		list.add("DEF");
		list.add("GHI");
		
		// 반복자
		Iterator<String> iter = list.iterator();
		
		// 삭제할 문자열에 대한 변수
		String delstr = new String();
		
		while(iter.hasNext())
		{
			// iter의 다음 문자열을 넣는다.
			delstr = iter.next();
			
			// 삭제할 문자열에 원하는 문자열이 있으면 지운다. (반복)
			if (delstr.equals("DEF"))
			{
				iter.remove();
			}
		}
		
		iter = list.iterator();
		
		// 데이터를 읽는다.
		for (String str : list)
		{
			System.out.println(str);
		}
		
		// 데이터를 지운다.
//		list.remove(1);
	}
}