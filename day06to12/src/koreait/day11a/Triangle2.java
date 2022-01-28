package koreait.day11a;

import koreait.day11.Shape;

public class Triangle2 extends Shape{
	
	public Triangle2(String shapeName, int width, int height) { 
		
		super(shapeName,width,height);
		
	}
	
	public void print() { // getshapeName() : shape 클래스의 필드가 private 접근자입니다.
		System.out.println("도형이름  : " + getShapeName() +  ", 너비 : " + getWidth() +
				", 높이 : " + getHeight());
		System.out.println("특별한 변수 테스트(Triangle메소트에서 출력)----");
//		System.out.println("기타정보 : " + etc); // 다른패키지 클래스의 기본접근자 필드는 사용 못합니다.
		System.out.println("count : " + count); //다른 패키지 클래스 이지만 자식 클래스 이므로 사용합니다.
	}
	
	public int getArea() { // ***** 부모 크래스가 정의한 같은 형식의 메소드를 수정합니다. *****
		return (getHeight() * getWidth())/2;
	}
	
	public double getAreaDouble() { // 같은 이름의 서로 다른 메소드가 있으면 오류입니다.
		return (double)(getHeight() * getWidth())/2;
	}
}












