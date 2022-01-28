package koreait.day03;

import java.util.Scanner;

public class BooleanTest {
	public static void main(String[] args) { // boolean자료형을 연습
		// boolean 자료와 관련된 주요 연산은 관계연산(비교)입니다. 
		// -> 비교연산자 : >, <, >=, <=, ==, != (같지 않다)
		// -> 관계 연산의 결과는 ? true false
		
		boolean result; // true 또는 false가 저장됩니다.
		
		result = 10 > 5;
		System.out.println("결과 : " + result);
		
		result = (10 != 10);
		System.out.println("결과 : " + result);
		
		int data;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비교할 값 입력 >>> ");
		data = sc.nextInt();
		//boolean 출력은 %s
		System.out.printf("비교 결과 data >=50 : %s\n", data >= 50);
		
		//응용 : 입력된  data 값이 50보다 작으면 포인트 50을 적립해준다.
//							50보다 크거나 같으면 포인트 10을 적립해준다.
	}
}
