package com.day3;

import java.io.IOException;

public class Test9 {

	public static void main(String[] args) throws IOException {
		
		//�ڷ��� char -> character.  char�� class�̸�, ��ȣ�� ������.
		
		//string str = "I"; --> ""�� string������ ����. ���� ���ڸ� ǥ���� ���� ���.
		
//		char ch = 'n'; // ����  1byte �Ǵ� 2byt �� �ڸ� ����
//		
//		System.out.println(ch);
		
		char ch, result;
		
		System.out.print("Only one character?");// a(97) -> 1byte -> System.in�� read�� ���� �ƽ�Ű���� �о �� ����
		
		// System.in.read();�� read�� int�� �ҷ����� ������ int�� ǥ���ؾߵ�. 
		//char�� ��ȣ ���������� int�� ���� �� ��ȯ.
		//���� ó�� ����  -> throws IOException
		
		ch = (char) System.in.read(); //97 return ������ int�� �־�ߵǾ char�� ��.
		
		System.out.println(ch);
		System.out.println(Integer.toString(ch)); //���� -> ����(97)�� ��ȯ
		
		//ch>='a' -> ch>=97�� ���� ǥ�� ����.
		//?�� ����� = ���س��� ���� ��ȣ
		result = (ch >=65) && (ch <=90)? (char)(ch+32) : (ch >= 'a') && (ch <= 'z')? (char)(ch-32):ch;
		
	}

}

// Ascii �ƽ�Ű �� (Signal ��ȣ) + ���(�ѱ�,���Ͼ� ���) -> Uni code
// �빮�� + 32 = �ҹ��� EX) A (65) + 32 = a (97)
//LF = Line left, CF = carriage return -> 13 -> Enter key


