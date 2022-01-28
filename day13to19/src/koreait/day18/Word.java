package koreait.day18;

import java.util.List;

public class Word { // 객체를 생성하는 것이 목적인 클래스(객체 : 데이터 저장, 메소드 실행)

	private String english;
	private List<String> koreans; // 영어단어 1개에 여러가지 뜻이 있을 때. 각각list에 add합니다.
	private int level;
	
	public Word(String english) {
		this.english = english;
	}
	
	public Word(String english, List<String> koreans) {
		this(english);
		this.koreans = koreans; // 참조값(주소)를 전달합니다.(인자값을 필드값으로 대입)
	}
	
	@Override
	public String toString() {
		return english + ":" + koreans;
	}

	public String getEnglish() {
		return english;
	}

	public List<String> getKoreans() {
		return koreans;
	}

	public void setKoreans(List<String> koreans) {
		this.koreans = koreans;
	}
	
	
	
	
}
