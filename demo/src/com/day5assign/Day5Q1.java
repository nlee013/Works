package com.day5assign;

//1. 5개의 정수를 입력받아 입력받은 수를 출력하고 
//입력받은 수 중 가장 큰수와 적은수를 출력

import java.util.Scanner;

public class Day5Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int i, j, temp;
		
		System.out.print("Type any five numbers: ");
		
		for(i = 0; i < num.length; i++) {
			
			num[i] = sc.nextInt(); 
		}
		
		for(i = 0; i < num.length-1; i++) {
				
				for(j = i + 1; j < num.length; j++) {
					
					if(num[i] > num[j]) {
						
						temp = num[i];
						num[i] = num[j];
						num[j] = temp;
						
						/*num[i] = num[i] ^ num[j];
						num[j] = num[i] ^ num[j];
						num[i] = num[i] ^ num[j];*/
					}
				}
		}
		j = 0;
		System.out.printf("The biggest number is: %d, The smallest number is: %d", num[i], num[j]);

	  }
		

  }


