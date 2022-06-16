package com.algorithm.teacher.singlylist;

import com.algorithm.my.singlylink.Node;
import com.algorithm.my.singlylink.NodeData;

public class ListContainer {
	
	private Node header;
	private int  count;
	
	public Node getLastNode()
	  {
			Node lastNode = header;
			
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
	    
	    if(header == null)
	    	
	    	header = newNode;
	    
	    lastNode = getLastNode();
	    lastNode.setNext(newNode);
	    
	    count++;
	    
	    return true;
	}
	
	public boolean insertNode(Node _newNode)
	{
		Node lastNode = null;
	    Node newNode = _newNode;
	    
	    if(header == null)
	    	
	    	header = newNode;
	    
	    lastNode = getLastNode();
	    lastNode.setNext(newNode);
	    
	    count++;
	    
	    return true;
	}
	
	public boolean insertNode(int _value1, String _value2)
	{
		Node lastNode = null;
	    Node newNode = new Node(_value1, _value2);
	    
	    if(header == null)
	    	
	    	header = newNode;
	    
	    lastNode = getLastNode();
	    lastNode.setNext(newNode);
	    
	    count++;
	    
	    return true;
	}
	
	public boolean deleteNodebyIndex(int index)
	{
		Node target = header;
		Node before = null;
		
		// count의 유효성을 검사
		if (count == 0)
		{
			return false;
		}
		
		// index의 유효성을 검사
		if ((count <= index) || (index < 0))
		{
			return false;
		}
		
		for (int i = 0; i < index; i++)
		{
			before = target;
		    target = target.getNext();
		}
		
		// 0번째 인덱스를 지운다.
		if (before == null)
		{
			header = target.getNext();
		}
		else
		{
			before.setNext(target.getNext());
		}
		
		count--;
		
	    return true;
	}
	
	// Int 값을 찾아서 해당 노드 위치 리턴한다.
	public int findNode(int value)
	{
		// 노드를 헤더부터 마지막 노드까지 순회하면서
		// 만약 value를 찾는다면 그 노드의 인덱스를 리턴한다.
		
		Node target = header;
		NodeData data = null;
		int result = -1;
		
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			if(null != data)
			{
				if (value != data.getValue1())
				{
					result = i;
					
					break;
				}
			}
			target = target.getNext();
		}
		
		return result;
	}
	
	// String 값을 찾아서 해당 노드 위치 리턴한다.
	public int findNode(String value)
	{
		Node target = header;
		NodeData data = null;
		
		int result = -1;
		
		for (int i = 0; i < count; i++)
		{
			if(null != data)
			{
				if (value != data.getValue2())
				{
					result = i;
					
					break;
				}
			}
			target = target.getNext();
		}
		
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
		return count;
	}
	
	// 모든 노드를 출력.
	public void printAll()
	{
		Node target = header;
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
