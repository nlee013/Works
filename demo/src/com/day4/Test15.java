package com.day4;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {

		int num1, num2, num3, num4,temp1; //20 30 40 50
		temp1 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type four numbers");
		
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		if(num1 > num2) {
			
			temp1 = num1;
			num1 = num2;
		}
		
		if(num1 < num2) {
			
			temp1 = num2;
			num2 = num1;
		}
//		
//		if(temp1 < num3) {
//			
//			temp1 = num3;
//		}
//		
//		if(temp2 > num3) {
//			
//			temp2 = num3;
//		}
//		
//		if(temp1 < num4) {
//			
//			temp1 = num4;
//		}
//		
//		if(temp2 > num4) {
//			
//			temp2 = num4;
//		}
		
		System.out.printf("The biggest number : %d, The smallest number : %d\n", temp1, num1);

		
	}

}
