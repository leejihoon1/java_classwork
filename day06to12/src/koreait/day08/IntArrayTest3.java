package koreait.day08;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest3 {
	// int값 저장하는 배열을 활용하는 연습입니다. ( 2 )
	public static void main(String[] args) {
		// 배열의 크기는20 - > 메모리 할당
		int[] scores = new int[20];

		// 배열의 값은 난수 1 ~ 100 범위 값 저장
		Random r1 = new Random(System.currentTimeMillis()); //난수 발생에 필요한 시드값 설정
		for (int i = 0; i < scores.length; i++) {
			scores[i] = r1.nextInt(100) + 1;
		}

		System.out.println(Arrays.toString(scores)); // 베열 값을 출력합니다.
		// 값의 분포 개수를 90~100, 80~89, 70~79,70 비만 범위로 출력합니다.

		int cntA = 0; // 90 ~ 100
		int cntB = 0; // 80 ~ 89
		int cntC = 0; // 70 ~ 79
		int cntD = 0; // 70미만

		// 20개의 배열의 값 중에서 70 이상의 값을 검색 - 인덱스 와 값을 출력
		for (int i = 0; i < scores.length; i++) {
			// scores[0],scores[1],scores[2],...scores[19]
			if (scores[i] >= 90 && scores[i] <= 100) {
				cntA++;
			}else if
				(scores[i] >= 80 && scores[i] <= 89) {
				cntB++;
			}else if 
				(scores[i] >= 70 && scores[i] <= 79) {
					cntC++;
			}else  if
				(scores[i] < 70 && scores[i] >= 0) {
				cntD++;
				}
			}
		// 70이상인 값의 개수를 출력하려면??
		System.out.println("점수 분포 요약 -----------");
		System.out.println("90 ~ 100 : " + cntA);
		System.out.println("80 ~ 89  : " + cntB);
		System.out.println("70 ~ 79  : " + cntC);
		System.out.println("70미만  : " + cntD);
	}
}
