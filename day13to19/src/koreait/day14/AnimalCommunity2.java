package koreait.day14;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCommunity2{
	//작성자   :  강사님
	public static void main(String[] args) {
		// AnimalCommunity클래스 실행내용을  ArrayList 활용하여 구현합니다.
		
		ArrayList<Animal> animals = new ArrayList<>();
		
		animals.add( new Puppy("브라우니","Brown")); // 인덱스 0번
		animals.add(new Cat()); 				   //인덱스 1번
		animals.add(new Rabbit("바니바니","White")); // 인덱스 2번
		animals.get(1).setColor("black");
		animals.get(1).setName("냥이");
		
		System.out.println("[[환영합니다. 반려동물을 보여드리겠습니다.]]\n");
		for(int i = 0;i < animals.size();i++) {
				System.out.println((i+1) + ":" + animals.get(i));
		}
		System.out.println("[[우리 동물들의 소리도 들려드리겠습니다.]]");
		for(int i=0;i<animals.size();i++) {
			animals.get(i).sound(); //자식클래스가 구현한 내용으로 실행됩니다.
		}
		
		Member sana = new Member("사나",15);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("분양을 원하는 아이의 숫자를 선택해 주세요 -> ");
		int sel = sc.nextInt();
		
		System.out.print("선택하신" + animals.get(sel-1) + "는");
		if(sana.isAdopt(animals.get(sel-1))) {
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



