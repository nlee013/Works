package com.day5;

import java.util.Scanner;

public class Test26 {

	//10�� �̳��� �̸��� ������ �Է� ��,
	//������ ���� ������� ���� ��� ������(��������) ����ϱ�
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//name�� ������ ����� �� �� ���� �Ѵ� -> String[] name;
		String[] name; 
		int[] score;
		
		int i, j, num, temp1;
		String temp2; //��½� �Է°��� ���� �ٸ� ���� �����ϱ� ���� ��
		
		do {
			System.out.print("Type any number of members: ");
			num = sc.nextInt();
		}while(num < 1 || num > 10);
		
		//�迭�� �޸� �Ҵ��� �޾Ҵ� (��ü ����)
		name = new String[num];// <- String[] name = new String[num];
		score = new int[num];
		
		for(i = 0; i < num; i++) {
			System.out.print("Type your name: ");
			name[i] = sc.next();
				
			System.out.print("Type your score: ");
			score[i] = sc.nextInt();
			}
		
		//���� ����
		
		for(i = 0; i < score.length - 1; i++) {
			for(j = i + 1; j < score.length; j++ ) {
				if(score[i] < score[j]) {
					temp1 = score[i];
					score[i] = score[j];
					score[j] = temp1;
					
					temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
				}
			}
		}
		
		
		for(i = 0; i < num; i++) {
			System.out.printf("%6s %4d\n", name[i], score[i]);// &6s -> string
		}
	
		//System.out.println("Name: " + name + "Score: " + score);
		
		//new�� ���𰡸� ����� �� �ȿ� null���� �ʱⰪ���� ��?
		
		/*
		System.out.print("Type your name: ");
		name[0] = sc.next();
		
		System.out.print("Type your score: ");
		score[0] = sc.nextInt();

		System.out.print("Type your name: ");
		name[1] = sc.next();
		
		System.out.print("Type your score: ");
		score[1] = sc.nextInt();
		
		System.out.print("Type your name: ");
		name[2] = sc.next();
		
		System.out.print("Type your score: ");
		score[2] = sc.nextInt();
		*/
		//....���� �ڵ� �������� �ص� ������ �ݺ��Ǳ� ������
	
	}

}
