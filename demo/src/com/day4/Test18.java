package com.day4;

public class Test18 {

	public static void main(String[] args) {
		
		int n, sum; //같이 n, sum=0 할 경우 값이 누적됨.
		
		sum = 0; //쓰레기값이라고 인식하지 않기 위해 반드시 초기화값을 입력.
		
		for(n = 1; n <= 100; n++) {
			
			sum += n;
	
		}

		
		//홀수의 합
		sum = 0;
		
		for(n = 1; n <=100; n+=2) {
			sum += n;
		}
		System.out.println("Result of 홀수의 합: " + sum);


		//짝수의 합
		sum = 0;
		
		for(n = 0; n <= 100; n+=2) {
			sum += n;
		}
		System.out.println("Result of 짝수의 합: " + sum);
		
		sum = 0;
		
		for(n=0; n<=100; n+=3) {
			sum += n;
		}
		System.out.println("Result of 3배수의 합: " + sum);
	}

}
