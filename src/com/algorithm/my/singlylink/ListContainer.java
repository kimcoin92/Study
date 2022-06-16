package com.algorithm.my.singlylink;

import com.algorithm.teacher.singlylist.Node;
import com.algorithm.teacher.singlylist.NodeData;

public class ListContainer {
	
	public static final int NEGATIVE = -1;
	
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
	public int[] findNode(int _value)
	{
		Node target   = head;
		NodeData data = null;
		int[] result  = null;
		int arcount   = 0;
		int aridx     = 0;
		
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			if (_value == data.getvalue1())
			{
				arcount++;
			}
			target = target.getNext();
		}
		
		result = new int[arcount];
		
		target = head;
		
		for (int k = 0; k < count; k++)
		{
			data = target.getData();
				
			if (null != data)
			{
				if (_value == data.getvalue1())
				{
					result[aridx] = k;
					
					aridx++;
				}
			}
			target = target.getNext();
		}
		return result;
	}
	
	// String 값을 찾아서 노드 위치를 리턴한다.
	public int findNode(String _value)
	{
		int index = NEGATIVE;
		Node target = head;
		NodeData data = null;
		
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			if (target != null)
			{
				if (_value != data.getvalue2())
				{
					index = i;
					
					break;
				}
			}
			target = target.getNext();
		}
		return index;
	}
	
	// 노드 데이터를 리턴한다.
	public NodeData getNodeData(int index)
	{
		Node target = head;
		NodeData data = null;
		
		if (count <= index)
		{
			target = getLastNode();
		}
		else
		{
			for (int i = 0; i < index; i++)
			{
				target = target.getNext();
			}
		}
		data = target.getData();
		
		return data;
	}
	
	// 노드 개수를 리턴한다.
	public int getNodeCount()
	{
		return count;
	}
	
	// 모든 노드를 출력한다.
	public void printAll()
	{
		Node target = head;
		NodeData data = null;
		
		System.out.println("----------------------------");
		
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			if (null == data)
			{
				System.out.println("null");
			}
			else
			{
				System.out.println("index = " + i);
				System.out.printf("%d, %s\n", data.getvalue1(), data.getvalue2());
			}
			System.out.println("----------------------------");
			
			target = target.getNext();
		}
	}
}
