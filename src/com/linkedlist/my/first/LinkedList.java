/** 상세 (Description)
 * 
 *  ● 자료구조 (Data Structure) - 단일 연결 리스트 (Singly Linked List)
 *  
 *  ● 작성일 : 2022년 06월 14일
 *  ● 작성일 : 2022년 06월 23일
 *  
 *	● 단일 연결 리스트의 정의
 *  - 데이터가 한 방향으로 연결되어 있는 자료구조.
 *  
 *  ● 배열의 상세
 *  
 *     String[] arr = new String[4];
 *       
 *     *********   *********   *********   *********
 *     * ref.  *   * ref.  *   * ref.  *   * ref.  * 
 *     * value *   * value *   * value *   * value *
 *     *       *   *       *   *       *   *       *
 *     *********   *********   *********   *********
 *     /           /           /           /
 *     /           /           /           / ← Instance
 *     /           /           /           /
 *     *********************************************
 *     * ref.  *   * ref.  *   * ref.  *   * ref.  *
 *     * varia *   * varia *   * varia *   * varia *
 *     * ble   *   * ble   *   * ble   *   * ble   *
 *     *********************************************
 *     arr[0]      arr[1]      arr[2]      arr[3]
 *     
 *  
 *  ● 배열(Array)과 리스트(List) 비교
 *	
 *	1. 배열
 *	-  비가변적이다.
 *  -  연속적이다.
 *	
 *	2. 리스트
 *	-  가변적이다.
 *  -  비연속적이다.
 *  
 *  ※ 가변성 : 데이터 입출력 시 자료구조가 변화하는 성격이다.
 *  ※ 연속성 : 자료구조가 순서대로 구성되어 있는 성격이다.
 *  
 *  ● 배열의 장점
 *  - 비가변성의 이점 : 자료구조가 고정되어 자료 간의 연결이 변하지 않는다.
 *  - 연속성의 이점 : 생성 시점부터 자료의 순서가 연속되어있어 원하는 자료에 대한 색인이 빠르고 편리하다.
 *  
 *  ● 배열의 단점
 *  - 비가변성의 문제 : 고정된 배열의 크기로 인해 입출력의 범위가 한정된다.
 *  - 연속성의 문제 : 생성 시점부터 할당된 구조 사이로 새로운 데이터에 대한 삽입이 곤란하다.
 *  
 *  ● 배열의 보완법
 *  - 결합된 데이터를 노드(Node) 단위로 조각화한다.
 *  - 조각화 → 리스트 자료구조.
 *  
 *  ※ 노드 : 리스트를 구성하고 있는 기초적인 작은 단위이다.
 *  
 *   *  ● 단일 리스트의 상세
 *   
 *     (Data)    
 *     *********   *********   *********   *********
 *     * ref.  *   * ref.  *   * ref.  *   * ref.  * 
 *     * value *   * value *   * value *   * value * 
 *     *       *   *       *   *       *   *       *
 *     *********   *********   *********   *********
 *     /           /           /           /
 *     /           /           /           / ← Instance
 *     /           /           /           /
 *     *********   *********   *********   *********
 *     * ref.  *   * ref.  *   * ref.  *   * ref.  *
 *     * var.  *   * var.  *   * var.  *   * var.  *
 *     *  next *   *  next *   *  next *   *  next *
 *     *********---*********---*********---*********
 *     요약 : 내 노드의 next는 다음 노드의 참조변수를 알고있다.
 *  
 *  ● 리스트의 장점
 *	- 가변성의 이점 : 필요한 데이터에 대한 메모리만 할당하여 불필요한 리소스 낭비를 최소화한다.
 *  - 비연속성의 이점 : 데이터 사이에 새 데이터의 추가가 가능하다.
 *	
 *  ● 리스트의 단점
 *	- 가변성의 문제 : 구조의 변화로 인해 데이터를 특정하기 곤란하다.
 *  - 비연속성의 문제 : 데이터 간의 연결이 전무하여 순서를 파악하기 곤란하다.
 *  
 *  ● 리스트의 단점보완
 *  - 노드의 레퍼런스 값(ref. value)를 연결할 다른 노드의 참조변수(ref. variable)에 저장하여 연결시킨다.
 *  - 노드 참조변수 "링크(Link)"와 데이터를 참조하는 참조변수 "데이터(Data)"로 레퍼런스 값을 저장한다.
 *  
 *  ※ 링크 : 떨어져있는 노드를 연결하기 위한 연결정보
 *  ※ 레퍼런스 값 : 힙(Heap) 영역에 할당된 메모리의 시작정보
 *  ※ 참조변수 : 힙 영역에 할당된 메모리의 레퍼런스 값을 저장하는 변수
 */

/**
 *  ● 구성요소
 *  
 *  1. NodeData : 노드의 데이터를 할당하는 생성자 클래스
 *  
 *  1-1. reference variable
 *  - value1 : 정수(Integer)형 참조변수.
 *  - value2 : 문자열(String)형 참조변수.
 *  
 *  1-2. constructor
 *  - 기본 생성자.
 *  - 오버로딩 (value1, value2) 생성자.
 *  
 *  1-3. method / function
 *  - 조건 setter : 외부로부터 직접 할당받기 위한 getter.
 *  
 *  2. Node : 일반 데이터와 상호 연결을 위한 링크 데이터를 할당하는 클래스
 *  
 *  2-1. reference variable
 *  - data : value1, value2의 레퍼런스 값을 참조하는 NodeData형 참조변수.
 *  - next : 다음 노드의 레퍼런스 값을 참조하는 Node형 참조변수.
 *  
 *  2-2. constructor
 *  - setter : 외부로부터 직접 또는 빈 노드에 새로운 NodeData형 참조변수를 할당받는 생성자.
 *  
 *  3. ListContainer : 노드의 전반적인 관리를 담당하는 컨테이너(Container) 클래스
 *  ※ 컨테이너 : 객체의 관리와 관련된 핵심 기능들을 구성한 메서드의 집합
 *  
 *  3-1. reference variable
 *  - header : 리스트의 '머리'부분을 담당하며, 노드의 생성과 위치 정보 파악을 위한 기준점으로 활용.
 *  - count : 노드의 수량을 측정하는 참조변수.
 *  
 *  3-2. method / function
 *  - 마지막 노드를 가져온다.
 *  - 노드를 추가한다.
 *  (Option 1) : 데이터가 없는 노드를 추가한다.
 *  (Option 2) : 외부로부터 레퍼런스 값을 입력받아 노드를 추가한다.
 *  (Option 3) : 외부로부터 새 노드를 생성하고 레퍼런스 값을 입력받아 추가한다.
 *  
 *  - 지정한 인덱스에 위치한 노드를 삭제한다.
 *  - 지정한 정수형 데이터가 할당된 노드를 리턴한다.
 *  - 지정한 문자열형 데이터가 할당된 노드를 리턴한다.
 *  - 지정한 인덱스에 위치한 노드의 데이터를 리턴한다.
 *  - 노드의 개수를 리턴한다.
 *  - 모든 노드를 출력한다.
 */

package com.linkedlist.my.first;

public class LinkedList {

	public static void main(String[] args) {

		ListContainer list1 = new ListContainer();
		
		// 새로운 노드를 추가
		
		// 외부해서 노드와 참조 값을 입력
		list1.insertNode(1, "a");
		list1.insertNode(1, "b");
		list1.insertNode(2, "c");
		list1.insertNode(1, "d");
		list1.insertNode(3, "e");
		list1.insertNode(7, "d");
		list1.insertNode(9, "e");
		list1.insertNode(1, "c");
		list1.insertNode(4, "a");
		
		// 인덱스 위치의 노드를 삭제
//		list1.deleteNodebyIndex(0);
		
		// 노드 데이터 가져오기
//		System.out.println(list1.getNodeData(1));
		
//		// 모든 노드 출력하기
//		list1.printAll();
		
		int index = 0;
		
		index = list1.findFirst(4);
		
		System.out.println(index);
//		
//		index = list1.findNext(4, index);
//		
//		System.out.println(index);
//		
//		index = list1.findNext(4, index);
//		
//		System.out.println(index);
//		
//		index = list1.findNext(4, index);
//		
//		System.out.println(index);
//		
//		index = list1.findNext(4, index);
//		
//		System.out.println(index);
//		
//		index = list1.findNext(4, index);
//		
//		System.out.println(index);
//		
//		index = list1.findNext(4, index);
//		
//		System.out.println(index);
//		
//		index = list1.findNext(4, index);
//		
//		System.out.println(index);
//		
//		index = list1.findNext(4, index);
//		
//		System.out.println(index);
//		
//		index = list1.findNext(4, index);
//		
//		System.out.println(index);
	}
	
}
