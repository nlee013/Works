package com.assignments;

import java.util.Scanner;

public class Day5assign {
	
	public static void main(String[] args) {

		//�޷��� �������� ��������� ��, ��, �� ���� �޾Ƽ� �����
		//2021�� 12�� 27���� ������ �� ���.
		//�Է°����� ��°��� ���ϱ��� ������ �����
		Scanner sc = new Scanner(System.in);

		int[] dates = {'��', 'ȭ', '��', '��', '��', '��', '��'};

		int y, m, date, day;
		
		do {
			System.out.println("Type any year:");
			y = sc.nextInt();
		}while(y < 1);
		
		do {
			System.out.print("Type any month: ");
			m = sc.nextInt();
		}while(m < 1 || m > 12);
		
		do {
			System.out.println("Type any date: ");
			date = sc.nextInt();
		}while(date< 1 || date > 31);
		
		
		for(int i = 0; i < date-1; i++) {
			day = sc.nextInt();
			day += i;
		}
		
		//day = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		for(int i = 0; i < dates[date-1]; i++) {
			System.out.printf("%d", i);
		}
		date = 1;
		
		if(date%7 == 0) {
			day = sc.nextInt();
		}
	
		//System.out.println(day +"day");
	}

}
