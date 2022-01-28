package koreait.day15;

import java.util.Random;

public class MathProblem {

	private int n1;
	private int n2;
	private char op; // 연산자 +, - , *, /
	private boolean isCorrect;
	
	
	
	public boolean isCorrect() { //gettter
		return isCorrect;
	}


	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	// * 여기까지
	public MathProblem(char op) {
		this.op = op;
	}


	public void makeProb() { // 사칙엲산 종류별로 적절한 난수 생성하기 -> 문제를 만들어줍니다.

		Random r = new Random();
		int max1=0,min1=0,min2=0,max2=0;
		switch (op) {
		case '+':
			max1=99; max2=99; min1=11; min2=11;
			break;
		case '-':
			max1=99; max2=49; min1=50; min2=11;
			break;
		case '*':
			max1=77; max2=29; min1=11; min2=11;
			break;
		case '/':
			max1=77; max2=29; min1=30; min2=11;
			break;

		}
		n1 = r.nextInt(max1-min1+1)+min1;
		n2 = r.nextInt(max2-min2+1)+min2;
	}
	
	public int showAnswer() { // n1, n2, op 필드 값을 가져와서 정답 계산하여 반환 합니다.
		int result = 0;
		switch (op) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			result = n1 / n2;
			break;
		}
		return result;
	}

	public void print() {
		System.out.println(n1 + " " + op + " " + n2 + " = ");
	}
	
	@Override
	public String toString() {
		return n1 + " " + op + " " + n2 + " = ";
	}
	
	// getter 메소드만 작정합니다.
	public int getN1() {
		return n1;
	}

	public int getN2() {
		return n2;
	}

	public char getOp() {
		return op;
	}

}
/*day 12 순서


1. 오늘의 복습문제

day 10 프로젝트 MyRedPen.java 를 클래스로 작성해 봅시다.


처리조건
1. 클래스의 구성 : 사칙연산 4가지를 문제로 출제한다. -> 필드 구성 
	1) 사칙연산 4가지에 대해 적절한 난수(n1, n2)를 발생시키는 메소드를 작성한다. //r.nextInt(max - min +1)+min 
	덧셈은 n1,n2범위 11 ~ 99
	뺄셈에서는 n1 > n2, (n1 50 ~ 99, n2 11 ~ 49)    
	곱셈에서는  (n1은 11 ~ 77, n2는 11 ~ 29)
	나눗셈(몫)에서는 n1 > n2, (n1은 30 ~ 77, n2는 11 ~ 29)
	
	2) 정답 값을 구해주는 메소드
	
2. 
*/