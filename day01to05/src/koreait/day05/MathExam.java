package koreait.day05;

import java.util.Scanner;

public class MathExam {
	public static void main(String[] args) {
		// 작성자 이지훈  22.01.04
		Scanner sc = new Scanner(System.in);
		
		boolean sk = false;
		System.out.println("[[수학 공부 도우미]]");
		
		while(!sk ) {
		System.out.println("\n1.덧셈\t2.뺼셈\t3.곱셈\t4.종료");
		System.out.print("원하시는 연산을 선택하세요 (1 ~ 4)");
	
			int sum,sum1,tsum,minus,minus1,tmiu,mul,mul1,tmul = 0; 
			int i = sc.nextInt();
			if(i == 1) {
				System.out.print("🦯값 1을 입력하세요 -> ");
				sum = sc.nextInt();
				System.out.print("🦯값 2을 입력하세요 -> ");
				sum1 = sc.nextInt();
				tsum = sum + sum1;
				System.out.println("정답 :"+sum+" + "+sum1+" + "+tsum+"입니다." );
			}else if(i == 2) {
				System.out.print("🦯값 1을 입력하세요 -> ");
				minus = sc.nextInt();
				System.out.print("🦯값 2을 입력하세요 -> ");
				minus1 = sc.nextInt();
				tmiu = minus - minus1;
				System.out.println("정답 : "+minus+" - "+minus1+" - "+tmiu+"입니다." );
			}else if(i == 3) {
				System.out.print("🦯값 1을 입력하세요 -> ");
				mul = sc.nextInt();
				System.out.print("🦯값 2을 입력하세요 -> ");
				mul1 = sc.nextInt();
				tmul = mul * mul1;
				System.out.println("정답 : "+mul+" * "+mul1+" * "+tmul+"입니다." );
			}else if (i == 4) {
				System.out.println("프로그램을 종료 합니다. Bye..👍");
				break;
			}else {
				System.out.println("잘못된 값을 입력하셨습니다.");
				if(i == 4 )
					sk = true;
				
			} 
		}	sc.close();
	}
}

//[[수학 공부 도우미]]
//		
//		1. 덧셈       2. 뺄셈    3. 곱셈      4. 종료
//		
//		연산을 선택하세요. ->  ..1..
//		✏️  값 1 을 입력하세요. ->  ..34..
//		✏️  값 2 을 입력하세요. ->  ..23..
//		정답  : 34 + 23 = 57 입니다.
//		
//		연산을 선택하세요. ->  ..2..
//		✏️  값 1 을 입력하세요. ->  ..71..
//		✏️  값 2 을 입력하세요. ->  ..23..
//		정답  : 71 - 23 = 48 입니다.
//		
//		연산을 선택하세요. ->  ..4.
//		프로그램을 종료 합니다.Bye,,👍👍
