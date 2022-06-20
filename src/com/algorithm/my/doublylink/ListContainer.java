package com.algorithm.my.doublylink;

public class ListContainer {
	
	private Node head;
	private int        count;
	
	public ListContainer()
	{
		head = null;
		count = 0;	
	}
  
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
	

    public boolean insertNode(NodeData _newNodeData)
	{
		Node target  = null;
    Node newNode = null;
    
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
	    count++;
	    
	    return true;
	}
  
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
  
	public boolean deleteNodebyIndex(int _index)
	{
		Node target = head;
		Node temp   = null;
		
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
			temp   = target;
			target = target.getNext();
		}
		
		if (temp == null)
		{
			head = target.getNext();
		}
		else
		{
			temp.setNext(target.getNext());
		}
			
		count--;
		
	    return true;
	}
	
	/* private int findIndex;

	public int findFirst(int _value)
	{
		NodeData data = null;
		Node target   = head;
		int amount     = 0;
		
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			if (_value == data.getValue1())
			{
				amount++;
			}
			target = target.getNext();
		}
		return amount;
	}
	
	public int findNext()
	{
		for (int i = 0; i < count; i++)
		{
			
		}
		
		return findIndex;
	}
	
	public int findNext(String _value, int _index)
	{
		NodeData data = null;
		Node target   = head;
		int index     = _index;
		
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			if(null == target.getNext())
			{
				index = -1;
				
				break;
			}
			else if ((_value == data.getValue2()))
			{
				break;
			}
			else if ((null == data) || _value != data.getValue2())
			{
				target = target.getNext();
				
				index++;
			}
			else {}
		}
		return index;
	} */
	
	// 모든 노드를 출력한다.
	/* public void printAll()
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
				System.out.printf("%d, %s\n", data.getValue1(), data.getValue2());
			}
			System.out.println("----------------------------");
			
			target = target.getNext();
		}
	} */
}
