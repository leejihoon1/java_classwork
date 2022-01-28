package koreait.day12;

import java.util.ArrayList;
import java.util.Scanner;

public class MyRedPenV3 {
	public static void main(String[] args) {
		ArrayList<MathProblem> addList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);		
		int cnt = 0 ; //맞은개수 카운트 
		int ans;
		System.out.println("---------------------");
		System.out.println("빨간펜 수학 2자리 뎃셈 문제 풀기");
		System.out.println("---------------------");
		System.out.println("시작합니다.");
		for(int i =0; i < 5; i++) {
			MathProblem p1 = new MathProblem('+');
			addList.add(p1);
			p1.makeProb(); // 문제만드는 메소드 : 연산 종류에 따라 숫자가 다른 범위 난수로 만들어집니다.
				System.out.print("문제 "+(i+1)+".  " + p1+ "답 입력 ->  ");
				 ans = sc.nextInt();
			if(ans == p1.showAnswer()) {
				cnt++; p1.setCorrect(true);
			}
		} // for end
		System.out.println("---------------------");
		System.out.println("채점 합니다. 맞은 갯수" + (cnt) + "(" +((cnt)*20)+"점)");
		System.out.println("::::: 틀린문제 다시보기 :::::");
		for(MathProblem prob : addList) {
			if(!prob.isCorrect())
				System.out.println(prob + " =  정답 : " + prob.showAnswer());
		}
		//계속 할까요? -> 연산자를 선택할 수 있도록 그 기능을 추가해서 V4를 만들어 보세요.(주말 미션)
		sc.close();
	}
}
/*	오늘의 문제 ArrayList 연습합니다.
 * MathProblem.java 클래스 객체들을 ArrayList를 이용하여 저장합니다(참조값 저장)
 * 덧셈문제 10개 생성하여 addList변수로 참조합니다.
 * 맞은문제(true), 틀린 문제(false)를 boolean isCorrect; 필드를 추가하여 저장합니다. (사용자 답을 저장하는 필드도 추가 가능합니다.)
 * 채점 후에 틀린 문제를 정답과 함꼐 보여줍니다.
 * 계속하시겠습니까? (계속 하라면 0입력)기능 추가하여 문제풀이 10개를 반복합니다.
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
 * :::: 틀린 문제 보기 ::::
 * 
 */
