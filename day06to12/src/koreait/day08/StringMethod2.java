package koreait.day08;

public class StringMethod2 {
	public static void main(String[] args) {
		//문자열 메소드 연습2
		// 1. indexOf: contains 처럼 특정 문자열을 찾아서 시작 위치값을 변환.
		String msg = "koreait.2021@gmail.com";
		System.out.println("gmail의 시작 위치 : " + msg.indexOf("gmail"));
		System.out.println("gmail의 시작 위치 : " + msg.indexOf("naver")); // 반환값은? 해당문자열이 없을 때 -1
		
		msg = "it gmail it gmail";
		System.out.println("마지막 gmail문자열의 시작위치 : " + msg.lastIndexOf("gmail"));

		// 2. 문자열의 첫 부분 또는 마지막 부분을 검사
		System.out.println("korea로 시작하는가? " + msg.startsWith("korea")); // false
		System.out.println("it로 시작하는가? " + msg.startsWith("it"));	//	true
		
		System.out.println("mail으로 끝나는가? " + msg.endsWith("mail")); // false
		System.out.println("@로 끝나는가? " + msg.endsWith("@"));	//	false
		
		// 3. 문자열 부분적인 추출하기
		msg = "i like java";
		String temp;
		temp = msg.substring(4);
		System.out.println("substring(4) : " + msg.substring(4));
		temp = msg.substring(4,8);
		System.out.println("sudstring(4,8) : " + msg.substring(4,8));
		//문제 : java 추출하려면 substring 메소드 인자는?
		//문제 : like 추출하려면 substring 메소드 인자는?
		temp = msg.substring(7);
		System.out.println("substring(7): " + msg.substring(7));
		temp = msg.substring(2,6);
		System.out.println("substring(2,6): " + msg.substring(2,6));
		
		int start = msg.indexOf("like");
		int len = "like".length();
		temp = msg.substring(start,start+len);
		System.out.println("start : " + start + ", len : " + len + ", 추출결과 : " + temp);
		
		// 4. 문자열 치환하기
		msg = "koreait.2021@gmail.com - 2021";
		temp = msg.replaceAll("2021", "1999"); // 인자 2개 - 첫 번쨰 찾는 문자열, 두 번쨰는 바꿀 문자열 입니다.
		System.out.println("replace 결과 : " + temp);
		temp = msg.replace("gmail", "daum");
		System.out.println("replace 결과 : " + temp); // 바꾸는 글자 수가 같지 않아도 상관 없음
		
		msg= "그는 오늘 치킨을 그녀와 먹는다. 치킨 브랜드는 ..그녀는 비비큐 좋아함...치킨의 재료 원산지는 브라질산이다.";
		// msg 문자열에서 "치킨"이 몇번 나오는지 출력해보기.
		
		int idx;	// 치킨의 위치 저장.
		int cnt = 0;  //카운트 변수
		temp = msg;
		String find = "브라질";
		while(true) {
			idx = temp.indexOf(find);
			if(idx == -1) break;
			cnt++;
			temp = temp.substring(idx+find.length()); // 치킨은 length가 2 -> 첫 번째 찾은 치킨 뒤부터 문자열 추출.
		}
		
		System.out.println(find +" 을 찾은 횟수 : " + cnt);
		
	}
}





