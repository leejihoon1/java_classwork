package koreait.day03;

import java.util.Scanner;

public class IfTest { // boolean 자료형과 관계연산을 이용한 조건제어 연습합니다.
	public static void main(String[] args) {
		// if문의 형식 1: if(조건관계식){...A...} else {...B...}
		// 	A는 조건  관계식이 참일 때 실행하는 명령문들
		//  B는 조건 관계식이 거짓일 때 실행하는 명령문들
		// A,B가 명령문이 1개일때는 { } 생략합니다.
		
		// 응용 : point가 100점 이상이면 회원등급이 VIP, 100점 미만일 때 일반회원
		
		int point;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("포인트 입력하세요. -> ");
		point = sc.nextInt( );
		
		// if문을 이용합시다.
		
		System.out.print("회원등급 : ");
		if (point >= 100) {
			System.out.println("VIP");
		}else {
			System.out.println("일반회원");
		}
//		
		System.out.println();
		// point가 70 이상이면  +100을 추가 적립, 70미만이면 + 110을 추가 적립
		// point가 70 이상이면 "감사합니다", 70미만이면 "또 오세요." 메세지 출력
		if(point >=70) {
			point = point +100;
			point += 100; // 축약연산
			System.out.println("100포인트가 적립되었습니다. ❤️감사합니다.❤️" );
		}else {
			point += 110;
			System.out.println("110포인트가 적립되었습니다. ❤️또 오세요.❤️");
		}
		
		System.out.println("현재 포인트 : " + point);
		
		// if문의 형식 2: if(조건관계식1){..A..} // 조건관계식1이 참일 때
//					  else if(조건관계식2)  
//					 	 {..B..} 				// 조건 관계식 1이 거짓 조건관계식 2는 참일 때
//					  else 
//				  	 	 { ..C..} 				// 조건관계식1,2 가 모두 거짓일 때
		sc.close();
	}
}










