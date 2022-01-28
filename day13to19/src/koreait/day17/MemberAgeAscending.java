package koreait.day17;

import java.util.Comparator;

public class MemberAgeAscending implements Comparator<Member>{
//	Member 클래스의 비교기준을 설정합니다. 나이의 오름차순으로 결정합니다.
	
	@Override
	public int compare(Member o1, Member o2) {
		Integer a = o1.getAge(); 	// int를  Integer타입으로 참조
		Integer b = o2.getAge();	
		//나이가 같을 때,( 기본은 데이터 입력순서 입니다) 이름순으로 하고 싶다면?
		if(a==b)
			return o1.getName().compareTo(o2.getName());
		else
			return b.compareTo(a); 		// compareTo는 비교메소드 : 래퍼클래스의 메소드
		// a > b : 음수 ,  a==b : 0, a < b : 양수
	}
	


}
