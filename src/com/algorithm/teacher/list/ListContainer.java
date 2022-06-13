package com.algorithm.teacher.list;

public class ListContainer {
	
	public static final int MAX_COUNT = 10;
	protected Node head;
	protected int  count;
	
	// ������ ��带 ã�ƿ´�.
	public Node getLastNode()
	  {
			Node lastNode = head;
			
			for (int i = 0; i < count - 1; i++)
	    {
				lastNode = lastNode.getNext();
			}
			return lastNode;
		}
	
	// ��带 �߰��Ѵ�.
	public boolean insertNode()
	{
		Node lastNode = null;
	    Node newNode = new Node();
	
	    if(count >= MAX_COUNT)
	      
	    	return false;
	    
	    if(head == null)
	    	
	    	head = newNode;
	    
	    lastNode = getLastNode();
	    lastNode.setNext(newNode);
	    
	    count++;
	    
	    return true;
	    
	}
	
	public boolean insertNode(Node newNode)
	{
		return true;
	}
	
	// ��带 �����Ѵ�.
	public boolean deleteNodebyIndex(int index)
	{
		return true;
	}
	
	// int ���� ã�Ƽ� �ش� ��带 �����Ѵ�.
	public int findNode(int value)
	{
		return 0;
	}
	
	// String ���� ã�Ƽ� �ش� ��带 �����Ѵ�.
	public int findNode(String value)
	{
		return 0;
	}
	
	// ��� �����͸� �����Ѵ�.
	public NodeData getNodeData(int index)
	{
		return null;
	}
	
	// ��� ������ �����Ѵ�.
	public int getNodeCount()
	{
		return 0;
	}
	
	// ��� ��带 ����Ѵ�.
	public void printAll()
	{
		
	}
}
