package com.day3;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {

		//������ ���� �Է� �޾Ƽ� ���� ������ ū �� ������ ��� (��������)
		
		//1. 3���� ���� �Է� -> 9 5 2
		//2. ��� : 2 5 9
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, temp;
	
		System.out.print("Type three numbers: "); // 9 5 2
		
		//���
		num1 = sc.nextInt(); //9
		num2 = sc.nextInt(); //5
		num3 = sc.nextInt(); //2
		
		//else if ������ ó���ϸ� ù if���� ������ else if ���� ��µ��� �����Ƿ� if���� ���� ����.
		if(num1 > num2 && num1 > num3){
			
			temp = num1;//�ϴ� ������
			num1 = num3;
			num3 = temp;
		}
		
		/*		
 		if(num1 > num2){
			
			temp = num1;//�ϴ� ������
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
