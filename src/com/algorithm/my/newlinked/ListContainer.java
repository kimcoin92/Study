package com.algorithm.my.newlinked;

public class ListContainer
{
	private Node	head;
	private Node	tail;
	private int		count;
	
	// Completed
	public Node getNode(int _index)
	{
		Node target = head;
		
		for (int i = 0; i < _index - 1; i++)
		{
			target = target.getNext();
		}
		return target;
	}
	
	// Completed
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
			target = getNode(count);
			
			target.setNext(newNode);
			newNode.setPrev(target);
		}
		tail = newNode;
		count++;
		return true;
	}
	
	// Incomplete
	public boolean insertNode(int _index)
	{	
		Node newNode = new Node();
		Node target  = null;
		
		if ((0 > _index) || (count < _index))
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
		else
		{
			target = getNode(_index);
			
			if (target.getNext() == null)
			{
				
			}
		}
		tail = newNode;
		count++;
		return true;
	}
	
	// Completed
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
			target = getNode(count);
			
			target.setNext(newNode);
			newNode.setPrev(target);
		}
		tail = newNode;
		count++;
		return true;
	}
	
	

	// Completed
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
	
	// Completed
	public boolean deleteAll()
	{
		Node target   = head;
		Node prevNode = null;
		
		if (0 == count)
		{
			return false;
		}
		
		while (target.getNext() != null)
		{
			target = target.getNext();
			prevNode = target.getPrev();
			
			prevNode.setNext(null);
			prevNode.setPrev(null);
			
			count--;
		}
		
		if (1 == count)
		{
			head  = null;
			tail  = null;
			
			count--;
		}
		return true;
	}
	
	// Completed
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
}
