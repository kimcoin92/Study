package com.algorithm.my.doublylink;

public class Node
{
	private NodeData data;
	private Node next;
	private Node prev;

//	기본 생성자
	public Node()
    {
//		데이터를 담을 참조변수
    	data = null;
    	
//    	다음 노드의 참조 값을 가지고 있는 참조변수
    	next = null;
    	
//    	이전 노드의 참조 값을 가지고 있는 참조변수    	
    	prev = null;
    }

//	외부에서 노드를 생성하고 데이터 값을 입력하는 경우를 위한 오버로딩 생성자
    public Node(NodeData _data)
    {
    	data = _data;
    	next = null;
    	prev = null;
    }

//	외부에서 데이터 값을 입력하는 경우를 위한 오버로딩 생성자
    public Node(int _value1, String _value2)
    {
    	data = new NodeData(_value1, _value2);
    	next = null;
    	prev = null;
    }
    
    public NodeData getData()
    {
    	return data;
    }

    public void setData(NodeData _data)
    {
    	data = _data;
    }

    public void setData(int _value1, String _value2)
    {
    	if (data == null)
    	{
            data = new NodeData(_value1, _value2);
    	}
    	data.setValue1(_value1);
    	data.setValue2(_value2);
    }

    public Node getNext()
    {
      return next;
    }
    
    public void setNext(Node _next)
    {
      next = _next;
    }
    
    public Node getPrev()
    {
      return prev;
    }
    
    public void setPrev(Node _prev)
    {
      prev = _prev;
    }
  }