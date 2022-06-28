package com.algorithm.my.doublylist;

public class ListContainer {
	private Node head;
	private Node tail;
	private int count;
	
	public ListContainer()
	{
		head = null;
		tail = null;
		count = 0;
	}
	
	public Node getNode(int _index)
	{
		Node target = null;
		int middle = count / 2;
		
		if ((_index < 0) || (_index >= count))
		{
			return null;
		}
		
		if (_index <= middle)
		{
			target = head;
			
			for (int i = 0; i < _index; i++)
			{
				target = target.getNext();
			}
		}
		else if (_index > middle)
		{
			target = tail;
			
			for (int i = 0; i < (count - _index - 1); i++)
			{
				target = target.getPrev();
			}
		}
		return target;
	}

	public boolean insertNode()
	{
		Node target = null;
		Node newNode = new Node();
		
		if (count == 0)
		{
			head = newNode;
		}
		else if (count == 1)
		{
			head = newNode;
			
			target = getNode(count - 1);
			
			target.setNext(newNode);
			newNode.setPrev(target);
		}
		else
		{
			target = getNode(count - 1);
			
			target.setNext(newNode);
			newNode.setPrev(target);
		}
		tail = newNode;
		count++;
		return true;
	}

	public boolean insertNode(int pos)
	{
		Node target = null;
		Node newNode = new Node();
		
		if (pos < 0)
		{
			return false;
		}
		if (count == 0)
		{
			head = newNode;
		}
		else if (pos > count)
		{
			target = getNode(count - 1);
			target.setNext(newNode);
			newNode.setPrev(target);
		}
		else if (pos == 0)
		{
			target = getNode(pos);
			newNode.setNext(target);
			target.setPrev(newNode);
			head = newNode;
		}
		else
		{
			target = getNode(pos);
	
			newNode.setNext(target);
			newNode.setPrev(target.getPrev());
			
			target.setPrev(newNode);
			newNode.getPrev().setNext(newNode);
		}
		
		if (pos > count)
		{
			tail = newNode;
		}
		
		count++;
		return true;
	}

	public boolean insertNode(Node _newNode)
	{
		Node target = null;
		Node newNode = _newNode;
		

		if (count == 0)
		{
			head = newNode;			
		}
		else
		{

			target = getNode(count - 1);
			
			target.setNext(newNode);
			newNode.setPrev(target);
		}
		
		tail = newNode;
		
		count++;

		return true;
	}
	
	public boolean insertNode(Node _newNode, int pos)
	{
		Node target = null;
		Node newNode = _newNode;
		
		if (pos < 0)
		{
			return false;
		}
		
		
		if (count == 0)
		{

			head = newNode;
			
		}
		else if (pos > count)
		{

			target = getNode(count - 1);
			target.setNext(newNode);
			newNode.setPrev(target);
			
		}
		else if (pos == 0)
		{

			target = getNode(pos);
			
			newNode.setNext(target);
			target.setPrev(newNode);
			
			head = newNode;
		}
		else
		{
			target = getNode(pos);
			
			newNode.setNext(target);
			newNode.setPrev(target.getPrev());
			
			target.setPrev(newNode);
			newNode.getPrev().setNext(newNode);
		}
		
		if (pos > count)
		{
			tail = newNode;
		}
		
		count++;
		return true;
		
	}

	public boolean insertNode(NodeData _newNodeData)
	{
		Node target = null;
		Node newNode = new Node();
		
		newNode.setData(_newNodeData);
		

		if (count == 0)
		{
			head = newNode;			
		}
		else
		{
			target = getNode(count - 1);
			
			target.setNext(newNode);
			newNode.setPrev(target);
		}
		
		tail = newNode;
		
		count++;
		
		return true;
	}
	
	public boolean insertNode(NodeData _newNodeData, int pos)
	{
		Node target = null;
		Node newNode = new Node();
		newNode.setData(_newNodeData);
		
		if (pos < 0)
		{
			return false;
		}
		
		
		if (count == 0)
		{

			head = newNode;
			
		}
		else if (pos > count)
		{

			target = getNode(count - 1);
			target.setNext(newNode);
			newNode.setPrev(target);
			
		}
		else if (pos == 0)
		{

			target = getNode(pos);
			
			newNode.setNext(target);
			target.setPrev(newNode);
			
			head = newNode;
			
		}
		else
		{
			target = getNode(pos);
			
			newNode.setNext(target);
			newNode.setPrev(target.getPrev());
			
			target.setPrev(newNode);
			newNode.getPrev().setNext(newNode);
			
		}
		
		if (pos > count)
		{
			tail = newNode;
		}
		
		count++;
		return true;
	}

	public boolean insertNode(int _value1, String _value2)
	{
		Node target = null;
		Node newNode = new Node();
		newNode.setData(_value1, _value2);
		
		if (count == 0)
		{
			head = newNode;			
		}
		else
		{
			target = getNode(count - 1);
			target.setNext(newNode);
			newNode.setPrev(target);
		}
		tail = newNode;
		count++;
		return true;		
	}
	
	public boolean insertNode(int _value1, String _value2, int pos)
	{
		Node target = null;
		
		Node newNode = new Node();
		newNode.setData(_value1, _value2);
		
		if (pos < 0)
		{
			return false;
		}
			
		if (count == 0)
		{

			head = newNode;
			
		}
		else if (pos > count)
		{

			target = getNode(count - 1);
			target.setNext(newNode);
			newNode.setPrev(target);
			
		}
		else if (pos == 0)
		{

			target = getNode(pos);
			
			newNode.setNext(target);
			target.setPrev(newNode);
			
			head = newNode;
			
		}
		else
		{
			target = getNode(pos);
			
			newNode.setNext(target);
			newNode.setPrev(target.getPrev());
			
			target.setPrev(newNode);
			newNode.getPrev().setNext(newNode);
			
		}
		
		if (pos > count)
		{
			tail = newNode;
		}
		
		count++;			
		return true;
	
	}
		
	public boolean deleteNodebyIndex(int _index)
	{
		Node target = null;
		Node prevNode = null;
		Node nextNode = null;
		
		if (count <= _index)
			return false;

		target = getNode(_index);
		
		if (_index == 0)
		{
			nextNode = target.getNext();			
		
			nextNode.setPrev(null);
			head = target.getNext();
			
		}
		else if (_index == (count-1))
		{			
			prevNode = target.getPrev();
			prevNode.setNext(null);
			
		}
		else
		{					
			prevNode = target.getPrev();
			nextNode = target.getNext();
			
			prevNode.setNext(nextNode);
			nextNode.setPrev(prevNode);
					
		}
		
		if (_index == (count-1))
		{
			tail = prevNode;
		}
		
		count--;
		return true;
	}

	public int deleteNodebyValue(int _value1)
	{		
		int delCount = 0;
		int i = 0;
		Node target = head;
		NodeData data = null;
		
		do
		{
			data = target.getData();
			
			if (_value1 == data.getValue1())
			{
				deleteNodebyIndex(i - delCount);
				delCount++;				
			}
			
			target = target.getNext();							
			i++;
			
		} while(target != null);
		
		return delCount;
		
	}
	
	public int deleteNodebyValue(String _value2)
	{
		int delCount = 0;
		int i = 0;
		Node target = head;
		NodeData data = null;
		
		do
		{
			data = target.getData();
			
			if (true == _value2.equals(data.getValue2()))
			{
				deleteNodebyIndex(i - delCount);
				delCount++;	
			}
			
			target = target.getNext();							
			i++;
			
		} while (target != null);
		
		return delCount;
	}
	
	public int deleteNodebyValue(int _value1, String _value2)
	{
		int delCount = 0;
		int i = 0;
		Node target = head;
		NodeData data = null;
		
		do
		{
			data = target.getData();

			if ((_value1 == data.getValue1()) && (true == _value2.equals(data.getValue2())))
			{
				deleteNodebyIndex(i - delCount);
				delCount++;		
			}

			target = target.getNext();							
			i++;
			
		} while(target != null);
		
		return delCount;
	}
	
	public void printAll()
	{
		Node target = head;
		NodeData data = null;
		
		for (int i = 0; i < count - 1; i++)
		{
			data = target.getData();
			
			System.out.println("index = " + i);

			if (null == data)
			{
				System.out.println("null");
			}
			else
			{
				System.out.printf("%d, %s\n", data.getValue1(), data.getValue2());
			}
			System.out.println("-------------------");
			
			target = target.getNext();
		}
				
	}

	public int[] findNode (int _value1)
	{
		Node target    = head;
		NodeData data  = null;
		int matchCount = 0;
		int idx        = 0;
		int[] result;
		
		while (target != null)
		{
			data   = target.getData();
			
			if (_value1 == data.getValue1())
			{
				matchCount++;
			}
			target = target.getNext();
		}
		
		if (matchCount == 0)
		{
			return null;
		}
		
		result = new int[matchCount];
		target = head;
		
		for (int i = 0; i < count; i++)
		{
			data   = target.getData();
			
			if (_value1 == data.getValue1())
			{
				result[idx] = i;
				idx++;
			}
			target = target.getNext();
		}
		return result;
	}
	
	public int[] findNode (String _value2)
	{
		Node target    = head;
		NodeData data  = null;
		int matchCount = 0;
		int idx        = 0;
		int[] result;
		
		while (target != null)
		{
			data   = target.getData();
			
			if (true == _value2.equals(data.getValue2()))
			{
				matchCount++;
			}
			target = target.getNext();
		}
		
		if (matchCount == 0)
		{
			return null;
		}
		
		result = new int[matchCount];
		target = head;
		
		for (int i = 0; i < count; i++)
		{
			data   = target.getData();
			
			if (true == _value2.equals(data.getValue2()))
			{
				result[idx] = i;
				idx++;
			}
			target = target.getNext();
		}
		return result;
	}
	
	public int[] findNode (int _value1, String _value2)
	{
		Node target    = head;
		NodeData data  = null;
		int matchCount = 0;
		int idx        = 0;
		int[] result;
		
		while (target != null)
		{
			data   = target.getData();
			
			if ((_value1 == data.getValue1()) && (true == _value2.equals(data.getValue2())))
			{
				matchCount++;
			}
			target = target.getNext();
		}
		
		if (matchCount == 0)
		{
			return null;
		}
		
		result = new int[matchCount];
		target = head;
		
		for (int i = 0; i < count; i++)
		{
			data   = target.getData();
			
			if ((_value1 == data.getValue1()) && (true == _value2.equals(data.getValue2())))
			{
				result[idx] = i;
				idx++;
			}
			target = target.getNext();
		}
		return result;
	}

}
