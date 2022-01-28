package koreait.day14;

public abstract class Animal { // abstract클래스는 abstract메소드를 갖는것이 일반적입니다.
							   // abstract 메소드는 有無와 상관없이 객체는 직접 생성 못합니다.
							   // -> 추상메소드를  자식클래스가 구현하면 구체화됩니다.
	
	//필드 : 공통적인 값
	private String name;
	private String color;
	
	//생성자
	public Animal() {
		System.out.println("새로운 반려동물이 태어났습니다.");
	}
	//Object클래스의 toString 메소드
	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + "]";
		//TYPE필드 값을 여기서 출력하면 이 코드가 있는 Animal의 TYPE이 출력됩니다.
		//자식클래스의 TYPE필드값을 출력 안합니다. 결론 TYPE
	}

	public Animal(String name) {
		this();  // 자기자신의 객체의 기본생성자 메소드 호출
		this.name = name;		
	}

	public Animal(String name, String color) {
		this(name);
		this.color = color;
	}

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//추상메소드
	public abstract void sound();

}
