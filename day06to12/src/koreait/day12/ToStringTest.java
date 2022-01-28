package koreait.day12;

public class ToStringTest {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.id = 20220100;
		member.name = "이모모";
		// member.print(); // 지금까지 만들 었던 메소드 : 필드 출력 용도입니다.
		
		System.out.println("toString 결과  : " + member.toString());
		//toString 재정의 하기 전
		//toString 결과 : toString 결과  : koreait.day12.Member@15db9742(패키지명. 클래스 @객체구별값16진수)
		//toString 재정의 한 후 겨과 : toString 결과  : Member [id=20220100, name=이모모]
		
		System.out.println("toString 생략 : " + member);
	}
}
