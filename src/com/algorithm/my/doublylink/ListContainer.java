package com.algorithm.my.doublylink;

public class ListContainer {

	private Node head;

	private int  count;

	public ListContainer()
	{
		head = null;
		count = 0;	
	}
	
//	새 노드를 삽입한다. (빈 노드)
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
	    count++;
	    return true;
	}
	
//	 새 노드를 삽입한다. (빈 노드, 리스트 사이에 삽입)
	 public boolean insertNode(int _pos)
	 {
		Node target  = head;
		Node newNode = new Node();
		
		if (_pos < 0)
	    {
	      return false;
	    }
		else if (count == 0)
		{
			head = newNode;
		}
	    else if (_pos == 0)
	    {
	    	target = getNode(_pos);
	    	newNode.setNext(target);
	    	newNode.setPrev(target.getPrev());
	    	target.setPrev(newNode);
	    	newNode.getPrev().setNext(newNode);
	    }
	    else if (_pos >= count)
	    {
	      for (int i = 0; i < count; i++)
	        {
	          target = target.getNext();
	        }
	      newNode = getNode(count - 1);
	      target.setNext(newNode);
	    }
	    else
	    {
	      target = getNode(_pos);
	      newNode.setNext(target);
	      newNode.setPrev(target.getPrev());
	      target.setPrev(newNode);
	      newNode.getPrev().setNext(newNode);
	    }
		count++;
		return true;
		}
	
//	새 노드를 삽입한다. (외부 빈 노드 생성)
	public boolean insertNode(Node _newNode)
	{
		Node target  = null;
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
	    count++;
	    
	    return true;
	}

//	새 노드를 삽입한다. (빈 노드, 리스트 사이에 삽입)
	public boolean insertNode(Node _newNode, int _pos)
	{
		Node target  = head;
		Node newNode = _newNode;
    
    if (_pos < 0)
    {
      return false;
    }
		else if (count == 0)
		{
			head = newNode;
		}
    else if (_pos == 0)
    {
      target = getNode(_pos);
      newNode.setNext(target);
      newNode.setPrev(target.getPrev());
      target.setPrev(newNode);
      newNode.getPrev().setNext(newNode);
    }
    else if (_pos >= count)
    {
      for (int i = 0; i < count; i++)
        {
          target = target.getNext();
        }
      newNode = getNode(count - 1);
      target.setNext(newNode);
    }
    else
    {
      for (int k = 0; k < _pos; k++)
      {
        target = target.getNext();
      }
      newNode.setNext(target);
      newNode.setPrev(target.getPrev());
      target.setPrev(newNode);
      newNode.getPrev().setNext(newNode);
    }
    count++;
    return true;
  }
	
//	새 노드를 삽입한다. (외부 데이터 입력)
	public boolean insertNode(NodeData _newData)
	{
		Node target  = null;
		Node newNode = new Node(_newData);
		
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
	    count++;
	    
	    return true;
	}
	
//	새 노드를 삽입한다. (외부 데이터 입력, 리스트 사이에 삽입)
	public boolean insertNode(NodeData _newData, int _pos)
	{
		Node target  = null;
		Node newNode = new Node(_newData);
		
	    if (_pos < 0)
	    {
	      return false;
	    }
			else if (count == 0)
			{
				head = newNode;
			}
	    else if (_pos == 0)
	    {
	      target = getNode(_pos);
	      newNode.setNext(target);
	      newNode.setPrev(target.getPrev());
	      target.setPrev(newNode);
	      newNode.getPrev().setNext(newNode);
	    }
	    else if (_pos >= count)
	    {
	      for (int i = 0; i < count; i++)
	        {
	          target = target.getNext();
	        }
	      newNode = getNode(count - 1);
	      target.setNext(newNode);
	    }
	    else
	    {
	      for (int k = 0; k < _pos; k++)
	      {
	        target = target.getNext();
	      }
	      newNode.setNext(target);
	      newNode.setPrev(target.getPrev());
	      target.setPrev(newNode);
	      newNode.getPrev().setNext(newNode);
	    }
	    count++;
	    return true;
	}
	
//	새 노드를 삽입한다. (외부 데이터 값 입력)
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
	    count++;
	    
	    return true;
	}
	
//	새 노드를 삽입한다. (외부 데이터 입력, 리스트 사이에 삽입)
	public boolean insertNode(int _value1, String _value2, int _pos)
	{
		Node target  = head;
		Node newNode = new Node(_value1, _value2);
    
    if (_pos < 0)
    {
      return false;
    }
		else if (count == 0)
		{
			head = newNode;
		}
    else if (_pos == 0)
    {
      target = getNode(_pos);
      newNode.setNext(target);
      newNode.setPrev(target.getPrev());
      target.setPrev(newNode);
      newNode.getPrev().setNext(newNode);
    }
    else if (_pos >= count)
    {
      for (int i = 0; i < count; i++)
        {
          target = target.getNext();
        }
      newNode = getNode(count - 1);
      target.setNext(newNode);
    }
    else
    {
      for (int k = 0; k < _pos; k++)
      {
        target = target.getNext();
      }
      newNode.setNext(target);
      newNode.setPrev(target.getPrev());
      target.setPrev(newNode);
      newNode.getPrev().setNext(newNode);
    }
    count++;
    return true;
  }
	
//	노드 위치를 특정한다.
	public Node getNode(int _index)
	{
		Node result = head;
    
		if (_index >= count)
		{
			return null;
		}
		for (int i = 0; i < _index; i++)
		{
			result = result.getNext();
		}
		return result;
	}
	
//	특정 위치의 노드를 삭제한다.
	public boolean deleteNodebyIndex(int _index)
	{
		Node target   = getNode(_index);
		Node nextNode = target.getNext();
		Node prevNode = target.getPrev();
		
		if ((0 == count) || (count <= _index) || (_index < 0))
		{
			return false;
		}
		
		if (prevNode == null)
		{
			head = nextNode;
			target.setNext(null);
			nextNode.setPrev(null);
		}
		else if (nextNode == null)
		{
			prevNode.setNext(null);
		}
		else
		{
			nextNode.setPrev(prevNode);
			prevNode.setNext(nextNode);
		}
		count--;
	    return true;
	}
	
//	특정 정수값의 노드를 검색한다.
	public Node getNodebyValue(int _value)
	{
		Node     target = head;
		NodeData search = null;
		
		if (0 == count)
		{
			return null;
		}
		
		for (int i = 0; i < count; i++)
		{
			search = target.getData();
			
			if ((target.getNext() == null) || (search.getValue1() == _value))
			{
				break;
			}
			
			target = target.getNext();
		}
		return target;
	}
	
//	특정 정수값의 모든 노드를 삭제한다.
	public int deleteNodebyValue(int _value)
	{
		int  delCount = 0;
		Node target   = getNodebyValue(_value);
		Node nextNode = target.getNext();
		Node prevNode = target.getPrev();
		
		if ((0 == count) || (target == null))
		{
			return 0;
		}
		
		for (int i = 0; i < count; i++)
		{
			if (target == null)
			{
				break;
			}
			
			if (prevNode == null)
			{
				head = nextNode;
				target.setNext(null);
				nextNode.setPrev(null);
			}
			else if (nextNode == null)
			{
				prevNode.setNext(null);
			}
			else
			{
				nextNode.setPrev(prevNode);
				prevNode.setNext(nextNode);
			}
			
			target   = getNodebyValue(_value);
			nextNode = target.getNext();
			prevNode = target.getPrev();
			
			count--;
			delCount++;
		}
	    return delCount;
	}
	
	public int deleteNodebyValue2(int _value)
	{
		Node target = head;
		NodeData data = null;
		int delCount = 0;
		int i = 0;
		
		do
		{
			data = target.getData();
			
			if (_value == data.getValue1())
			{
				deleteNodebyIndex(i - delCount);
				delCount++;
			}
			target = target.getNext();
			i++;
		}
		while (target != null);
		
		return delCount;
	}
	
	public int deleteNodebyString(String _str)
	{
		return 0;
	}
	
	public boolean deleteNodebyIndex(int _value, String _value2)
	{
		return true;
	}
	
	public void printList()
	{
		Node target = head;
		NodeData data = null;
		
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			if (null == data)
			{
				System.out.println("null");
			}
			else
			{
				System.out.println("index = " + i + ", " + data.getValue1() + ", " + data.getValue2());
			}
			target = target.getNext();
		}
	}
}
