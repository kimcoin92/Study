package com.algorithm.my.list;

public class ListContainer {
	
	public static final int NO_DATA_FOUND = -1;
	
	private Node head;
	private int  count;
	
	public Node getLastNode()
	  {
			Node lastNode = head;
			
			for (int i = 0; i < count - 1; i++)
			{
				lastNode = lastNode.getNext();
			}
			return lastNode;
		}
	
	public boolean insertNode()
	{
		Node lastNode = null;
	    Node newNode = new Node();
	    
	    if(head == null)
	    	
	    	head = newNode;
	    
	    lastNode = getLastNode();
	    lastNode.setNext(newNode);
	    
	    count++;
	    
	    return true;
	}
	
	public boolean insertNode(Node _newNode)
	{
		Node lastNode = null;
	    Node newNode = _newNode;
	    
	    if(head == null)
	    	
	    	head = newNode;
	    
	    lastNode = getLastNode();
	    lastNode.setNext(newNode);
	    
	    count++;
	    
	    return true;
	}
	
	public boolean insertNode(int _value1, String _value2)
	{
		Node lastNode = null;
	    Node newNode = new Node(_value1, _value2);
	    
	    if(head == null)
	    	
	    	head = newNode;
	    
	    lastNode = getLastNode();
	    lastNode.setNext(newNode);
	    
	    count++;
	    
	    return true;
	}
	
	public boolean deleteNodebyIndex(int _index)
	{
		Node target = head;
		Node prev   = null;
		
		if (0 == count)
		{
			return false;
		}
		
		if ((count <= _index) || (_index < 0))
		{
			return false;
		}
			
		for (int i = 0; i < _index; i++)
		{
			prev   = target;
			target = target.getNext();
		}
		
		if (prev == null)
		{
			head = target.getNext();
		}
		else
		{
			prev.setNext(target.getNext());
		}
			
		count--;
		
	    return true;
	}
	
	// Int 값을 찾아서 해당 노드 위치를 리턴한다.
	public int findNode(int value)
	{
		int index = -1;
		
		Node target = head;
		NodeData data = null;
		
		
		while (value != data.getValue1())
		{
			target = target.getNext();
			
			index++;

		}
		
		return index;
	}
	
	// String 값을 찾아서 노드 위치를 리턴한다.
	public int findNode(String value)
	{
		int index = -1;
		
		Node target = head;
		
		while (value != target.getData().getValue2())
			// getData에 null값이 들어가면 예외 발생
			// 위의 구조는 문제점 발생의 소지가 있다.
		{
			target = target.getNext();
			
			index++;
			
			if (target == null)
			{
				return NO_DATA_FOUND;
			}
		}
		
		return index;
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
		Node target = head;
		NodeData data = null;
		
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			System.out.println("index = " + i);
			
			if (null == data)
			{
				System.out.println("null");
			}
			else
			{
				System.out.println("index = " + i);
				System.out.printf("%d, %s\n", data.getValue1(), data.getValue2());
			}
			System.out.println("----------------------------");
			
			target = target.getNext();
		}
	}
}
