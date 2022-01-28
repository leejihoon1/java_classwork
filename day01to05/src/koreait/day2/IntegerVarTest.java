package koreait.day2;

public class IntegerVarTest { // 정수를 저장하는 변수 연습
	//이 자리에서 선언된 변수는 클래스의 필드가 됩니다.
	
	/* 변수 : 메모리에 저장된 값 중에서 변경할 수 있는 데이터를 말합니다.
			변수는 프로그램이 실행되는 동안에 임시로 사용하는 메모리 공간입니다.
	 		데이터가 저장된 메모르에 접근하기 위해서 변수명을 부여합니다.
	 		변수 선언한다 -> 변수명과 데이터의 형식을 지정하는것 -> 메모리에공간 할당  디ㅗㅂ니다.
	*/
	public static void main(String[] args) {
		
		// 지역변수
		byte n1; 	// 데이터 형식은 byte, 변수명은 n1
		short n2;	// 데이터 형식은 short, 변수명은 n2
		int n3;		// 데이터 형식은 int, 변수명은 n3
		long n4;	// 데이터 형식은 long, 변수명은 n4
		
		// 변수 선언 할 때에는 기본형 타입 (primitive, 원시형)타입 사용합니다.
		// byte, short, int, long 소문자로 시작하는 것은 정수 데이터 타입을 표시하는 키워드
		
		// 선언된 변수에 데이터 저장 : 대입문 ( = 기호사용)
//		n1 = 1997;  error  -> overFlow
		n1 = 100;
		n2 = 30000;
//		n2 = 40000;  error -> overFlow  
		n3 = 40000;
//		n3 = 4000000000; // 40억  error -> overFlow
		n4 = 4000000000L; // Long 형식의 데이터는 뒤어 L을 표기합니다. 
		
		// 변수의 사용 :출력/입력, 연산 등
		
		n3 = n3 + 100; // n3변수의 값이 덧셈 결과 값으로 변경됩니다.
		
		System.out.println("변수n1 = " + n1); // + 는 연결기호입니다.
		System.out.println("변수n2 = " + n2);
		System.out.println("변수n3 = " + n3);
		System.out.println("변수n4 = " + n4);
		
		// short 연산시 주의
		short result;
//		result = n2 + 100; // 100은 기본적으로 int 형식이고 n2는 short인데 
//							     정수의 사칙연산은 4바이트로 합니다
		
		int result2;
		result2 = n2 + n2; // 32767 + 32767 =? 정상적으로 int 에 저장할 수 있음
	}
}
