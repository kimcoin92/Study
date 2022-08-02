package com.generic.fruits;

/*  
 *  일반적인 형태
 *  public class DBox
 *  {
 *  private String left;
 *  private Integer right;
 *  }
 *  
 */

// 제네릭 : 별도로 각각 가져가겠다는 의미
// L, R과 같은 요소를 type parameter
// 최초 제네릭 개발자의 type parameter 정의 : template (비유 : 붕어빵 틀)
public class DualBox<L, R>
{
	
//	다목적인 형태의 Object는 오용의 문제가 발생할 소지가 있다.
//	private Object left;
//	private Object right;
	
	private L left;
	private R right;
	
	public DualBox()
	{
//		run-time은 heap에서 생성된다.
//		primitive 타입은 stack : L, R는 참조 변수일 수 밖에 없다.
		left = null;
		right = null;
	}
	
	public DualBox(L _left, R _right)
	{
		left = _left;
		right = _right;
	}
	
	public void setBox(L _left, R _right)
	{
		left = _left;
		right = _right;
	}
	
	public L getLeft()
	{
		return left;
	}
	
	public R getRight()
	{
		return right;
	}

	@Override
	public String toString()
	{
		return "DualBox [left=" + left + ", right=" + right + "]";
	}
}