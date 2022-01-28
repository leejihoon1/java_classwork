package koreait.day07;

public class CharArrayTest {
	//char 타입의 배열을 연습합니다.
	
	public static void main(String[] args) {
		//배열의 선언
		char[]carr1 = {'i','a','m','j','a','v','a'};
		char[]carr2 = new char[20];
		
		System.out.println("carr1 배열 길이(크기) : " + carr1.length);
		System.out.println("carr2 배열 길이(크기) : " + carr2.length);
		
		System.out.println("carr1배열 3번째 데이터의 값 : " + carr1[2]); // m 
		System.out.println("carr2배열 3번째 데이터의 값 : " + carr2[2]); // 공백
		
		for(int i=0;i<carr1.length;i++) { 
			System.out.println("carr1["+i+"]의 데이터 값 : " + carr1[i]);
		}
		
		for(int i=0;i<carr1.length;i++) { 
			System.out.print(carr1[i]);
		}
		
		//문자타입 char의 배열은 문자열과 유사합니다.
		System.out.println(carr1); // char는 toString 안해줘도 값이 찍힘!
		
		String name = "java";
//		carr2 = "hello hi goodbye"; // 오류 : char배열에  바로 문자열 대입은 오류.
		carr2 = "hello hi goodbye".toCharArray(); // String 문자열 객체를 char 배열로 변환
		System.out.println(carr2); 
		
		carr2 = "hello hi goodbye goodbye goodbye".toCharArray(); // 선언된 배열의 크기보다 클떄
		System.out.println("carr2.length : " + carr2.length);  	  //  -> 배열의 크기가 변경됩니다.
		
		
	}

}










