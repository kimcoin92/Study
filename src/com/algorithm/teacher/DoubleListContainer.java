package com.algorithm.teacher;

public class DoubleListContainer {
	private Node head;		// 노드의 처음
	private Node tail;		// 노드의 마지막	
	private int count;		// 노드의 개수
	
	public DoubleListContainer()
	{
		head = null;
		tail = null;
		count = 0;		
	}
	
	public int getCount()
	{
		return count;
	}
	
	
	public Node getNode(int _index)
	{
		Node target = null;	
		
		int middle = count / 2;
		
		if ((_index < 0) || (_index >=count))
			return null;
		
		// head부터 찾아 들어간다.
		if (_index <= middle)
		{
			target = head;
			
			for (int i = 0; i < _index; i++)
			{
				target = target.getNext();
				
			}
						
		}
		else
		{
			target = tail;
			
			for (int i = 0; i < (count -_index - 1); i++)
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
		
		// 노드가 하나도 없음.
		if (count == 0)
		{
			head = newNode;			
		}
		else
		{
			// 마지막 노드를 가지고 와서 그 뒤에 물린다.
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
			// OK
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
		
		// 노드가 하나도 없음.
		if (count == 0)
		{
			head = newNode;			
		}
		else
		{
			// 마지막 노드를 가지고 와서 그 뒤에 물린다.
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
			//OK
			head = newNode;
			
		}
		else if (pos > count)
		{
			//OK
			target = getNode(count - 1);
			target.setNext(newNode);
			newNode.setPrev(target);
			
		}
		else if (pos == 0)
		{
			// OK
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
		
		// 노드가 하나도 없음.
		if (count == 0)
		{
			head = newNode;			
		}
		else
		{
			// 마지막 노드를 가지고 와서 그 뒤에 물린다.
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
			//OK
			head = newNode;
			
		}
		else if (pos > count)
		{
			//OK
			target = getNode(count - 1);
			target.setNext(newNode);
			newNode.setPrev(target);
			
		}
		else if (pos == 0)
		{
			// OK
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
		
		// 노드가 하나도 없음.
		if (count == 0)
		{
			head = newNode;			
		}
		else
		{
			// 마지막 노드를 가지고 와서 그 뒤에 물린다.
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
			//OK
			head = newNode;
			
		}
		else if (pos > count)
		{
			//OK
			target = getNode(count - 1);
			target.setNext(newNode);
			newNode.setPrev(target);
			
		}
		else if (pos == 0)
		{
			// OK
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
	
	
	public void deleteAll()
	{
		int delCount = count;
		for (int i = 0; i < delCount; i++)
			deleteNodebyIndex(0);
		
	}
		
	public void cleanUp()
	{		
		Node current = head;
		Node next = null;
		
		for (int i = 0; i < count; i++)
		{
			next = current.getNext();
			
			current.setNext(null);
			current.setPrev(null);
			
			current = next;
			
		}		
		
		head = null;
		tail = null;
		count = 0;
				
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
		
			if (nextNode == null)
			{
				head = null;
				tail = null;				
			}
			else
			{
				nextNode.setPrev(null);
				head = target.getNext();					
				
			}
						
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
		
		// 제일 마지막 노드를 지운다.
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
			// 1. 데이터를 가지온다. 
			data = target.getData();
			
			// 데이터가 지워할 놈이면
			if (_value1 == data.getvalue1())
			{
				//지운뒤 지운 횟수 증가
				deleteNodebyIndex(i - delCount);
				delCount++;
							
			}

			// 타겟을 다음으로 옮긴다.
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
			// 1. 데이터를 가지온다. 
			data = target.getData();
			
			// 데이터가 지워할 놈이면
			if (true == _value2.equals(data.getvalue2()))
			{
				//지운뒤 지운 횟수 증가
				deleteNodebyIndex(i - delCount);
				delCount++;
							
			}

			// 타겟을 다음으로 옮긴다.
			target = target.getNext();							
			i++;
			
		} while(target != null);
		
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
			// 1. 데이터를 가지온다. 
			data = target.getData();
			
			// 데이터가 지워할 놈이면
			if ((_value1 == data.getvalue1()) &&
				(true == _value2.equals(data.getvalue2())))
			{
				//지운뒤 지운 횟수 증가
				deleteNodebyIndex(i - delCount);
				delCount++;
							
			}

			// 타겟을 다음으로 옮긴다.
			target = target.getNext();							
			i++;
			
		} while(target != null);
		
		return delCount;

	}
	
	public void printAll()
	{
		Node target = head;
		NodeData data = null;
		
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			System.out.println("index = " + i);

			if (null == data)				
				System.out.println("null");
			else
				System.out.printf("%d, %s\n", data.getvalue1(), data.getvalue2());
				
			System.out.println("-------------------");
			
			target = target.getNext();
		}
				
	}

	
	public int[] findNode(int _value1)
	{		
		int [] result = null;
		
		Node target = head;
		NodeData data = null;
		int dataCount = 0;
				
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			// data가 존재한다.
			if (null != data)				
			{
				if (_value1 == data.getvalue1())
					dataCount++;
					
			}
			
			target = target.getNext();
		}
		
		result = new int[dataCount];	
		target = head;
		int idx = 0;
		
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			// data가 존재한다.
			if (null != data)				
			{
				if (_value1 == data.getvalue1())
				{
					result[idx] = i;
					idx++;			
					
				}
					
			}
			
			target = target.getNext();
		}
		
		return result;		
		
	}
		
	public int[] findNode(String _value2)
	{
		int [] result = null;
		
		Node target = head;
		NodeData data = null;
		int dataCount = 0;
				
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			// data가 존재한다.
			if (null != data)				
			{
				if (_value2.equals(data.getvalue2()))
					dataCount++;
					
			}
			
			target = target.getNext();
		}
		
		result = new int[dataCount];	
		target = head;
		int idx = 0;
		
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			// data가 존재한다.
			if (null != data)				
			{
				if (_value2.equals(data.getvalue2()))
				{
					result[idx] = i;
					idx++;			
					
				}
					
			}
			
			target = target.getNext();
		}
		
		return result;		
		
			
	}
	
	public int[] findNode(int _value1, String _value2)
	{		
		int [] result = null;
		
		Node target = head;
		NodeData data = null;
		int dataCount = 0;
		
		if (count == 0)
			return null;
				
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			// data가 존재한다.
			if (null != data)				
			{
				if ((_value1 == data.getvalue1()) &&
				    (_value2.equals(data.getvalue2())))
					dataCount++;
					
			}
			
			target = target.getNext();
		}
		
		result = new int[dataCount];	
		target = head;
		int idx = 0;
		
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			// data가 존재한다.
			if (null != data)				
			{
				if ((_value1 == data.getvalue1()) &&
				    (_value2.equals(data.getvalue2())))					
				{
					result[idx] = i;
					idx++;			
					
				}
					
			}
			
			target = target.getNext();
		}
		
		return result;	
		
	}
	
		
}
