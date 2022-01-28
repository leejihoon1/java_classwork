package koreait.day10;

import java.util.Random;
import java.util.Scanner;

public class MyRedPen2 {
	public static void main(String[] args) {
		
		int [] q = new int [10];
		int [] x;
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("빨간펜 수학 2자리 뎃셈 문제 풀기");
		System.out.println("---------------------");
		System.out.println("시작합니다.");
		Random r = new Random();
		boolean com = false;
		int i =0;
		int j;
		int random1 = r.nextInt(98)+1;
		int random2 = r.nextInt(98)+1;
		int random3 = random1 + random2;
			while(i <=10) 
				System.out.print("\n문제" + (i+1) +". " + random1 + "+" + random2 + " = 답 입력 -> ");	
				q[i] =sc.nextInt();
				if(q[i] == random3)
					System.out.print("정답입니다.!!");
				else 
					System.out.println("오답입니다. ㅠㅠ");
				
	
			System.out.println("채점합니다. 맞은 갯수 : " + q[i]);
	}
}





/* 오늘의 복습문제 : 배열, 클래스 -> 5시 40분에 파일제출
 * 
 * *실행화면*
 * -----------------
 * 빨간펜 수학2자리 덧셈 문제 풀기
 * -------------------
 * 시작합니다
 * 문제1.  23 + 56 = 답입력 ->
 * 문제2.  33 + 19 = 답입력 ->
 * 			.	
 * 			.
 * 문제 10. 28 + 32 = 답입력 ->
 * --------------------
 * 
 * 채점 합니다. 맞은 갯수...(..점)
 * 
 * 추가기능 : 틀린 문제 다시 보기 (배열), 계속하시겠습니까? (반복)
 * 처리 조건 : 문제 숫자들은 난수 이고 2자리 숫자로 하세요.
 */
