package com.day3;

import java.util.Scanner;
public class Test11 {

	public static void main(String[] args) {
		
		//if���� ���� 3����. if, else, else if
		
		//new�� ������ �ǹ�.
		Scanner sc = new Scanner(System.in); //
		
		String name;
		int kor;
		
		System.out.println("What's your name? ");
		
		//next�� �������ٴ� �ǹ�. next�� string���� �������� name�� string���� �����߱⿡ �˸´� �ڵ���.
		name = sc.next();
		
		System.out.println("What's your Korean score? ");
		//nextInt�� Scanner�� ���� int�̹Ƿ�
		kor = sc.nextInt();
		
		String pan;
		
		if(kor >= 100) {
			pan = "A*";
		}
		else if(kor >=70) {
			pan = "A";
		}
		else if(kor >= 60) {
			pan = "B";
		}
		else if(kor >= 50) {
			pan = "C";
		}
		else if(kor >= 40) {
			pan = "D";
		}
		else {
			pan = "Fail";
		}

		System.out.println(name + ":" + pan);
	}

}
