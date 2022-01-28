package koreait.day13;

public class ASquare extends AShape{
	
	private int width;

	
	public String square() {
		return "square - 정사각형";
	}
	
	// getter, setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
	//추상메소드 구현
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*width;
	}

}
