package koreait.day10;

public class MyClass2 {
	// 접근 권한 연습합니다.
	private int age;		//	private : 다른클래스에서 사용 못합니다. 나(현재 클래스)만 쓰겟다.
	String name;			//  default(package) : 다른 패키지에서 사용 못합니다. 이웃이면 같이쓰자.
	public int score;		//  public	: 어디서나 사용 가능합니다. 공공의, 공용의...다 같이 쓰자.
  
	//생성자 메소드 : public default에 따라 접근권한 설정할 수 있습니다. 기본접근 권한 public
	//(자동으로 숨어있는) : 기본생성자 메소드 접근권한  public 
	
//	MyClass2(){
//		//	이렇게 수정하면 다른 패키지에서 객체 생성 못합니다.	
//	}
}
