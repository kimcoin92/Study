package com.algorithm.imprt.list;

import com.algorithm.imprt.*;

public class Index {

	public static void main(String[] args) {
		
//		NodeData d1 = new NodeData();
//		NodeData d2 = new NodeData(3, "abc");
//		
//		Node n1 = new Node();
//		// �⺻ ������ �׽�Ʈ
//		
//		Node n2 = new Node(d2);
//		// ������ �߰� �׽�Ʈ
//		
//		Node n3 = new Node(1, "abc");
//		// ������ �߰� + �� �Է�
		
		
		ListContainer lc = new ListContainer();
		
		
		lc.insertNode(new Node(1, "abc"));
		// ��带 �����, �� ����� ���ϰ��� ��忡 �����ش�.
		
		lc.insertNode(new Node(2, "bac"));
		
		lc.insertNode(new Node(3, "def"));
		
		lc.deleteNodebyIndex(0);
		
		lc.printALL();

	}

}
