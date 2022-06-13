package com.algorithm.teacher.list;

public class ListContainer {
	
	public static final int MAX_COUNT = 10;
	protected Node head;
	protected int  count;
	
	// 마지막 노드를 가져온다.
	public Node getLastNode()
	  {
			Node lastNode = head;
			
			for (int i = 0; i < count - 1; i++)
	    {
				lastNode = lastNode.getNext();
			}
			return lastNode;
		}
	
	// 노드를 추가한다.
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
	
	// 노드를 지운다.
	public boolean deleteNodebyIndex(int index)
	{
		return true;
	}
	
	// Int 값을 찾아서 해당 노드를 리턴한다.
	public int findNode(int value)
	{
		return 0;
	}
	
	// String 값을 찾아서 해당 노드를 리턴한다.
	public int findNode(String value)
	{
		return 0;
	}
	
	// 노드 데이터를 리턴한다.
	public NodeData getNodeData(int index)
	{
		return null;
	}
	
	// 노드 개수를 리턴한다.
	public int getNodeCount()
	{
		return 0;
	}
	
	// 모든 노드를 출력.
	public void printAll()
	{
		
	}
}
