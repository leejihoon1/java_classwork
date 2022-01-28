package test;

import java.util.ArrayList;
import java.util.Arrays;

public class ProgramTest3 {
	
	public static void main(String[] args) {
		
	String[] singers = {"boa","소녀시대","아이유","twice","악동뮤지션","나훈아"};
	int i;
	String find = "나훈아";
		
	System.out.println("실행 시작합니다. ------------------------");	
	for(i=0; i<singers.length;i++) {
		if(singers[i].equals(find)) {
			System.out.println(find + "는 index " + i + " 의 데이터 입니다.");
		}
	}
		
	System.out.println("실행 종료합니다. ------------------------");	
		
	ArrayList<String>sing = new ArrayList();	
	
	sing.add("boa");
	sing.add("소녀시대");
	sing.add("아이유");
	sing.add("twice");
	sing.add("악동뮤지션");
	sing.add("나훈아");
		
	System.out.println(sing);  
	System.out.println(Arrays.toString(singers));
		
	System.out.println("sing의 크기 : " + sing.size());
	
	sing.add(2,"에스파");  
	System.out.println(sing); 
	System.out.println("sing의 크기 : " + sing.size());	

	sing.remove(3);
	System.out.println(sing); 
	System.out.println("sing의 크기 : " + sing.size());	

	String temp = sing.get(3);
	System.out.println("인덱스 3 데이터 : " + temp);
	System.out.println("인덱스 2 데이터 : " + sing.get(2));
	
	System.out.println(sing.contains("나훈아"));
	System.out.println(sing.contains("빅뱅"));
	
	
		for(i =0; i < sing.size();i++) {
			System.out.println("index " + i + " = " + sing.get(i));
		}
	}	
}

