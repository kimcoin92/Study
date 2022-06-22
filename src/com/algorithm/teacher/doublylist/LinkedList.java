package com.algorithm.teacher.doublylist;

import java.util.Arrays;

public class LinkedList {

	public static void main(String[] args) {

		DoubleListContainer list1 = new DoubleListContainer();
		
		// 새로운 노드를 추가
		
		// 외부해서 노드와 참조 값을 입력
		list1.insertNode(1, "a");
		list1.insertNode(4, "b");
		list1.insertNode(4, "c");
		list1.insertNode(2, "d");
		list1.insertNode(4, "e");
		
		System.out.println(Arrays.toString(list1.findNode(4)));
		
		// 인덱스 위치의 노드를 삭제
//		list1.deleteNodebyIndex(2);
		
//		list1.setNodeData(4, 3, "c");
		
//		list1.printAll();
		
		// value2와 같은 노드를 찾는다
//		list1.findData("John");
		
	}
	
}
