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
		//����? 
		//���� = �غ� x ����/2
		
		//int width, height, area;
		double width, height, area;
		//float f;
		
		System.out.print("Width?:"); //10
		//width = Integer.parseInt(br.readLine());
		width = Double.parseDouble(br.readLine());
		
		System.out.print("Height?:"); //22
		//height = Integer.parseInt(br.readLine());
		height = Double.parseDouble(br.readLine());
		
		System.out.println("Area:" + width*height/2);
		area = Double.parseDouble(br.readLine());
		
		//f = Float.parseFloat(br.readLine());
		
		//���� �ڵ尡 �ٸ� ������δ� �Ʒ� �ڵ� ����.
		//area = width*height/2;<- int�϶� area = width*height/2.0; <- double
		//System.out.println("Area:" + area);

		System.out.printf("area: %g", area);
	}

}
