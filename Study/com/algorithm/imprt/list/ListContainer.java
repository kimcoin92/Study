package com.algorithm.imprt.list;

public class ListContainer {
	
	public final int MAX_NODE = 5000;
	
	private Node	head;
	private int		nodeCount;
	
	public ListContainer() {
		
		
		// head�� �ʱⰪ
		head = null;
		
		nodeCount = 0;
		
	}
	
	// 3. ������ ��带 ã�� ���� ��� ����
	private Node getLastNode() {
		
		
		Node lastNode = head;
		
		for (int i = 0; i < nodeCount - 1; i++) {
			
			
			lastNode = lastNode.getNext();
			
		}
		
		return lastNode;
		
	}
	
	public boolean insertNode(Node newNode) {
		// �ڿ� ��� ����
		
		
		Node lastNode = null;
		
		if (nodeCount >= MAX_NODE) {
			
			return false;
			
		}
		
		
		if (head == null) {
			
			
			head = newNode;
			
		} else {
			
			
			// 1. ������ ��带 ã�´�.
			lastNode = getLastNode();
			
			// 2. ���������.setNext(newNode)
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
			// Data�� �����´�.
					
					System.out.println(i + " node, Value1 = " + data.getValue1() + ", value2 = " + data.getValue2());
					
					target = target.getNext();
			
		}
		
	}

	public boolean frontinsertNode(Node newNode, int type) {
		// �ڿ��� ��� ����
		
		return true;
		
	}
	
	public boolean insertNode2(NodeData newData) {
		// ��� ������
		
		return true;
		
	}
	
	public boolean insertNode3(int value1, String value2) {
		// ��� + ������ + ������ �Ķ����
		
		return true;
		
	}

}
