package com.day3;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {

		//세개의 수를 입력 받아서 작은 수에서 큰 수 순으로 출력 (오름차순)
		
		//1. 3개의 수를 입력 -> 9 5 2
		//2. 결과 : 2 5 9
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, temp;
	
		System.out.print("Type three numbers: "); // 9 5 2
		
		//출력
		num1 = sc.nextInt(); //9
		num2 = sc.nextInt(); //5
		num3 = sc.nextInt(); //2
		
		//else if 문으로 처리하면 첫 if문을 충족시 else if 문은 출력되지 않으므로 if문을 따로 쓴다.
		if(num1 > num2 && num1 > num3){
			
			temp = num1;//일단 빼내기
			num1 = num3;
			num3 = temp;
		}
		
		/*		
 		if(num1 > num2){
			
			temp = num1;//일단 빼내기
			num1 = num2;
			num2 = temp;
		}
		if(num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		if(num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
	 	*/
		
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
		
		System.out.printf("Result : %d %d %d\n", num1, num2, num3);
	}

}
