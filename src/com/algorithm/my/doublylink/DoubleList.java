package com.algorithm.my.doublylink;

public class DoubleList {

	public static void main(String[] args) {

		ListContainer list = new ListContainer();
		
//		list.insertNode();
//		list.insertNode(1);
//		list.insertNode(new Node);
//		list.insertNode(new Node(), 1);
//		list.insertNode(new NodeData(1, "a"));
//		list.insertNode(new NodeData(2, "b"), 3);
//		list.insertNode(6, "a");
//		list.insertNode(4, "d", 5);
		
		list.insertNode(6, "a");
		list.insertNode(6, "b");
		list.insertNode(6, "c");
		list.insertNode(6, "d");
		list.insertNode(6, "e");
		list.insertNode(6, "f");
		list.insertNode(6, "g");
		list.insertNode(6, "h");
		list.insertNode(6, "i");
		
//		◆ 0번 index의 데이터를 지워라.
//		list.deleteNodebyIndex(4); 

//		◆ value1이 5인 데이터를 지워라.
//		list.deleteNodebyValue(6);
		
//		◆ value2가 abc인 데이터를 지워라.
//		◇ int deleteNodebyString(String _str)
		
//		◆ value1이 5이고 value2가 abc인 데이터를 지워라. (and 조건)
//		◇ boolean deleteNodebyIndex(int _value, String _value2)
		
		list.printAll();
		
	}
}