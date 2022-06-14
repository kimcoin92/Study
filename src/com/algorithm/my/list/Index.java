/** 
 *  ● 자료구조 (Data Structure) - 단일 연결 리스트 (Singly Linked List)
 *  
 *  ● 작성일 : 2022년 06월 14일
 *  ● 작성자 : 김주화 (kimcoin92)
 *  
 *	● 정의
 *  - 데이터가 한 방향으로 연결되어 있는 자료구조.
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
 *  ※ 링크 : 떨어져있는 노드를 연결하기 위한 연결정보
 *  ※ 레퍼런스 값 : 힙(Heap) 영역에 할당된 메모리의 시작정보
 *  ※ 참조변수 : 힙 영역에 할당된 메모리의 레퍼런스 값을 저장하는 변수
 *  
 *  ● 단일 리스트의 구성
 *  
 *  1. class 단위
 *  - Node : 일반 데이터와 상호 연결을 위한 링크 데이터를 할당하는 클래스.
 *  - NodeData : 노드의 일반 데이터를 할당하는 생성자 클래스.
 *  - ListContainer : 노드의 전반적인 관리를 담당하는 컨테이너(Container) 클래스.
 *  
 *  ※ 컨테이너 : 객체의 관리와 관련된 핵심 기능들을 구성한 메서드의 집합
 *  
 *  2. reference variable 단위
 *  - head
 *  - next
 *  - count
 *  
 *  3. method / function 단위
 * 
 *  ● 노드 삭제의 원리
 *  - 지우는 노드의 시작정보는 그 이전 노드가 가지고 있다.
 *  - 이전 노드의 시작정보를 지우는 노드의 앞 노드와 연결시킨다.
 *  - 앞 노드와의 연결은 지우는 노드의 앞 노드의 시작정보를 이전 노드에게 전달하여 연결시킨다.
 *  - 연결 정보지우는 노드와 데이터는 이전 노드와의 연결이 끊겨 Garbage Collector에게 정리된다.
 * 
 */

package com.algorithm.my.list;

public class Index
{
	public static void main(String[] args)
	{
		
	}
}
