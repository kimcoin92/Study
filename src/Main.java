/**  
 *   총 정리 / 테스트 로직
 *   
 *   작성일 : 2022년 7월 1일
 *   수정일 : 2022년 7월 9일
 *   
 *   Thanks to Instructor, Sung-Hun Jung!
 *   
 */  

import com.algorithm.queue._Queue;
import com.algorithm.stack._Stack;
import com.algorithm.linkedlist.*;

import com.comparable.Person;
import com.comparable.PersonComparator;
import com.inheritance.phone.*;
import com.inheritance.animal.*;
import com.inheritance.starcraft.*;
import com.linear.*;
import com.quadratic.*;

import java.util.Set;
import java.util.Queue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main
{
	// Algorithm Stack : Data Structure 구현
	public static boolean callAlgorithmStack()
	{
		_Stack stk = new _Stack(10);
		System.out.println(stk);
		
		return true;
	}
	
	// Algorithm Queue : Data Structure 구현
	public static boolean callAlgorithmQueue()
	{
		_Queue que = new _Queue(10);
		System.out.println(que);
		
		return true;
	}
	
	// Algorithm Singly Linked-List : Data Structure 구현
	public static boolean callAlgorithmSinglyLinkedList()
	{
		SinglyListContainer sList = new SinglyListContainer();
		
		sList.insertNode(0);
		sList.insertNode(1);
		sList.insertNode(2);
		
		sList.printAll();
		
		return true;
	}
	
	// Algorithm Doubly Linked-List : Data Structure 구현
	public static boolean callAlgorithmDoublyLinkedList()
	{
		DoublyListContainer dList = new DoublyListContainer();
		
		dList.insertNode(0);
		dList.insertNode(1);
		dList.insertNode(2);
		dList.insertNode(2);
		dList.insertNode(4);
		
		dList.printAll();
		
		return true;
	}
	
	// Comparator : Person에 대한 변수값 상하정렬
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

	// HashSet : 중복의 제거
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
	
	// Interface Queue : Linked-list 형태의 자료구조 구성
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
	
	// HashMap : Key와 Value의 개념과 Set을 이용한 중복 제거
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
	
	// HashMap : Person에 대한 변수값 순회 출력
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

	// Wrapper : Auto-Boxing 예제
	@SuppressWarnings({ "removal", "unused" })
	public static boolean callWrapperAutoBox()
	{
		// Boxing : 구버전
		Integer iii1 = new Integer(10);
		Double  ddd1 = new Double(20.32);
		
		Integer iii3 = Integer.valueOf("4"); // Boxing을 static method인 valueOf로 처리
		
		// Sugar-code
		// Boxing (Auto-Boxing) : 신버전
		Integer iii2 = 10;
		
		// Unboxing
		int iii = iii1.intValue();
		
		// Auto-Unboxing
		int jjj = iii2;
		
		iii2 = iii2 + 10;
		
		// 값의 강제변환
		double ddd = iii1.doubleValue();
		
		// -------------------------
		
		int aaa1 = 10;
		aaa1++;
		
		Integer aaa2 = 10;
		aaa2++;
		
//		자바에 허용하지 않는 Wrapper
//		IntData aaa3 = 10;
//		aaa3++;
		
		return true;
	}
	
	// Arrays : Person의 Binary-search
	public static boolean callArraysBinarySearch()
	{
		double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		// 1. arOrg와 동일한 배열을 만든다.
		double[] arCpy = Arrays.copyOf(arOrg, arOrg.length);
		System.out.println(Arrays.toString(arCpy));
		
		arCpy[0] = 0;
		for (double dd : arOrg)
		{
			System.out.println(dd);
		}
		
		// 2. arOrg의 일부분으로 배열을 만든다.
		// - (index 1부터 index 3의 전까지)
		double[] arCpyPart = Arrays.copyOfRange(arOrg, 1, 3);
		System.out.println(Arrays.toString(arCpyPart));
		
		// 3. 이미 할당된 배열에 외부의 값을 복사한다.
		double[] arr = new double[3];
		
		// arOrg의 index 1부터 arr의 3개의 index로 값을 복사한다.
		System.arraycopy(arOrg, 1, arr, 0, 3);
		System.out.println(Arrays.toString(arr));
		
		// 4. 배열을 비교한다.
		System.out.println(Arrays.equals(arOrg, arCpy));
		
		// 5. 배열 값을 정렬한다.
		int[] ar1 = {43, 2, 0, 4, 5};
		
		Arrays.sort(ar1);
		System.out.println(Arrays.toString(ar1));
		
		// 6. 특정 Object 배열을 정렬한다.
		//  - Compareable interface를 구현한다.
		//  - compareTo() 함수를 구현한다.
		Person[] arPerson = new Person[4];
		
		arPerson[0] = new Person("a", 5);
		arPerson[1] = new Person("b", 8);
		arPerson[2] = new Person("c", 7);
		arPerson[3] = new Person("d", 4);
		
		Arrays.sort(arPerson);
		
		for (Person p : arPerson)
		{
			System.out.println(p);
		}
		
		int idx = Arrays.binarySearch(arPerson, new Person("e", 4));
		
		System.out.println(idx);
		
		return true;
	}
	
	// Inheritance : Phone에 대한 상속관계 예제
	public static boolean exampleInteritancePhone()
	{
		MobilePhone phone1 = new MobilePhone();
		MobilePhone phone2 = new SmartPhone();
		
		phone1.call();
		phone2.call();
		
		return true;
	}
	
	// Inheritance : Starcraft에 대한 상속관계예제
	public static boolean exampleInheritanceStarcraft()
	{
		Unit[] ar = new Unit[4];
		ar[0] = new Hydra();
		ar[1] = new Hydra();
		ar[2] = new Ultra();
		ar[3] = new Ultra();
		ar[0].state = 1;
		ar[1].state = 1;
		ar[2].state = 1;
		ar[3].state = 1;
		for(int i = 0; i < ar.length; i++)
		ar[i].run(4);
		
		return true;
	}
	
	// Inheritance : Pet에 대한 상속관계예제
	public static boolean exampleInheritanceAnimal()
	{
		Dog kenny = new Dog();
		
		System.out.println(kenny);
		
		return true;
	}
	
	// String : Builder를 이용한 문자열 합치기 예제
	public static boolean exampleStringBuilder()
	{
		String str1 = "def";
		String str2 = "abc";
		
		int comp = str1.compareTo(str2);
		
		     if(0 == comp)
		{
			System.out.println("두 문자열이 같다");
		}
		else if(0 < comp)
		{
			System.out.println("사전 상 앞에 있는 경우");
		}
		else if(0 > comp)
		{
			System.out.println("사전 상 뒤에 있는 경우");
		}
		else
		{
			
		}
		     
		     StringBuilder numPart = new StringBuilder();
		     
		     numPart.append("801010");
		     numPart.append("1001234");
		     
		     StringBuilder numFull = new StringBuilder(numPart);
		     
		     System.out.println(numFull);
		
		return true;
	}

	// String : 일반코드와 슈가코드의 차이점 비교
	public static boolean exampleStringEquals()
	{
		String str1 = "abc";
		String str2 = "bc";
		
		if(true == str1.equals(str2))
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
		
		String str3 = new String ("def");
		String str4 = new String ("def");
		
		if(true == str3.equals(str4))
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
		
		String str5 = new String ("ghi");
		String str6 = new String ("Ghi");
		
		if(true == str5.equalsIgnoreCase(str6))
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
		return true;
	}
	
	// String : Substring으로 문자열 일부 추려내기
	public static boolean exampleStringSubstring()
	{
		String a = new String("unhappy");
		
		System.out.println(a.substring(2));
		
		String b = new String("antidisestablishmentarianism");
		
		System.out.println(b.substring(b.indexOf("i"), b.indexOf("m")));
		
		return true;
	}

	// Quadratic Function : 이차 함수, ax^2 + bx + c = 0의 근
	public static boolean callQuadratic()
	{
		Quadratic qd = new Quadratic(5, 10, 15);
		
		System.out.println(qd.getSolution(true));
		
		return true;
	}
	
	// Linear Function : 일자 함수, y = ax + b의 근
	public static boolean callLinear()
	{
		Linear lf = new Linear(new Position(3, 6), new Position(2, 4));
		System.out.println(lf.printForm());
		
		return true;
	}

	public static void main(String[] args)
	{	
		callAlgorithmDoublyLinkedList();
	}
}