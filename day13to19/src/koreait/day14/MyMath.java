package koreait.day14;

public class MyMath {
	//배열에서 최대값, 최소값 , 합계, 평균을 구하는 메소드를 만들었습니다.
	//->메소드 오버로딩으로 다른 형식의 데이터들을 처리하도록 메소드를 정의해봅시다.
	
	static int arrayMaxValue(int[] array) { // 인자의 변수선언은 전달될 데이터 타입을 지정
		int max;				//max초기값 : 1)배열 인덱스 0번값 		2)비교될 다른값들보다 작은값
		// 비교범위 : 1)배열 인덱스 1 ~마지막인덱스		2)비교될 다른값들보다 작은값 
		max = array[0]; 	//1)으로 구현
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) 	//최대값은 다른 값들 보다 큰 값이 되어야하므로, 그렇지 않을 경우
				max = array[i]; 	// max의 그 갓을 그 값으로 변경합니다.
		}		
		return max; // 최대값
	}

	static double arrayMaxValue(double[]array) {
		double max;
		max = array[0];
		for(int i=0; i<array.length;i++) {
			if(array[i]>max)max=array[i];
		}
		return max;
	}
	
	static int arrayMinValue(int[]array) {
		int min;		
		min = 999;		
		for(int i =0;i < array.length;i++) {
			if(array[i] < min)    	
				min = array[i];			
		}
		return min; // 최소값
	}
	
	// 합계를 구하는 메소드
	
	static int arraySumValue(int[]array) {
		int sum = 0;
		for(int i =0; i<array.length;i++) {
			sum += array[i]; // 배열 인덱스 0 ~ 마지막까지 순차적으로 sum변수에 (누적)됩니다.
		}
		return sum;
	}
	
	//평균을 구하는 메소드 : 평균을 실수 형식입니다.
	static double arrayAvgValue(int[]array) {
		int sum = 0;
		for(int i = 0; i <array.length;i++) {
			sum += array[i];
		}
//		sum = arraySumValue(array); //위의 메소드 호출하는 방법도 있습니다.
		return (double)sum/array.length;
	}
	
	static double arrayAvgValue(double[]array) {
		double sum =0;
		for(int i = 0; i <array.length;i++) {
			sum += array[i];
		}
		return sum/array.length;
	}
	
}
