/** 상세 (Description)
 * 
 *  ● 자료구조 (Data Structure) - 이중 연결 리스트 (Doubly Linked List)
 *  
 *  ● 작성일 : 2022년 06월 17일
 *  
 *	● 정의
 *  - 데이터가 양 방향으로 연결되어 있는 자료구조.
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
 *  ● 배열의 단점
 *  - 비가변성의 문제 : 고정된 배열의 크기로 인해 입출력의 범위가 한정된다.
 *  - 연속성의 문제 : 이미 할당된 구조 사이로 새로운 데이터에 대한 할당이 곤란하다.
 *  
 *  ● 배열의 보완법
 *  - 결합된 데이터를 노드(Node) 단위로 조각화한다.
 *  - 조각화 → 리스트 자료구조.
 *  
 *  ※ 노드 : 리스트를 구성하고 있는 기초적인 작은 단위이다.
 *	
 *  ● 리스트의 단점
 *	- 가변성의 문제 : 구조의 변화로 인해 데이터를 특정하기 곤란하다.
 *  - 비연속성의 문제 : 데이터 간의 연결이 전무하여 순서를 파악하기 곤란하다.
 *  
 *  ● 리스트의 단점보완
 *  - 노드의 레퍼런스 값(ref. value)를 연결할 다른 노드의 참조변수(ref. variable)에 저장하여 연결시킨다.
 *  - 노드 참조변수 "링크(Link)"와 데이터를 참조하는 참조변수 "데이터(Data)"로 레퍼런스 값을 저장한다.
 *  
 *  ● 단일 연결 리스트 단점
 *  - 노드 색인의 효율성이 떨어진다.
 *  
 *  ● 단일 연결 리스트의 단점보완
 *  - 색인방향이 반대인 연결점을 구성한다.
 *  - 다음(next)와 이전(prev)의 이중 연결 → 이중 연결 리스트.
 *  
 *  ● 단일 연결 리스트와의 차이점
 *  - 이중의 노드 연결점이 구성된다.
 *  - 트리(Tree) 형태의 자료구조 설계가 가능하다.
 *  
 *  ※ 링크 : 떨어져있는 노드를 연결하기 위한 연결정보
 *  ※ 레퍼런스 값 : 힙(Heap) 영역에 할당된 메모리의 시작정보
 *  ※ 참조변수 : 힙 영역에 할당된 메모리의 레퍼런스 값을 저장하는 변수
 *  
 *  ● 구성요소
 *  
 *  1. NodeData : 노드의 데이터를 할당하는 생성자 클래스
 *  
 *  1-1. reference variable
 *  
 *  1-2. constructor
 *  
 *  1-3. method / function
 *  
 *  2-1. reference variable
 *  
 *  2-2. constructor
 *  
 *  3. ListContainer : 노드의 전반적인 관리를 담당하는 컨테이너(Container) 클래스
 *  ※ 컨테이너 : 객체의 관리와 관련된 핵심 기능들을 구성한 메서드의 집합
 *  
 *  3-1. reference variable
 *  
 *  3-2. method / function
 */

package com.algorithm.my.doublylink;

public class DoubleList {

	public static void main(String[] args) {

		ListContainer list = new ListContainer();
		
		list.insertNode(1, "a");
		list.insertNode(2, "b");
		list.insertNode(3, "c");
		list.insertNode(4, "d");
		list.insertNode(5, "e");
		list.insertNode(6, "f");
		list.insertNode(7, "g");
		
//		list.insertNode(1);
//		list.insertNode(new Node);
//		list.insertNode(new Node(), 1);
//		list.insertNode(new NodeData(1, "a")); **
//		list.insertNode(new NodeData(2, "b"), 3); **
//		list.insertNode(3, "c");
//		list.insertNode(4, "d", 5);
		
//		◆ 0번 index의 데이터를 지워라.
		list.deleteNodebyValue(4); 
		
		list.printList();
		
//		◆ value1이 5인 데이터를 지워라.
//		◇ int deleteNodebyValue(int _index)
		
//		◆ value2가 abc인 데이터를 지워라.
//		◇ int deleteNodebyString(String _str)
		
//		◆ value1이 5이고 value2가 abc인 데이터를 지워라. (and 조건)
//		◇ boolean deleteNodebyIndex(int _value, String _value2)
		
	}
}