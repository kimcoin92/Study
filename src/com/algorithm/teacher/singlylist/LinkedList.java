package com.algorithm.teacher.singlylist;

public class LinkedList {

	public static void main(String[] args) {

		ListContainer list1 = new ListContainer();
		
		// 새로운 노드를 추가
		
		// 외부해서 노드와 참조 값을 입력
		list1.insertNode(1, "a");
		list1.insertNode(2, "b");
		list1.insertNode(3, "c");
		list1.insertNode(4, "d");
		list1.insertNode(5, "e");
		
		// 인덱스 위치의 노드를 삭제
		list1.deleteNodebyIndex(2);
		
		list1.printAll();
		
		// value2와 같은 노드를 찾는다
//		list1.findData("John");
		
	}
	
}
