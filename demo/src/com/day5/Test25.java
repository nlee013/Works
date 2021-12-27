package com.day5;

import java.util.Scanner;

//selection sort ���� ���
//���ϴ� ����� 1��°�� ������  num[0]�� num[1]�� ���ϱ� ����

public class Test25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type any five numbers: ");
		
		int [] num = new int[5];
		
		int i,j,temp;
		
		for(i = 0; i < num.length; i ++) {
			num[i] = sc.nextInt();
		}
		
		System.out.print("Source Data: ");
		for(i = 0; i < num.length; i++) {
			System.out.printf("%4d",num[i]);
		}
		System.out.println();
		
		//selection sort�� ����. ��������� ���� ����.�� �ܿ��
		
		for(i = 0; i < num.length-1; i ++) {
			
			for(j = i + 1; j <num.length; j++) {
				//System.out.println(i + ":" + j);
				
				if(num[i] > num[j]) {
					
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		
		//Ȯ�� for ��. �迭 �� ���� ���.
		System.out.print("Sorted Data: ");
		for(int k : num) {//�迭�� �ڷ����� int. DB ���� ���� ���
			System.out.printf("%4d",k);
		}
		System.out.println();
	}

}

