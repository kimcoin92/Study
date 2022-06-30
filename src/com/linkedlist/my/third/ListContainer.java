package com.linkedlist.my.third;

public class ListContainer
{
	private Node	head;
	private Node	tail;
	private int		count;
	
	// Complete (Unchecked)
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
	
	// Complete (Unchecked)
	public int getCount()
	{
		return count;
	}
	
	// Completed (Checked)
	public boolean insertNode()
	{	
		Node newNode = new Node();
		Node target = null;
		
		if (0 == count)
		{
			head = newNode;
		}
		else
		if (1 == count)
		{
			target = head;
			
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

	// Completed (Unchecked)
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
	
	// Completed (Checked)
	public boolean insertNode(int _value1, String _value2)
	{	
		Node newNode = new Node(_value1, _value2);
		Node target = null;
		
		if (0 == count)
		{
			head = newNode;
		}
		else
		if (1 == count)
		{
			target = head;
			
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
	
	// Incomplete
	public boolean insertNode(int _value1, String _value2 , int _index)
	{	
		Node newNode  = new Node(_value1, _value2);
		Node target   = null;
		Node nextNode = null;
		
		if ((0 > _index) || (count <= _index))
		{
			return false;
		}
		
		if (0 == count)
		{
			head = newNode;
			tail = newNode;
		}
		else if (1 == count)
		{
			target = head;
			
			target.setNext(newNode);
			newNode.setPrev(target);
		}
		else if (_index == count - 1)
		{
			target = getNode(_index);
			
			target.setNext(newNode);
			newNode.setPrev(target);
		}
		else
		{
			target   = getNode(_index);
			nextNode = target.getNext();
			
			target.setNext(newNode);
			newNode.setPrev(target);
			
			nextNode.setPrev(newNode);
			newNode.setNext(nextNode);
		}
		
		if (_index > count)
		{
			tail = newNode;
		}
		count++;
		return true;
	}

	// Completed (Checked)
	public boolean deleteNode(int _index)
	{
		Node target = null;
		Node nextNode = null;
		Node prevNode = null;
		
		if ((0 > _index) || (count <= _index))
		{
			return false;
		}
		
		target = getNode(_index + 1);
		
		if (0 == _index)
		{
			nextNode = target.getNext();
			
			head = target.getNext();
			
			target.setNext(null);
			
			// 마지막 1개 노드가 남았을때 발생하는 예외를 막는 Guard-code
			if (1 < count)
			{
				nextNode.setPrev(null);
			}
		}
		else if ((count - 1) == _index)
		{
			prevNode = target.getPrev();
			
			target.setPrev(null);
			prevNode.setNext(null);
		}
		else
		{
			prevNode = target.getPrev();
			nextNode = target.getNext();

			prevNode.setNext(nextNode);
			nextNode.setPrev(prevNode);

			target.setPrev(null);
			target.setNext(null);
		}
		
		if ((count - 1) == _index)
		{
			tail = prevNode;
		}
		count--;
		return true;
	}
	
	// Completed (Checked)
	public void deleteAll()
	{
		Node target   = head;
		Node nextNode = null;
		
		for (int i = 0; i < count; i++)
		{
			nextNode = target.getNext();
			
			target.setNext(null);
			target.setPrev(null);
			
			target = nextNode;
		}
		
		head = null;
		tail = null;
		
		count = 0;
	}
	
	// Completed (Checked)
	public void printAll()
	{
		Node target		= head;
		NodeData data	= null;
		int index		= 0;
		
		System.out.println("--------------");
		
		if (0 == count)
		{
			System.out.println("    NoData");
			System.out.println("--------------");
		}
		
		while (target != null)
		{
			data = target.getData();
			
			if (data == null)
			{
				System.out.printf("Index  : %d%nNumber : null%nString : null%n", index);
			}
			else
			{
				System.out.printf("Index  : %d%nNumber : %d%nString : %s%n", index, data.getValue1(), data.getValue2());
			}
			index++;
			target = target.getNext();
			System.out.println("--------------");
		}
	}

	// 디버깅 및 테스트
	// 테스트 코드 제작
	// 분기 테스트
	// 경계값 분석
	// 동등분할

}
