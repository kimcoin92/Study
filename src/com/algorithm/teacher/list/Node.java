/**
 *  ● Linkedlist Description
 * 
 *	● 리스트의 표면적 정의 (List)
 *	- 데이터를 분산하여 배치한다.
 *	- 리스트 종류로는 Array-list, Single Linked-list, Double Linked-list가 있다.
 *
 *	● 배열과 리스트 특징
 *	
 *	1. 배열
 *	-  데이터의 입출력이 비가변적이다.
 *  -  구조가 연속적이다.
 *	
 *	2. 리스트
 *	-  데이터의 입출력이 가변적이다.
 *  -  구조가 비연속적이다.
 *  
 *  #가변성 : <내용상세 보충예정>
 *  #연속성 : <내용상세 보충예정>
 *
 *	● 배열의 단점
 *  - 비가변성의 문제 : <내용상세 보충예정>
 *  - 연속성의 문제 : <내용상세 보충예정>
 *	
 *  ● 리스트의 단점
 *	- 가변성의 문제 : <내용상세 보충예정>
 *  - 비연속성의 문제 : <내용상세 보충예정>
 *  
 *  ● 리스트 전반 설명
 *  - 참조변수 : heap에 할당된 메모리의 레퍼런스 값을 저장하는 변수
 *  - 레퍼런스값 : heap에 할당된 메모리의 시작정보
 *  - 이러한 참조변수를 링크라고 칭한다.
 *  
 *  #링크 : 떨어져있는 노드를 연결하기 위한 연결정보
 *
 *  ● 리스트의 단점의 보완법
 *  - 데이터마다 같은 유형의 공간을 할당하여 서로의 위치를 저장한다.
 *  - 임의로 결정된 순서로 각 데이터의 레퍼런스값을 참조변수에 저장한다.
 *  - 노드 참조변수 link와 노드 데이터를 참조하는 참조변수 data로 레퍼런스값을 저장한다.
 *  
 *  #노드 : 리스트를 구성하고 있는 기초적인 작은 단위이다.
 *  
 *  ● 노드의 역할
 *  - 데이터와 옆의 노드를 연결할 링크에 대한 정보로 서로 연결한다.
 *  - 다수의 데이터를 저장하기 위해서는 노드 자체에 대한 생성, 연결, 삭제하는 컨테이너 기능이 필요하다.
 *  
 *  #컨테이너 : 다수의 리스트를 만들수 있도록 리스트를 관리하는 프레임 구성
 *  
 *  ● 리스트의 구성
 *  - header가 첫 노드의 레퍼런스값을 저장한다.
 *  - 다음 노드의 next가 그 앞의 레퍼런스값을 저장하는 연결 구조 상태이다.
 *  - 다음 노드가 없는 마지막 노드의 링크(next)는 null이며, 가장 마지막 노드의 데이터 영역(data)에 데이터값(value)이 저장된다.
 * 
 *  ● 노드 삭제의 원리
 *  - 지우는 노드의 시작정보는 그 이전 노드가 가지고 있다.
 *  - 이전 노드의 시작정보를 지우는 노드의 앞 노드와 연결시킨다.
 *  - 앞 노드와의 연결은 지우는 노드의 앞 노드의 시작정보를 이전 노드에게 전달하여 연결시킨다.
 *  - 연결 정보지우는 노드와 데이터는 이전 노드와의 연결이 끊겨 Garbage Collector에게 정리된다.
 * 
 */

package com.algorithm.teacher.list;

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