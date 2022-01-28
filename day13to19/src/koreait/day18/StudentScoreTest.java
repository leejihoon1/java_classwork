package koreait.day18;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class StudentScoreTest {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		StudentScore[] stus = new StudentScore[10];
		Random r= new Random();
		int max = 100, min=10; // 각 과목 점수의 난수 발생 범위 입니다.
		
		
		System.out.println("입력된 학생 인원수(1~10 )만큼 성적 데이터가 난수로 발생 됩니다.");
		System.out.print("학생 인원 수를 입력해 주세요 -> ");
		int num = Integer.parseInt(sc.nextLine());
		// 2) 실행에 필요한 입력 명령문을 작성하세요
		
		for(int i=0;i<num;i++) {
		stus[i]= new StudentScore(i+1, r.nextInt(max-min+1)+min, r.nextInt(max-min+1)+min, r.nextInt(max-min+1)+min);
		System.out.println("국어,영어,과학 점수가 자동으로 입력되었습니다.학생이름을 입력해 주세요.");
		System.out.print("이름 -> ");
		stus[i].setName(sc.nextLine());
		
		
		}
		System.out.println(":::::저장된 성적데이터를 확인하세요.:::::");
		DecimalFormat df = new DecimalFormat("###.00");
		for(StudentScore score : stus) {
			if(score==null)break;
			System.out.println(score);
			System.out.println("  -총점 : " + score.sum() + " 평균 : " + df.format(score.avg()));
		}
		
		System.out.println("::::::총점 기준 최우수 학생 이름과 점수 입니다. ::::::");
		int max_sum = stus[0].sum();
		// 문제5) 최우수 학생을 찾기 위한 반복명령문을 작성하세요. 변수는 아래 출력문을 참고하여 선언하세요.
		int max_idx = 0;
		for(int i=0;i<num;i++) {
			if(max_sum < stus[i].sum()) {
				max_sum = stus[i].sum();
				max_idx=i;
			}
		}

		System.out.println("최우수 학생 : " + stus[max_idx].getName() + 
				"(총점 : " + stus[max_idx].sum() + 
				", 평균 : " + df.format(stus[max_idx].avg())+ ")");
		
		
//		
//		int sel;
//		sel = Integer.parseInt(sc.nextLine());
//		지금부터는 정수값 입력 이렇게하세요.
//		nextInt()의 엔터문제가 해결됩니다.
		
	}
}
