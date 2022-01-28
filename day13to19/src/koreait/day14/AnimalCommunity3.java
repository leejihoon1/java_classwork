package koreait.day14;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCommunity3{
	//작성자   :  이지훈
	public static void main(String[] args) {
		// AnimalCommunity클래스 실행내용을  ArrayList 활용하여 구현합니다.
		
		ArrayList<Animal> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		list.add( new Puppy("브라우니","Brown"));
		list.add(new Cat());
		list.add(new Rabbit("바니바니","White"));
		
		System.out.println("[[환영합니다. 반려동물을 보여드리겠습니다.]]\n");
		for(int i = 0;i < list.size();i++) {
				System.out.println(i + ":" +list.toString());
		}
		
//		System.out.println("[[우리 동물들의 소리도 들려드리겠습니다.]]");
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i).sound()); //자식클래스가 구현한 내용으로 실행됩니다.
//		}
		
		Member sana = new Member("사나",15);
		System.out.print("분양을 원하는 아이의 숫자를 선택해 주세요 -> ");
		int sel = sc.nextInt();
		
		System.out.print("선택하신" + list.get(sel) + "는");
		if(sana.isAdopt(list.get(sel))) {
			System.out.print("분양 가능합니다.");
		}else {
			System.out.print("아쉽지만 분양 하실 수 없는 나이 입니다.");
		}
		
		System.out.println("TYPE 상수 필드 확인합니다.");
		System.out.println(Cat.TYPE); // static 필드는 속해 있는 클래스로 구별합니다.
		System.out.println(Puppy.TYPE);
		System.out.println(Rabbit.TYPE);
		
		
	}
}



