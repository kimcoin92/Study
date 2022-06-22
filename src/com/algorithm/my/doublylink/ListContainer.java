package com.algorithm.my.doublylink;

public class ListContainer {
	
//	▲ 참조변수 next만을 가지고 첫 노드에 대한 이정표 역할을 담당하는 레퍼런스 변수
	private Node head;
	
//	▲ 전체 노드의 개수
	private int  count;
	
//	● 기본 생성자
	public ListContainer()
	{
		head = null;
		count = 0;	
	}
	
//	● 새 노드를 삽입한다. (빈 노드)
	public boolean insertNode()
	{
//		▲ 해당 위치에 있는 노드를 조작할 수 있도록 동기화하는 레퍼런스 변수
		Node target  = null;
		
//		▲ 새 노드
		Node newNode = new Node();
		
		if (count == 0)
		{
			head = newNode;
		}
		else
		{
		    target = getNode(count - 1);
		    
//		    ◆ 해당 노드의 next에 새 노드의 주소값을 입력한다.
		    target.setNext(newNode); 
		    
//		    ◆ 새 노드의 prev에 해당 노드의 주소값을 입력한다.
		    newNode.setPrev(target);
		}
	    count++;
	    return true;
	}
	
//	● 새 노드를 삽입한다. (빈 노드, 리스트 사이에 삽입)
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
	
//	● 새 노드를 삽입한다. (외부로부터 노드 생성)
	public boolean insertNode(NodeData _newData)
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
	    count++;
	    
	    return true;
	}

//	● 새 노드를 삽입한다. (빈 노드, 리스트 사이에 삽입)
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
	
//	● 새 노드를 삽입한다. (빈 노드 생성, 외부 데이터 입력)
//	public boolean insertNode(NodeData _newData(int _value1, String _value2))
//	{
//		Node target  = null;
//		Node newNode = new Node();
//		
//		newNode.setData(_value1, _value2);
//		
//		if (count == 0)
//		{
//			head = newNode;
//		}
//		else
//		{
//		    target = getNode(count - 1);
//		    
//		    target.setNext(newNode);
//		    newNode.setPrev(target);
//		}
//	    count++;
//	    
//	    return true;
//	}
	
//	● 새 노드를 삽입한다. (외부 데이터 입력)
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
	
//	● 새 노드를 삽입한다. (외부 데이터 입력, 리스트 사이에 삽입)
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
	
//	● 노드 위치를 특정한다.
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
	
//	● 특정 위치의 노드를 삭제한다.
	public boolean deleteNodebyIndex(int _index)
	{
//		◆ getNode 메서드로 target에 index 위치의 노드를 가져온다.
		Node target   = getNode(_index);
		Node nextNode = target.getNext();
		Node prevNode = target.getPrev();
		
//		◆ 노드의 존재 유무와 범위의 유효성을 검사한다.
		if ((0 == count) || (count <= _index) || (_index < 0))
		{
			return false;
		}
//		◆ 첫 노드를 선택한 경우
		if (prevNode == null)
		{
			head = nextNode;
			target.setNext(null);
			nextNode.setPrev(null);
		}
//		◆ 마지막 노드를 선택한 경우
		else if (nextNode == null)
		{
			prevNode.setNext(null);
		}
		else
//		◆ 리스트 사이의 노드를 선택한 경우
		{
			nextNode.setPrev(prevNode);
			prevNode.setNext(nextNode);
		}
		count--;
	    return true;
	}
	
//	● 특정 정수값의 노드를 검색한다.
	public Node getNodebyValue(int _value)
	{
		Node     target = head;
		NodeData search = target.getData();
		
		for (int i = 0; i < count; i++)
		{
			if (search.getValue1() != _value)
			{
				target = target.getNext();
				search = target.getData();
			}
		}
		return target;
	}
	
//	● 특정 정수값의 모든 노드를 삭제한다.
	public boolean deleteNodebyValue(int _value)
	{
//		◆ 
		Node target   = getNodebyValue(_value);
		Node nextNode = target.getNext();
		Node prevNode = target.getPrev();
		
//		◆ 노드와 노드 데이터의 유효성을 검사한다.
		if ((0 == count) || (target == null))
		{
			return false;
		}
//		◆ 첫 노드를 선택한 경우
		if (prevNode == null)
		{
			head = nextNode;
			target.setNext(null);
			nextNode.setPrev(null);
		}
//		◆ 마지막 노드를 선택한 경우
		else if (nextNode == null)
		{
			prevNode.setNext(null);
		}
		else
//		◆ 리스트 사이의 노드를 선택한 경우
		{
			nextNode.setPrev(prevNode);
			prevNode.setNext(nextNode);
		}
		count--;
	    return true;
	}
	
//	● value2가 abc인 데이터를 지워라.
	public int deleteNodebyString(String _str)
	{
		return 0;
	}
	
//	● value1이 5이고 value2가 abc인 데이터를 지워라. (and 조건)
	public boolean deleteNodebyIndex(int _value, String _value2)
	{
		return true;
	}
	
//	● 노드 리스트를 출력한다.
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
