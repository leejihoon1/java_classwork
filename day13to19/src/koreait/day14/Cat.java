package koreait.day14;

public class Cat extends Animal{

	static final String TYPE = "고양이";
	
	public Cat() {
	}
	
	public Cat(String name, String color) {
		super(name,color);
	}
	
	@Override
	public void sound() {		
	}
	
	@Override
	public String toString() {
		return super.toString() + "  -  Type: " + TYPE; // super는 Animal클래스 toString 
	}
	
}
