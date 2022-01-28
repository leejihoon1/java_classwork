package koreait.day17;

import java.util.ArrayList;
import java.util.List;

public class CompareTest2 {
	
	public static void main(String[] args) {
		//User 객체 5개 생성하고 list에 담아서 sort해보세요
		//User 타입은 비교가능한 객체입니다.
		List<User>user= new ArrayList<>();
		
		user.add(new User("효정",22));
		user.add(new User("유아",23));
		user.add(new User("미미",22));
		user.add(new User("지호",21));
		user.add(new User("아린",20));
		
		System.out.println("user 정렬 전 : " + user);
		user.sort(null);
		System.out.println("user 정렬 후 : " + user);
		
		
		
		
	}
	
}


