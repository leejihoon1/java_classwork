package koreait.day10;

import java.util.Random;
import java.util.Scanner;

public class MyRedPenK { // 강사님 버젼
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r= new Random(); 
		int [] x1 = new int[10];  // 틀린문제 다시보기 (또는 풀기)를 위한 배열
		int [] x2 = new int[10];
		int [] no = new int[10];
		int n1, n2, ans;
		int cnt = 0 ;
		System.out.println("---------------------");
		System.out.println("빨간펜 수학 2자리 뎃셈 문제 풀기");
		System.out.println("---------------------");
		System.out.println("시작합니다.");
//		int i ;   for 지역변수로 사용될때에는 for에서 선언합니다. -> for문이 많을 대 변수명 고민이 줄어듭니다.
		for(int i=0; i<10;i++) {
			//for문의 지역변수로 선언해도 되는 변수는? n1, n2, ans
			n1 = r.nextInt(89)+11; // nextInt(max-min+1)+min;
			n2 = r.nextInt(89)+11;
			System.out.print("문제 "+(i+1)+". "+  n1 +"+ "+ n2+" =  답 입력 ->  ");
			ans = sc.nextInt();
//			if(ans == n1+n2) cnt++;
			if (ans != n1+n2) { // 틀린문제를 cnt++
				x1[cnt]=n1;
				x2[cnt]=n2;
				no[cnt]=i+1;
				cnt++;
			} // 틀린개수는 cnt, 맞은 갯수 10 - cnt -> 문제 총 10개 (cnt +10-cnt =10문제갯수)
		}
		System.out.println("---------------------");
//		System.out.println("채점 합니다. 맞은 갯수" + cnt + "(" +(cnt*10)+"점)");
		System.out.println("채점 합니다. 맞은 갯수" + (10-cnt) + "(" +((10-cnt)*10)+"점)");
		//틀린문제에 대해 번호, 문제, 정답 보여주기입니다.
		System.out.println(":::::틀린문제 다시보기::::");
		for(int i=0;i<cnt;i++) 
			System.out.println("문제"+no[i]+". " +x1[i] +"+ "+ x2[i]+ "= " + (x1[i]+x2[i]));
		
	}
} // 발전방향 : x1, x2, no 배열 -> 2차원 배열(단순히 값만 저장), 클래스(값 저장 + 메소드)의 배열1개 










