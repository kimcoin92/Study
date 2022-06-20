package com.algorithm.my.singlylink;

public class Node
  {
	private NodeData data;
	private Node next;

    public Node()
    {
      data = null;
      next = null;
    }

    public Node(NodeData _data)
    {
      data = _data;
      next = null;
    }

    public Node(int _value1, String _value2)
    {
      data = new NodeData(_value1, _value2);
      next = null;
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
      if(data == null)
        
        data = new NodeData(_value1, _value2);
      
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
  }