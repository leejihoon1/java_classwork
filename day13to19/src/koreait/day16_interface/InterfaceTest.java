package koreait.day16_interface;

public class InterfaceTest {

	public static void main(String[] args) {
		//기본적인 방식
		MyClassA my1 = new MyClassA();
		MyClassAB my2 = new MyClassAB();
		
		
		//1. 인터페이스로는 객체를 생성할 수 없습니다.
		//2. 인터페이스 타입으로 객체를 참조합니다.
//		(인터페이스는 '추상메소드'라는 규칙으로 이 것을 구현한 클래스는 하나의 타입 (그룹)으로 묶을 수 있다. 
		
		InterFaceA ia1 = new MyClassA();
		InterFaceA ia2 = new MyClassAB();
		
		InterfaceB ib1 = new MyClassAB();
		InterfaceB ib2 = new MyClassC(); 
//		InterfaceB ib2 = new MyClassA(); // 오류
		
		InterFaceA[] aas = new InterFaceA[3];
	
		
		
	}
}



