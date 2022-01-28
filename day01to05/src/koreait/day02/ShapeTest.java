package koreait.day02;

public class ShapeTest {
	public static void main(String[] args) {
		// 작성자 : 이 지 훈
		
		// 변수
		// 사각형
		int height = 19;
		int width = 23;
		int area;
		System.out.println("[사각형 도형의 넓이 구하기]");
		System.out.println("가로 :" +height+"㎠");
		System.out.println("세로 :" +width+"㎠");
		System.out.println("넓이를 구햇습니다 " + height*width+"㎠");
		
		// 원 : 결과 출력할 때 소수점 이하 3자리로 출력하세요.
		double radius = 23;
		double round;
		double c_area;
		round = 2 * 3.14 * radius; 
		c_area = 3.14 * radius * radius;
		System.out.println("[원 도형의 넓이와 둘레 구하기]");
		System.out.printf("반지름  : %.0fcm\n" , radius);
		System.out.printf("둘레를 구했습니다 =%.3f㎠\n",+ round);
		System.out.printf("넓이를 구했습니다 = %.3f㎠\n", c_area);
		
	}
}
