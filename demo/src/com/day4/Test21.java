package com.day4;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("1~3 �̳��� ��?");

		num = sc.nextInt(); //����ڰ� ����ϴ� ������ �⺻ default ��.

		switch(num) { //switch case��

		case 3:
			System.out.println("***"); break;

		case 2:
			System.out.println("**"); break;

		case 1:
			System.out.println("*"); break;

		default:
			System.out.println("�����Է� ����!!");

		}

	}

}
