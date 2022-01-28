package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LottoArrayList {
	
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> lotto = new ArrayList<>(); // 선택된 숫자 저장
		ArrayList<Integer> balls = new ArrayList<>(); // 공 45개 저장하는 리스트 -> 44개->43개...
		int s = 0;
		//1.balls리스트에 1 ~ 45 숫자를 추가한다.
		for(int i=1; i<=45; i++) {
			balls.add(i);
		}
		//확인 : 출력해보기
		int k;
		for(int cnt =0; cnt < 6; cnt++) {
			
			k = r.nextInt(45-cnt); // 경계값을 45(0~44),44(0~43),43(0~42),42(0~41),41(0~40),40(0~39)
			int temp = balls.get(k); lotto.add(temp); // lotto.add(balls.get(k));
				
			balls.remove(k);
			
			System.out.println("뽑힌 숫자 : " +lotto);
			System.out.println("현재 공 값들 : " + balls );
		}		
		
		lotto.sort(null);
		System.out.println("오늘의 번호들 ... " + lotto);
	}		
	// ArrayList의 중요메소드 : size(), add(), get(), remove()
}
	





