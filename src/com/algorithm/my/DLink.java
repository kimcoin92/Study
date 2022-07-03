/**
 * Creator : Kimcoin92
 * Date : 01 July, 2022
 * 
 * Name : Algorithm Exercise Program, Doubly Linked-List Container
 * 
 */

package com.algorithm.my;

public class DLink
{
	Node head;
	Node tail;
	int  count;
	
	// Complete (✗) - 인덱스와 개수를 동일하게 맞출경우 null값 노드에 대한 처리문제
	public Node getNode (int _index)
	{
		Node target = null;	
		
		int center = count / 2;
		
		if (_index < 0)
		{
			target = head;
		}
		else if (_index >= count)
		{
			target = tail;
		}
		
		if (_index <= center)
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
	
	// Complete (✓)
	public int getCount()
	{
		return count;
	}
	
	// Complete (✓)
	public boolean insertNode()
	{	
		Node target  = null;
		Node newNode = new Node();
		
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

	// Complete (✗) - #1 : getNode의 null target으로 인한 pointer 예외
	public boolean insertNode(int _index)
	{
		Node target  = null;
		Node newNode = new Node();
		
		if (0 > _index)
		{
			return false;
		}
		
		if (count == 0)
		{
			head = newNode;			
		}
		else if (_index == 0)
		{
			target = getNode(_index);
			
			newNode.setNext(target);
			target.setPrev(newNode);
			
			head = newNode;
		}
		else
		{
			target = getNode(_index);
			
			newNode.setNext(target);
			newNode.setPrev(target.getPrev());
			
			target.setPrev(newNode);
			newNode.getPrev().setNext(newNode);
		}
		
		if (_index > count)
		{
			tail = newNode;			
		}
		count++;
		return true;
	}
	
	// Complete (✓)
	public boolean insertNode(Record _newData)
	{
		Node target  = null;
		Node newNode = new Node();
		newNode.setData(_newData);
		
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
	
	// Complete (✗) - #1
	public boolean insertNode(Record _newData, int _index)
	{
		Node target  = null;
		Node newNode = new Node();
		newNode.setData(_newData);
		
		if (0 > _index)
		{
			return false;
		}
		
		if (count == 0)
		{
			head = newNode;			
		}
		else if (_index == 0)
		{
			target = getNode(_index);
			
			newNode.setNext(target);
			target.setPrev(newNode);
			
			head = newNode;
		}
		else
		{
			target = getNode(_index);
			
			newNode.setNext(target);
			newNode.setPrev(target.getPrev());
			
			target.setPrev(newNode);
			newNode.getPrev().setNext(newNode);
		}
		
		if (_index > count)
		{
			tail = newNode;			
		}
		count++;
		return true;
	}
	
	// Complete (✓)
	public boolean insertNode(int _value1, String _value2)
	{	
		Node target  = null;
		Node newNode = new Node(_value1, _value2);
		
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
	
	// Complete (✗) - #1
	public boolean insertNode(int _value1, String _value2 , int _index)
	{	
		Node newNode  = new Node(_value1, _value2);
		Node target   = null;
		
		if (0 > _index)
		{
			return false;
		}
		
		if (count == 0)
		{
			head = newNode;			
		}
		else if (_index == 0)
		{
			target = getNode(_index);
			
			newNode.setNext(target);
			target.setPrev(newNode);
			
			head = newNode;
		}
		else
		{
			target = getNode(_index);
			
			newNode.setNext(target);
			newNode.setPrev(target.getPrev());
			
			target.setPrev(newNode);
			newNode.getPrev().setNext(newNode);
		}
		
		if (_index > count)
		{
			tail = newNode;			
		}
		count++;
		return true;
	}

	// Complete (✓)
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
	
	// Complete (✓)
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
	
	// Complete (✓)
	public void printAll()
	{
		Node target = head;
		Record data	= null;
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