package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�غ� width ���� height�� �Է¹޾� �ﰢ�� ���� area ���ϱ�
		//�غ�? 17
		//����? 22
		//���� ? 
		//���� = �غ� x ����/2
		
		int width, height, area;
		
		System.out.print("Width?:"); //10
		width = Integer.parseInt(br.readLine());
		
		System.out.print("Height?:"); //22
		height = Integer.parseInt(br.readLine());
		
		System.out.println("Area:" + width*height/2);
		
	}

}
