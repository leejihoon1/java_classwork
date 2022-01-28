package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class Numbergame {
//김재선
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans;		//사용자 입력답.
		int cnt=0;		//시도횟수
		int[] tried= new int[10];		//사용자 선택 숫자
		
		boolean correct = false;		//정답 맞췄는가.
		
		System.out.println("숫자 맞추기 게임을 시작하지");
		Random rnd = new Random();
		int numb= rnd.nextInt(99)+1;	//컴퓨터 숫자
		
		//System.out.println(numb);확인용
		System.out.println("숫자 배열 완료");
		System.out.println("숫자는 1~100중 하나이다.");
		
		for(int i= 0; i<tried.length; i++) {
			System.out.println("숫자를 맞춰보아라");
			ans = sc.nextInt();
			
			if (ans<numb) {
				System.out.println("너무 작다");
				cnt++;
				tried[i]= ans;
			}
			else if (ans>numb) {
				System.out.println("너무 크다");
				tried[i]= ans;
				cnt++; 
			}
			else if (ans==numb) {
				correct = true;
				break;		//for 종료 경우1)
			}
		}  // for종료 경우2) i값이 tried.length 일때
		if (correct ==true) {
		System.out.println("맞췄네. 시도한 숫자는" );
			for(int i=0; i<cnt; i++)
			{
				System.out.print(" "+tried[i]);
			}
		System.out.print(" 으로 " +cnt+"번이다.");
			
		}
		else
			System.out.println("Game Over");
		
		
	}
}
/* 오늘의 복습문제 : 간단한 숫자 맞추기 게임 (if, for문 연습합니다.) Numbergame.java
	*	*실행화면*
	*	--------------------------
	*	숫자 맞추기 게임입니다.  나 컴퓨터는 숫자를 결정했습니다.  * 101 ~299 -> 난수로 결정합니다.*
	*	너 휴먼은 맞춰보세요. 101 ~ 299
	*	생각한 숫자입력 -> ...
	*	아닙니다. 더 큰값입니다.
	*	생각한 숫자입력 -> ...
	*	아닙니다. 더 작은 값입니다.
	*	생각한 숫자 입력 -> 
	*	아닙니다. 더 큰 값입니다.
	*	생각한 숫자 입력 -> 딩동댕 맞추셧습니다. 지금까지 시도한 값 ... ... ... 4번만에 정답입니다.
	*	-------------------------------------------------------------
	*	완성하면 메일로 보내주세요. koreait.2021@gmail.com
*/