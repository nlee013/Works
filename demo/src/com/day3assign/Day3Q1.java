package com.day3assign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1.������ �Է� �޾Ƽ� ¦��, Ȧ���� �����ؼ� ���.
��) 3 �Է½� -> 3 => Ȧ��
��) 4 �Է½� -> 4 => ¦��
*/

public class Day3Q1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		String temp = "";
		
		System.out.print("Type a number: ");
		num = Integer.parseInt(br.readLine());

		temp = num%2==0? "Even number": "Odd number";
		
		/*if(num%2 == 0) {
			temp = "Even number";
		}
		else if(num%2 != 0) {
			temp = "Odd number";
		}*/
		
		System.out.println(temp);
	}
}