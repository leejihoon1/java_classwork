package koreait.day03;

import java.util.Scanner;

public class ElseIfTest {
	public static void main(String[] args) {
//		응용 : point가 150 이상이면 사과세트를, 100~149이면, 귤 세트, 
//		50~99이면 과자세트를, 0~49이면 5000원 상품권
		Scanner sc = new Scanner(System.in);
		
		int point; 
		
		System.out.print("포인트 입력하세요. -> ");
		point = sc.nextInt( );
		
		System.out.println();
		System.out.println("설날 증정 선물: ");
		System.out.println();
		
		if(point >= 150) {
			System.out.println("VIP 회원님에게 사과세트를 선물로 드립니다.❤️");
		}else if(point >= 100){
			System.out.println("우수 회원님에게 귤 세트를 선물로 드립니다.❤️");
		}else if( point >=50) {
			System.out.println("일반 회원님에게 과자세트를 선물로 드립니다.❤️");
		}else {
			System.out.println("고객님께5000원 상품권을 선물로 드립니다.❤️");
		}
		
		System.out.println("이전 포인트 : " + point);
		point += 100;
		System.out.println("현재 포인트 : " + point);
		System.out.println("이용해주셔서 감사합니다.❤️");
		
		sc.close(); // Scanner 타입 변수 종료
		
		// 리소스(자원) : 입출력 클래스는  메모리 등  추가적인 자원을 사용하므로 해제도 필요로 합니다.
	}
}
