package koreait.day03;

import java.util.Scanner; // java.util패키지의 Scanner클래스를 메모리에 로드합니다.
						  // java.lang 기본패키지의 클래스들은 기본클래스 - import 안합니다.

public class KeyInputTest { // 키보드 입력으로 변수에 값을 저장하는 연습입니다.
	public static void main(String[] args) {
		// 키보드 입력은 표준 입력 : System 클래스 in 필드를 사용합니다.
		// -> 편하게 입력을 처리하기 위해 Scanner 클래스를 사용합니다.
		
		
		// 화면출력은 표준출력 : System클래스 out 필드를 사용합니다.
		System.out.println();
		
		// import 필요합니다.
		Scanner sc = new Scanner(System.in);
			//sc는 변수 입니다. 기본형 변수가 아니고 참조형(클래스 타입) 변수입니다.
		
		//입력을 위한코드
		//키보드 입력 -> 변수에 저장
		
		int data;
		System.out.print("정수 값 1개 입력하세요. --> ");
		data = sc.nextInt(); // 입력된 값을 정수로 변환하고 data변수에 저장합니다.
		
		System.out.println("지금 입력하신 값은 " + data + "입니다.!");
		//키보드입력 : 실행을 하면 커서가 보입니다. 커서 자리에서 입력합니다.
		
		//느낌으로 하는 미션.. 실수를 입력 받아서 출력(소수점 이하 4자리) 합니다
		
		double data1;
		System.out.print("\n실수값 1개 입력하세요 --> ");
		
		data1 = sc.nextDouble();
		
		System.out.printf("지금 입력하신 값은  실수 %.4f 입니다.!\n",data1);
		
		sc.close();
	}

}
