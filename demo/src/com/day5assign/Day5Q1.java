package com.day5assign;

//1. 5���� ������ �Է¹޾� �Է¹��� ���� ����ϰ� 
//�Է¹��� �� �� ���� ū���� �������� ���

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


