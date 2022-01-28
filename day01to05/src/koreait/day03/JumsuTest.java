package koreait.day03;

import java.util.Scanner;

public class JumsuTest {
	public static void main(String[] args) {
		System.out.println("------------------------");
		System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
		System.out.println("성적을 입력하세요.");
		
		int korean ;
		int english ;
		int science ;
		int sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 ->");
		korean = sc.nextInt();
		
		System.out.print("영어 ->");
		english = sc.nextInt();
		
		System.out.print("과학 ->");
		science = sc.nextInt();
		
		System.out.println("\n >> 처리되었습니다.");
		//총점 계산식
		
		sum = korean + english + science;
		System.out.printf("총점 : %d\n",sum);
	
		System.out.printf("평균 : % d(%.2f), 과목수 : %d\n", sum/3,(double)sum/3, 3 );
		//두번째 수식은 강졔형변환이 필요합니다.
		// -> 나눗셈결과 실수가 되려면 데이터 적어도 1개가 실수형식이어야 합니다.
		
//		int sum = korean + english + science;
//		
//		System.out.print("총점 - > ");
//		System.out.println(sum);
//		
//		System.out.print("평균 -> ");
//		System.out.printf("%.2f\n",(double)sum/3);
//		System.out.println(" >> 처리되었습니다.");
//		System.out.println("------------------------");
		
		sc.close();
	}
}
