/**
 *  작성자 : 김주화 (kimcoin92)
 *  최초 작성일 : 2022년 07월 01일
 *  최근 수정일 : 2022년 07월 05일
 */

package com.algorithm.linkedlist;

public class Node
{
	// 내 코드
	
	private Node next;
	private Node prev;
	private NodeData data;
	private int  size;
	
	public Node()
	{
		next = null;
		prev = null;
		size = 0;
	}
	
	public Node(NodeData _data)
	{
		data = new NodeData();
		
		data = _data;
	}
	
	public Node(int _Value1, String _Value2)
	{
		data = new NodeData(_Value1, _Value2);
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

	public int getSize()
	{
		return size;
	}

	public NodeData getData()
	{
		return data;
	}

	public void setData(NodeData _data)
	{
		data = _data;
	}
	
	// 정성훈 강사님의 코드
	
	/*
	private NodeData 	data;		// 노드데이터
	private Node 		prev;		// 이전노드 링크정보
	private Node 		next;		// 다음노드 링크정보.
	

	public Node()
	{
		data = null;
		next = null;
		prev = null;
		
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

	public Node(NodeData _data)
	{
		data = _data;
		next = null;
		prev = null;
	}
	
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
		else
		{
			data.setvalue1(_value1);
			data.setvalue2(_value2);			
			
		}
		
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
	*/
}