package com.day4;

public class Test18 {

	public static void main(String[] args) {
		
		int n, sum; //���� n, sum=0 �� ��� ���� ������.
		
		sum = 0; //�����Ⱚ�̶�� �ν����� �ʱ� ���� �ݵ�� �ʱ�ȭ���� �Է�.
		
		for(n = 1; n <= 100; n++) {
			
			sum += n;
		}
		System.out.println("Result of 100������ ��: " + sum);

		//Ȧ���� ��
		sum = 0;
		
		for(n = 1; n <=100; n+=2) {
			sum += n;
		}
		System.out.println("Result of Ȧ���� ��: " + sum);


		//¦���� ��
		sum = 0;
		
		for(n = 0; n <= 100; n+=2) {
			sum += n;
		}
		System.out.println("Result of ¦���� ��: " + sum);
		
		sum = 0;
		
		for(n=0; n<=100; n+=3) {
			sum += n;
		}
		System.out.println("Result of 3����� ��: " + sum);
	}

}
