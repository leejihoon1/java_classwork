package koreait.day02;

public class DoubleVarTest {
	public static void main(String[] args) {
		// 실수 타입을 연습합니다.
		
		// 1. 선언
		float p1;
		double p2;
		
		// 2. 데이터 저장
//		p1 = 3.1415; 	error 
		p1 = 3.1415f;  // float 형식으로 데이터를 표시할 떄에는 F(f)를 표기합니다.
		p2 = 3.1415;
		
		// 3. 변수 사용 : 연산
		p2 = p2 * 1.1;
		p1 = p1 * 1.1f;
//		p1 = p1 * 1.1;  // 사칙연산결과는 double (1.1f가 아니므로) 
//						   double 결과를  float에 저장 못합니다.
		/* float * float = float
		 * double * double = double
		 * float * double = double
		 */
		// p2값 출력해보세요.
		System.out.println("변수 p2 = " + p2);
		System.out.println("변수 p1 = " + p1);
		
		// 실제 기계어로 실수를 표현하는 방식은 복잡한 형식이 있습니다. 실제 결과와 다를 수도 있습니다.
		System.out.println(0.1 + 1.6); // 1.7000000000000002 ??
		System.out.printf("%5.2f\n",(0.1+1.6));  // %f는 실수 형식 , 전체 5자리, 소수점 이하 2자리
	
		//실수의 특별한 연산 결과
		System.out.println("Infinity(무한대): 0.0으로 나눌때 입니다.");
		System.out.println(3.0/0.0); // 나누기 기호는 / 입니다.
		System.out.println("NaN(Not a Number : 제수, 피젯수 모두 0.0일때 입니다.");
		System.out.println(0.0/0.0);
		System.out.println(0.0/3.0);
		
		// 그렇다면 정수는??? - > 0으로 나눌 때 오류가 납니다. 
//		System.out.println(3/0); error 
//		System.out.println(0/0); error
		System.out.println(0/3); // 결과 0 
		
		// 정수와 비교할 내용
		short s1 = 11;
//		s1 = s1 + s1;  error 11 + 11 결과를 s1에 저장하려고한다.
		
		float f1 = 1.2f;
		p1 = p1 + p1;
		
		// 데이터 형식의 변환 : 캐스팅이라고 합니다. -> 내일 진도에서 설명하겠습니다.
	}
}
