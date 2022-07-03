package com.algorithm.teacher;

public class ListContainer {
	
	private Node 	header;
	private int 	count;
	
	private int 	findNextCallCount;	// findNext를 몇번 호출 하였는가?
	private int[] 	findResult;			// findFirst를 한 결과
	
	// DONE
	public ListContainer()
	{
		header = null;
		count = 0;	
		
		findResult = null;
		findNextCallCount = 0;
	
	}		
	
	private Node getLastNode()
	{
		Node lastNode = header;
		
		for (int i = 0; i < count - 1; i++)
		{
			lastNode = lastNode.getNext();
			
		}
		
		return lastNode;
		
	}
	
	
	// DONE 노드를 추가한다. 
	public boolean insertNode()
	{
		Node lastNode = null;
		//1. 새로운 노드를 하나 생성한다.
		Node newNode = new Node();
		
		if (count == 0)
		{
			// 헤더에 물린다.
			header = newNode;
		}
		else
		{
			// 마지막 노드의 링크에 물린다.
			lastNode = getLastNode();
			lastNode.setNext(newNode);
		}
		
		count++;		
		return true;
	}

	// DONE
	public boolean insertNode(Node _newNode)
	{
		Node lastNode = null;				 
		
		if (count == 0)
		{
			// 헤더에 물린다.
			header = _newNode;
		}
		else
		{
			// 마지막 노드의 링크에 물린다.
			lastNode = getLastNode();
			lastNode.setNext(_newNode);
		}
		
		count++;		
		return true;
	
	}	

	// DONE
	public boolean insertNode(int _value1, String _value2)
	{
		Node lastNode = null;
		//1. 새로운 노드를 하나 생성한다.
		
		Node newNode = new Node(_value1, _value2);
		
		if (count == 0)
		{
			// 헤더에 물린다.
			header = newNode;
		}
		else
		{
			// 마지막 노드의 링크에 물린다.
			lastNode = getLastNode();
			lastNode.setNext(newNode);
		}
		
		count++;		
		return true;
	}

	public boolean deleteNodebyIndex(int _index)
	{
		Node target = header;
		Node before = null;
		
		// count의 유효성 검사
		if (count == 0)
			return false;
		
		// index의 유효성을 검사
		if ((count <= _index) ||  (_index < 0))
			return false;
		
		//1. target과 before를 찾는다.		
		for (int i = 0; i < _index; i++)
		{
			before = target;
			target = target.getNext();
		}
		
		// 0번 인덱스를 지워라라는 의미
		if (before == null)
			header = target.getNext();
		else
			before.setNext(target.getNext());	
		
		count--;
		return true;
	}
	
	 
	public int findFirst(int _value)
	{
		findResult = findNode(_value);
		return findResult.length;
			
	}
	
	
	public int findFirst(String _value)
	{
		findResult = findNode(_value);
		return findResult.length;
		
	}
	
	public int findNext()
	{	
		if (findNextCallCount == findResult.length)
		{
			findNextCallCount  = 0;
			findResult = null;
			return -1;
		}
		else
			return findResult[findNextCallCount++];		
		
	}
	
	public int[] findNode(int _value)
	{	
		int [] result = null;
		
		Node target = header;
		NodeData data = null;
		int dataCount = 0;
		int idx = 0;
		
		// 1. _value와 같은 값을 가진 노드의 개수를 구한다.
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			// data가 존재한다.
			if (null != data)				
			{
				if (_value == data.getvalue1())
					dataCount++;
					
			}
			
			target = target.getNext();
		}
		
		// 2. 찾은 데이터 개수만큼 배열을 만든다.
		result = new int[dataCount];
		target = header;
		
		// 3. 인덱스를 찾아서 배열을 채워준다.
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			// data가 존재한다.
			if (null != data)				
			{
				if (_value == data.getvalue1())
				{
					result[idx] = i;
					idx++;			
					
				}
					
			}
			
			target = target.getNext();
		}
		
		return result;
	}
	
	// String 값을 찾아서 해당 노드를 리턴한다.
	// 12:05 까지  구현해봅시다.
	public int[] findNode(String _value)
	{
		int [] result = null;
		
		Node target = header;
		NodeData data = null;
		int dataCount = 0;
		int idx = 0;
		
		// 1. _value와 같은 값을 가진 노드의 개수를 구한다.
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			// data가 존재한다.
			if (null != data)				
			{
				if (_value.equals(data.getvalue2()))
					dataCount++;
					
			}
			
			target = target.getNext();
		}
		
		// 2. 찾은 데이터 개수만큼 배열을 만든다.
		result = new int[dataCount];
		target = header;
		
		// 3. 인덱스를 찾아서 배열을 채워준다.
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			// data가 존재한다.
			if (null != data)				
			{
				if (_value.equals(data.getvalue2()))
				{
					result[idx] = i;
					idx++;			
					
				}
					
			}
			
			target = target.getNext();
		}
		
		return result;
		
	}
	
	// DEV
	// 같은 값을 가진 노드들을 리턴하는 findData함수를 어떻게 구할것인가?
	
		
	// 노드 데이터를 리턴한다.
	public NodeData getNodeData(int _index)
	{
		Node target = header;
		NodeData data = null;
		
		if ((count <= _index) || (_index < 0))
			return null;		
			
		for (int i = 0; i < _index; i++)
			target = target.getNext();
		
		data = target.getData();
		
		return data;		
		
	}
	
	public boolean setNodeData(int _index, NodeData _data)
	{
		Node target = header;
		
		if ((count <= _index) || (_index < 0))
			return false;		
				
		for (int i = 0; i < _index; i++)
			target = target.getNext();			
		
		target.setData(_data);
		
		return true;
	}
	
	public int getNodeCount()
	{
		return count;
	}

	// 모든 노드를 출력.
	// index = 0
	// 1, "abc"
	public void printAll()
	{
		Node target = header;
		NodeData data = null;
		
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			System.out.println("index = " + i);

			if (null == data)				
				System.out.println("null");
			else
				System.out.printf("%d, %s\n", data.getvalue1(), data.getvalue2());
				
			System.out.println("-------------------");
			
			target = target.getNext();
		}
				
	}

}
