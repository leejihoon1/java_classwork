package koreait.day05;

import java.util.Scanner;

public class MaxMinValueEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		int max; // 최대값
		int min; // 최소값
		
		System.out.println("n1, n2, n3에 저장할 값 3개를 입력하세요.");
		System.out.print("n1 -> ");
		n1 =sc.nextInt();
		System.out.print("n2 -> ");
		n2 =sc.nextInt();
		System.out.print("n3 -> ");
		n3 =sc.nextInt();
		
		if(n1 > n2) {
			max = n1; // max의 중간결과 값
			min = n2; // min의 중간결과값
		}else { 
			max = n2;
			min = n1;
		}
		
		if(max < n3) max = n3;
		if(min > n3) min = n3;
		
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
		// 조건 연산자(3항연산)로 변경하면
		max = (n1 > n2)? n1:n2;
		min = (n1 < n2)? n1:n2;
		max = (max < n3)? n3:max;
		min = (max > n3)? n3:min;
		
		sc.close();
	}
}












