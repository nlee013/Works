package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10 {

	public static void main(String[] args) throws IOException{
		
		//���, �ݺ���
		//if, for, while, do~while, switch
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numb;
		//�Ʒ�ó�� ���� str�� �����Ⱚ�̶�� �ν��ؼ� ���� ������ �� null���� �־���ߵ�
		//String str;
		//�ʱ�ȭ �� -> null ��
		String str = ""; 
		
		System.out.print("Type numbers");
		numb = Integer.parseInt(br.readLine());
		
		/*
		//��ȣ ���� true �Ǵ� false���� ����
		if(numb%2 == 0) {
			str = "even number";	
		}
		
		//!= 0 �� == 1�� ������ != 0�� �ַ� ��
		if(numb%2 != 0) {
			str = "odd number";
		}
		
		//�� �ڵ��� ���� str�� �����Ⱚ�̶�� �ν��ؼ� ���� ������ �� null���� �־���ߵ�
		System.out.println(numb + ":" + str); 
		*/
		
		//�߰���{} ��� ����������, ������ �ϳ��� ���� �����ϴ�. �۾��� �������� ��� ������ �߰��� ���.
		if(numb%2 == 0) {
			str = "even number";
		}
		else {
			str = "odd number";
		}
		
		System.out.println(numb + ":" + str);
	}

}
