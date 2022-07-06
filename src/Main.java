/**  
 *   ● 총 정리 / 테스트 로직
 *   
 *   ● 작성일 : 2022년 7월 1일
 *   ● 수정일 : 2022년 7월 6일
 *   
 *   ● Thanks to Instructor, Sung-Hun Jung!
 *   
 */  

import com.algorithm.queue._Queue;
import com.algorithm.stack._Stack;

import com.comparable.Person;
import com.comparable.PersonComparator;

import java.util.Set;
import java.util.Queue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main
{
	// 1. Algorithm Stack : Data Structure 구현
	public static boolean callAlgorithmStack()
	{
		_Stack stk = new _Stack(10);
		System.out.println(stk);
		
		return true;
	}
	
	// 2. Algorithm Queue : Data Structure 구현
	public static boolean callAlgorithmQueue()
	{
		_Queue que = new _Queue(10);
		System.out.println(que);
		
		return true;
	}
	
	// 3. Comparator : Person에 대한 변수값 상하정렬
	public static boolean callComparePerson()
	{
		// new PersonComparator : 역순 정렬
		TreeSet<Person> pSet = new TreeSet<>(new PersonComparator());
		
		pSet.add(new Person("Tom Cruise", 60));
		pSet.add(new Person("Don Lee", 51));
		pSet.add(new Person("Robert Downey Jr.", 57));
		pSet.add(new Person("Tom Hardy", 44));
		
		for (Person p2 : pSet)
		{
			System.out.println(p2);
		}
		
		return true;
	}

	// 4. HashSet : 중복의 제거
	public static boolean callHashSet()
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("abc");
		list.add("abc");
		list.add("def");
		list.add("def");
		list.add("stx");
		
		HashSet<String> tempSet = new HashSet<>(list);
		
		list = new ArrayList<String>(tempSet);
		
		for (String str : list)
		{
			System.out.println(str);
		}
		
		return true;
	}
	
	// 5. Interface Queue : Linked-list 형태의 자료구조 구성
	public static boolean callInterfaceQueue()
	{
		String peekTemp;
		String pollTemp;
		
		Queue<String> ql = new LinkedList<>();
		

		// (1) offer & poll
		
		ql.offer("data1");
		ql.offer("data2");
		ql.offer("data3");
		
		System.out.println("--------------------------");
		
		peekTemp = ql.peek();
		System.out.printf("all: %s\n", ql);
		System.out.printf("peek: %s\n", peekTemp);
		System.out.println("--------------------------");
		
		pollTemp = ql.poll();
		System.out.printf("all: %s\n", ql);
		System.out.printf("poll: %s\n", pollTemp);
		System.out.println("--------------------------");
		
		pollTemp = ql.poll();
		System.out.printf("all: %s\n", ql);
		System.out.printf("poll: %s\n", pollTemp);
		System.out.println("--------------------------");
		
		pollTemp = ql.poll();
		System.out.printf("all: %s\n", ql);
		System.out.printf("poll: %s\n", pollTemp);
		System.out.println("--------------------------");
		
		// poll 사용 시, null값 도출
		pollTemp = ql.poll();
		System.out.printf("all: %s\n", ql);
		System.out.printf("poll: %s\n", pollTemp);
		
		
		// (2) push & pop
		
		ql.add("data1");
		ql.add("data2");
		ql.add("data3");
		
		System.out.println("--------------------------");
		
		peekTemp = ql.element();
		System.out.printf("all: %s\n", ql);
		System.out.printf("peek: %s\n", peekTemp);
		System.out.println("--------------------------");
		
		pollTemp = ql.remove();
		System.out.printf("all: %s\n", ql);
		System.out.printf("poll: %s\n", pollTemp);
		System.out.println("--------------------------");
		
		pollTemp = ql.remove();
		System.out.printf("all: %s\n", ql);
		System.out.printf("poll: %s\n", pollTemp);
		System.out.println("--------------------------");
		
		pollTemp = ql.remove();
		System.out.printf("all: %s\n", ql);
		System.out.printf("poll: %s\n", pollTemp);
		System.out.println("--------------------------");
		
		/* remove 사용 시, "NoSuchElementException" 예외 발생
		pollTemp = ql.remove();
		System.out.printf("all: %s\n", ql);
		System.out.printf("poll: %s\n", pollTemp);
		System.out.println("--------------------------");
		*/
		
		return true;
	}
	
	// 6. HashMap : Key와 Value의 개념과 Set을 이용한 중복 제거
	public static boolean callHashMap()
	{
		// HashMap<K, V> : Key와 Value
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		map.put(6, "f");
		
		// 상이한 구조로 인해 Iterator를 먼저 가져오지 못하고
		// Set을 통해 가져올 수 있다.
		Set<Integer> kSet = map.keySet();
		
		System.out.println("--------------------------------");
		
		for (Integer fNum : kSet)
		{
			System.out.printf("Key: %d, Value: %s\n", fNum, map.get(fNum));
		}
		
		System.out.println("--------------------------------");
		
		Iterator<Integer> iter = kSet.iterator();
		
		while (iter.hasNext())
		{
			Integer iNum = iter.next();
			
			System.out.printf("Key: %d, Value: %s\n", iNum, map.get(iNum));
		}
		
		System.out.println("--------------------------------");
		
		return true;
	}
	
	// 7. HashMap : Person에 대한 변수값 순회 출력
	public static boolean callHashMapPerson()
	{
		HashMap<Integer, Person> p1 = new HashMap<>();
		
		p1.put(1, new Person("Tom", 30));
		p1.put(2, new Person("Jim", 21));
		p1.put(3, new Person("Ann", 45));
		p1.put(4, new Person("Han", 62));
		p1.put(5, new Person("Kim", 16));
		
		Set<Integer> pSet = p1.keySet();
		
		Iterator<Integer> iter = pSet.iterator();
		
		while (iter.hasNext())
		{
			Integer itrNum = iter.next();
			
			System.out.printf("id: %s, Value: %s\n", itrNum, p1.get(itrNum));
		}
		
		return true;
	}

	
	
	public static void main(String[] args)
	{	
		
	}
}