// 학습목표 : 상속에 대한 이해 (재활용, 규약)

// 요구사항
// - 대학친구 : 이름, 전공,  전화번호
// - 직장동료 : 이름, 부서명, 전화번호

package com.example.teacher.inheritance.friend;

public class Index {

	public static void main(String[] args) {
		
		Friend[] friend = new Friend[10];
		int count = 0;
		
		friend[count++] = new UnivFriend("박상*", "컴**", "01*-1***-4***");
		friend[count++] = new UnivFriend("이연*", "경**", "01*-4***-7***");
		friend[count++] = new UnivFriend("운진*", "수**", "01*-0***-3***");
		friend[count++] = new UnivFriend("정훈*", "문**", "01*-3***-9***");
		friend[count++] = new UnivFriend("백지*", "영**", "01*-5***-8***");
		friend[count++] = new CompFriend("하수*", "디**", "01*-1***-8***");
		friend[count++] = new CompFriend("김진*", "전**", "01*-7***-2***");
		friend[count++] = new CompFriend("박하*", "총**", "01*-4***-1***");
		friend[count++] = new CompFriend("주세*", "내**", "01*-3***-0***");
		friend[count++] = new CompFriend("윤미*", "전**", "01*-4***-0***");
		
		for (int i = 0; i < count; i++)
		{
			friend[i].print();
			System.out.println("------------");
		}
	}
}