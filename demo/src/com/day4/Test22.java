package com.day4;

import java.io.IOException;
import java.util.Scanner;

//계산기 Version.2
public class Test22 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n1, n2;

		char oper; //operator

		System.out.print("Type first number: ");
		n1 = sc.nextInt();

		System.out.print("Type second number: ");
		n2 = sc.nextInt();

		System.out.print("Type one of operators [+,-,*,/]"); //아스키 값 43, 45, 42, 47
		oper = (char)System.in.read();

		switch(oper) {

		// printf에서 oper가 char문자이므로 %c로 표기함
		case '+': //character는 작은 따옴표 '문자'
			System.out.printf("%d%c%d=%d\n", n1, oper, n2, (n1 + n2)); break;

		case '-':
			System.out.printf("%d%c%d=%d\n", n1, oper, n2, (n1 - n2)); break;

		case '*':
			System.out.printf("%d%c%d=%d\n", n1, oper, n2, (n1 * n2)); break;

		case '/':
			System.out.printf("%d%c%d=%d\n", n1, oper, n2, (n1 / n2)); break;
		}

		//아래 코드로도 위와 같이 작성 가능.
		/*if(oper == '+') {
			System.out.printf("%d%c%d=%d\n", n1, oper, n2, (n1 + n2));
		}
		else if(oper == '-') {
			System.out.printf("%d%c%d=%d\n", n1, oper, n2, (n1 - n2));
		}
		else if(oper == '*') {
			System.out.printf("%d%c%d=%d\n", n1, oper, n2, (n1 * n2));
		}
		else if(oper =='/') {
			System.out.printf("%d%c%d=%d\n", n1, oper, n2, (n1 / n2));
		}*/
	}

}
