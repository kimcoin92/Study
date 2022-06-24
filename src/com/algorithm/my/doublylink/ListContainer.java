package com.algorithm.my.doublylink;

public class ListContainer {
	private Node head;
	private Node tail;
	private Node recent;
	private int  recentIndex;
	private int count;
	
	public ListContainer()
	{
		head = null;
		tail = null;
		recent = null;
		recentIndex = 0;
		count = 0;		
	}
	
	public Node getNode(int index)
	{
		Node result = head;
		
		if (index >= count)
		{
			return null;
		}
			
		for (int i = 0; i < index; i++)
		{
			result = result.getNext();
		}
		
		return result;
	}
	
	public Node getNodeByRecent(int index)
	{
		Node result = null;
		
		if (index >= count)
		{
			return null;
		}
		
		if (recent == null)
		{
			result = head;
			
			for (int i = 0; i < index; i++)
			{
				result = result.getNext();
				recentIndex++;
			}
		}
		else
		{
			result = recent;
			
			if  (recentIndex > index)
			{
				for (int i = 0; i < recentIndex - index; i++)
				{
					result = result.getPrev();
					recentIndex--;
				}
			}
			else if (recentIndex < index)
			{
				for (int i = 0; i < index - recentIndex; i++)
				{
					result = result.getNext();
					recentIndex++;
				}
			}
		}
		
		recent = result;
		return result;
	}

	public Node getNodeByHalf(int index)
	{
		Node result = null;
		
		if (index >= count)
		{
			return null;
		}
		
		if (index < count / 2)
		{
			result = head;
			
			for (int i = 0; i < index; i++)
			{
				result = result.getNext();
			}
		}
		else if (index > count / 2)
		{
			result = tail;
			
			for (int i = 0; i < index; i++)
			{
				result = result.getPrev();
			}
		}
		return result;
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
		else if (count == 1)
		{
			head = newNode;
			
			target = getNode(count - 1);
			
			target.setNext(newNode);
			newNode.setPrev(target);
		}
		else
		{
			// 마지막 노드를 가지고 와서 그 뒤에 물린다.
			target = getNode(count - 1);
			
			target.setNext(newNode);
			newNode.setPrev(target);
		}
		
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
			if (_value1 == data.getValue1())
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
			if (true == _value2.equals(data.getValue2()))
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
			if ((_value1 == data.getValue1()) && (true == _value2.equals(data.getValue2())))
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
				System.out.printf("%d, %s\n", data.getValue1(), data.getValue2());
				
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
