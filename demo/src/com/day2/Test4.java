package com.day2;

import java.io.BufferedReader; // c����  include�� ����
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		//ctrl + space�ϸ� �ڵ����� ���� import��
		
		/*
		 * System.in = Ű����� �Է��� 1byte�� ����
		 * (���ĺ� �ѱ���, Ư����ȣ, ���� �� �ڸ��� �ǹ�)
		 * �ѱ��� 2byte
		 * 
		 * InputStreamReader = System.in�� ���� 1byte�� ����(2byte)�� ����
		 * BufferedReader = �޸𸮻� ���� ���� ������.
		 * �� ���� ������ �̸��� br�� ������(�Ʒ� �ڵ� ����)
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r;
		//double r;
	
		double area, length;
		
		System.out.println("Radius?");//radius = 10
		
		r = Integer.parseInt(br.readLine());
		//r = Double.parseDouble(br.readLine());
		//Integer(4 byte) < Double(8 byte)�̹Ƿ� Double�� Integer�� ���԰����ϹǷ� error�� �ȳ�
		
		area = r*r*3.14;
		
		
		length = r*3*3.14;
		
		System.out.println("radius:" + r);
		System.out.println("area:"+ area);
		System.out.println("length:" + length);
		
	}

}

