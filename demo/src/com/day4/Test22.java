package com.day4;

import java.io.IOException;
import java.util.Scanner;

//���� Version.2
public class Test22 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n1, n2;

		char oper; //operator

		System.out.print("Type first number: ");
		n1 = sc.nextInt();

		System.out.print("Type second number: ");
		n2 = sc.nextInt();

		System.out.print("Type one of operators [+,-,*,/]"); //�ƽ�Ű �� 43, 45, 42, 47
		oper = (char)System.in.read();

		switch(oper) {

		// printf���� oper�� char�����̹Ƿ� %c�� ǥ����
		case '+': //character�� ���� ����ǥ '����'
			System.out.printf("%d%c%d=%d\n", n1, oper, n2, (n1 + n2)); break;

		case '-':
			System.out.printf("%d%c%d=%d\n", n1, oper, n2, (n1 - n2)); break;

		case '*':
			System.out.printf("%d%c%d=%d\n", n1, oper, n2, (n1 * n2)); break;

		case '/':
			System.out.printf("%d%c%d=%d\n", n1, oper, n2, (n1 / n2)); break;
		}

		//�Ʒ� �ڵ�ε� ���� ���� �ۼ� ����.
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
