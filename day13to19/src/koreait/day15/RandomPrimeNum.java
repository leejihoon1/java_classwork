package koreait.day15;

import java.util.Arrays;
import java.util.Random;

public class RandomPrimeNum {
	
	public static void main(String[] args) {
		// 주어진 난수 범위에서 소수가 7개 만듭니다. 소수 7개는 배열에 저장하여 출력합니다.
		// -> 주어진 정수 값이 소수인지 판별하는 메소드를 만들어 봅시다. 
		//(메소드 이름 isPrime, 리턴형식은 boolean, 인자는 정수 1개)

		Random r = new Random();
		int[]com = new int[7];
		int max = 999;
		int min = 100;
		int cnt =0;
		while(cnt<7) {
			int temp = r.nextInt(max-min+1)+min;
			if(isPrime(temp))
				com[cnt++]=temp;
		}
		
		System.out.println(Arrays.toString(com));
	}
	
	
	static boolean isPrime(int num) {
		boolean isPrime = true;
	
		for(int i=2; i<Math.sqrt(num);i++){
			if(num % i ==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}






