package com.algorithm.imprt.list;

import com.algorithm.imprt.*;

public class Index {

	public static void main(String[] args) {
		
//		NodeData d1 = new NodeData();
//		NodeData d2 = new NodeData(3, "abc");
//		
//		Node n1 = new Node();
//		// 기본 생성자 테스트
//		
//		Node n2 = new Node(d2);
//		// 데이터 추가 테스트
//		
//		Node n3 = new Node(1, "abc");
//		// 데이터 추가 + 값 입력
		
		
		ListContainer lc = new ListContainer();
		
		
		lc.insertNode(new Node(1, "abc"));
		// 노드를 만들고, 그 노드의 리턴값을 노드에 보내준다.
		
		lc.insertNode(new Node(2, "bac"));
		
		lc.insertNode(new Node(3, "def"));
		
		lc.deleteNodebyIndex(0);
		
		lc.printALL();

	}

}
