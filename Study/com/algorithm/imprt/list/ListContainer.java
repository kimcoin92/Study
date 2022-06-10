package com.algorithm.imprt.list;

public class ListContainer {
	
	public final int MAX_NODE = 5000;
	
	private Node	head;
	private int		nodeCount;
	
	public ListContainer() {
		
		
		// head의 초기값
		head = null;
		
		nodeCount = 0;
		
	}
	
	// 3. 마지막 노드를 찾기 위한 노드 제작
	private Node getLastNode() {
		
		
		Node lastNode = head;
		
		for (int i = 0; i < nodeCount - 1; i++) {
			
			
			lastNode = lastNode.getNext();
			
		}
		
		return lastNode;
		
	}
	
	public boolean insertNode(Node newNode) {
		// 뒤에 노드 삽입
		
		
		Node lastNode = null;
		
		if (nodeCount >= MAX_NODE) {
			
			return false;
			
		}
		
		
		if (head == null) {
			
			
			head = newNode;
			
		} else {
			
			
			// 1. 마지막 노드를 찾는다.
			lastNode = getLastNode();
			
			// 2. 마지막노드.setNext(newNode)
			lastNode.setNext(newNode);
			
		}
		
		nodeCount++;
		
		return true;
		
	}
	
	public boolean deleteNodebyIndex(int index) {
			
			Node targetNode = head;
			
			Node prevNode = null;
			
			Node nextNode = null;
			
			if (nodeCount < index || index < 0) {
				
				return false;
				
			} else {
				
				while (targetNode.getNext() != null) {
					
					targetNode = targetNode.getNext();

				}
				
				prevNode = targetNode;
				
				nextNode = targetNode.getNext();
				
				nextNode = null;
				
				nodeCount--;
						
			}
			
			prevNode.setNext(nextNode);
			
			return true;
					
			}
	
	
	public boolean deleteNodebyData(int value1) {
		
		
		
		
		return true;
		
	}
	
	public void printALL() {
		
		
		NodeData data = null;
		
		Node target = head;
		
		for (int i = 0; i < nodeCount; i++) {
			
			
			data = target.getData();
			// Data를 가져온다.
					
					System.out.println(i + " node, Value1 = " + data.getValue1() + ", value2 = " + data.getValue2());
					
					target = target.getNext();
			
		}
		
	}

	public boolean frontinsertNode(Node newNode, int type) {
		// 뒤에서 노드 삽입
		
		return true;
		
	}
	
	public boolean insertNode2(NodeData newData) {
		// 노드 데이터
		
		return true;
		
	}
	
	public boolean insertNode3(int value1, String value2) {
		// 노드 + 데이터 + 데이터 파라미터
		
		return true;
		
	}

}
