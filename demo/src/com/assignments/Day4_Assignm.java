package com.assignments;

import java.util.Scanner;

public class Day4_Assignm {
	
	/*1. 1에서 100까지 수의 홀수의 합, 짝수의 합, 전체의 합
	짝수합 : 2550
	홀수합 : 2500
	합 : 5050*/
	
	/*public static void main(String[] args) {
		
		int n,sum1,sum2;
		
		sum1 = 0;
		
		for(n = 1; n <=100; n+=2) {
			sum1 += n;
		}
		
		System.out.println("Result of 홀수의 합: " + sum1);
		
		sum2 = 0;
		
		for(n = 2; n <=100; n+=2) {
			sum2 += n;
		}
		System.out.println("Result of 짝수의 합: " + sum2);
		System.out.println("Result of 총합: " + (sum1 + sum2));
		
	}*/
	
	/*2. 1에서 100까지의 수중 3의 배수의 갯수
	3의 배수의 개수 : 33*/
	
	/*public static void main(String[] args) {
		
		
		int n, t = 0; //n = number, t= * times
		char ans;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			do {
				System.out.print("Which number do you want?");//100
				
				n = sc.nextInt();
				
			  }while(n < 1 || n > 100);
			
			  t = 0;
		
			  for(int i = 1; i < 3; i++) {
				
			  t += i;
			  
			}
		}
	 }*/

	/*3. 두수를 입력받아 적은 수에서 큰수까지의 합
	1~100 까지의 합 : 5050*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[2]; //10 100
		
		System.out.print("Type two numbers: "); //10 100
		
		for(int i = 0; i< num.length; i++) { 
			num[i] = sc.nextInt();
		
		
		/*int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type two numbers: ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		
		for(int i = 0; i< num1.length; i++) { 
			
			num[i] = sc.nextInt();
		}
		
		for(int i = 0; i< num.length; i++) { 
			
			System.out.println("num["+ i +"]:" + num[i]);
		}*/
	   }
	
	  }
	 }
	


