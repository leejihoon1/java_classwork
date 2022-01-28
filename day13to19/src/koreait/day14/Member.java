package koreait.day14;

public class Member {

	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("새로운 회원<"+this.name+">님 환영합니다.");
	}
	
	//회원이 분양받습니다. 회원나이 강아지는 15세이상, 고양이는 18세이상, 토끼는  13세 이상 분양 받을 수 있다. 
	boolean isAdopt(Animal animal) { //Animal 자식클래스 Puppy Cat Rabbit객체가  animal변수로 참조하게 됩니다.
		// 현재 회원객체가 인자로 전달받은 animal 객체를 분양받을 자격이 되는지 반환값 결정한다.
		//instanceof 연산 : 구체화된 객체타입을 검사합니다. 자식클래스 객체들에게 사용하는 연산
		if(animal instanceof Puppy &&this.age >=15) return true;
		else if(animal instanceof Cat && this.age >=18) return true;
		else if(animal instanceof Rabbit && this.age >=13) return true;
		else
			return false;
	}
	
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

	//getter
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}
