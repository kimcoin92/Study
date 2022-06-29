/**   
 *  - 생성자
 *  ● ListContainer()
 *    
 *  - 노드를 추가한다.
 *  ● public boolean insertNode()
 *  ● public boolean insertNode(Node newNode)
 *  ● public boolean insertNode(int _value1, String _value2)
 *    
 *  - 노드를 삭제한다.
 *  ● public boolean deleteNodebyIndex(int index)
 *    
 *  - 노드를 찾는다.
 *  ● public int findNode(int value)
 *  ● public int findNode(String value)
 *    
 *  - 마지막 노드를 찾는다.
 *  ● Node getLastNode()
 *  ● int getNodeCount()
 *  ● NodeData getNodeData(int _index)
 *  
 *  - 빈 노드에 데이터를 넣는다.
 *  ● boolean setNodeData (NodeData _Data)
 */

package com.linkedlist.teacher.first;

public class ListContainer {

	private Node 	header;
	private int 	count;

	
	// DONE
	public ListContainer()
	{
		header = null;
		count = 0;		
		
	}		
	
	// DONE
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
	
		
	
		
	// DONE
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
	
	// DEV
	// 같은 값을 가진 노드들을 리턴하는 findData 함수를 어떻게 구할 것인가?
	
	// 1. value에 해당하는 노드가 몇 개가 있는지를 알아본다.
	// 2. 그 개수만큼 배열을 할당한다.
	// 3. 노드를 순회하면서 value와 같은 노드 인덱스를 배열에 저장한다.
	
	// 1. 찾는 로직을 만들었다 치고 외부에서
	// int count = lc.findFirst(3);
	// NodeData data = null;
	// for (int = 0; i < count; i++)
	// index = lc.findNext();
	// data = lc.getNodeData(index);
	// sysout(data.getvalue1);
	// sysout(data.getvalue2);
	
	// 예) 폴더 안에 특정 파일을 찾는 로직을 만드는 경우
	// file의 개수 = findFile("NCS 학습 모듈")
	
	public int[] findNode(int _value)
	{
		// 
		
		Node target   = header;
		NodeData data = null;
		int[] result  = null;
		int arcount   = 0;
		int aridx     = 0;
		
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			if (_value == data.getvalue1())
			{
				arcount++;
			}
			target = target.getNext();
		}
		
		result = new int[arcount];
		
		target = header;
		
		for (int k = 0; k < count; k++)
		{
			data = target.getData();
				
			if (null != data)
			{
				if (_value == data.getvalue1())
				{
					result[aridx] = k;
					
					aridx++;
				}
			}
			target = target.getNext();
		}
		return result;
	}
	
	// String 값을 찾아서 해당 노드를 리턴한다.
	public int findNode(String _value)
	{
		Node target = header;
		NodeData data = null;
		int result = -1;
		
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			// data가 존재한다.
			if (null != data)				
			{
				if (_value.equals(data.getvalue2()))
				{
					result = i;
					break;					
					
				}

			}
			
			target = target.getNext();
		}
		
		return result;
		
	}
	
	
	
	
	
	
	
	// 노드 데이터를 리턴한다.
	public NodeData getNodeData(int _index)
	{
		Node target = header;
		NodeData data = null;
		
		if (count <= _index)
		{
			target = getLastNode();
		}
		else
		{
			for (int i = 0; i < _index; i++)
			{
				target = target.getNext();
			}
		}
		data = target.getData();
		
		return data;
	}
	
	// DEV
	// _index : 집어넣을 노드 인덱스
	// _data  : 집어넣을 데이터
	public boolean setNodeData (int _index, NodeData _data) // 외부에서 만들어진 노드 데이터를 넣는다.
	{
		Node target = header;
		NodeData insert = null;
		
		for(int i = 0; i < _index; i++)
		{
			target = target.getNext();
		}
		
		insert = target.getData();
		
		if (null == insert)
		{
			target.setData(_data);
		}
		else
		{
			return false;
		}
		return true;
	}
	
	public boolean setNodeData (int _index, int _value1, String _value2) // 외부에서 직접 데이터값을 넣는다.
	{
		Node target = header;
		NodeData insert = null;
		
		for(int i = 0; i < _index; i++)
		{
			target = target.getNext();
		}
		
		insert = target.getData();
		
		if (null == insert)
		{
			target.setData(_value1, _value2);
		}
		
		// 정말 필요한 코드인지 생각할필요.....
		// 과도한 기능을 넣는것은 사양할 것
//		else if (null != insert) // 해당 노드가 비어있지 않으면 순서대로 빈 노드를 찾아 데이터를 넣는다.
//		{
//			target = header;
//			
//			while ((null != target.getData()) && (null != target.getNext()))
//			{
//				target = target.getNext();
//				insert = target.getData();
//			}
//			
//			if (insert == null)
//			{
//				target.setData(_value1, _value2);
//			}
			else
			{
				return false;
			}
//		}
		return true;
	}
	
	// 노드 개수를 리턴한다.
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
