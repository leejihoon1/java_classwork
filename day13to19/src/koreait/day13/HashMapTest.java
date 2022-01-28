package koreait.day13;

import java.util.HashMap;
import java.util.TreeMap;

// ArrayList : 순차적(인덱스로 접근)으로 데이터를 관리하는 자료구조입니다. //배열과 유사한 구조입니다.
// HashMap : 순차적인 구조가 아닙니다. 인덱스가 없고 key 값을 이용하여 더이터 접급하여 저장/읽기 합니다.
//			  검색이 많은 앍리즘에 유용합니다.
// 위의 2개 클래스는 제너릭 타입 < > 기호안에 표시합니다. HashMap은 K : key, V : Value 한쌍입니다.
// 제너릭 타입은 int, long, double 기본형 타입 대신에 래퍼(wrapper)클래스로 표기합니다.
public class HashMapTest {
	
	public static void main(String[] args) {
	
//		HashMap<String, Integer> map = new HashMap<>();
//		key : String 타입 , value: int 데이터
		
		TreeMap<String, Integer>map = new TreeMap<>(); // key 값으로 오름차순 정렬이 가능한 Map입니다.
		// 1. 데이터 저장
		map.put("돼지국밥",9000 );
		map.put("스파게티", 13000);
		map.put("불고기", 15000);
		map.put("곱창전골", 20000);
		map.put("백반", 7000);
		
		System.out.println(map); // toString 재정의 되어 있습니다.
		
		// 2. 데이터 읽어오기 
		System.out.println("key : 곱창전골의 가격 = " + map.get("곱창전골") + "원");
		System.out.println("key : 삼겹살의 가격 = " + map.get("삼겹살") +  "원");
		//key 값으로 가져올 값이 없으면 결과 (리턴값)null
		
		String key = "백반";
		System.out.println("key : "+key+"의 가격 = " + map.get(key) +  "원");
		
		map.put("돼지국밥", 8000); 	// 실행결과 : value 변경 
		System.out.println(map);	// Map은  key(모든 타입)값이 index(정수)역할을 합니다.
									// key값은 유일하다
		map.remove("불고기",10000);	// 인자, 리턴형식 : Object -> 모든타입
		//Key, Value 모두 일치할 때 제거됩니다.
		System.out.println("삭제결과 : " + map);
		
		map.remove("불고기",15000);	
		System.out.println("삭제결과2 : " + map);
		
		int temp = map.remove("백반");
		System.out.println("remove int 리턴값 : " +temp); // 삭제된 항목의 value값이 반환
		System.out.println("삭제결과3 : " + map);
	}
	
}


















