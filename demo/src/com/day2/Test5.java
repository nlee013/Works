package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//console�� �о�ö��� in���. ����� ���� out
		
		// String -> �ڷ���ó�� ���̴� Class
		String name;
		int kor, eng, tot;
		
		//�Է�
		System.out.print("What's your name?"); //Nayoung
		
		name = br.readLine();
		
		System.out.print("What's your Korean score?");//67
		kor = Integer.parseInt(br.readLine());
		
		System.out.println("What's your English? score?");//99
		eng = Integer.parseInt(br.readLine());
		
		//caculation
		tot = kor + eng;
		
		System.out.println("Name:" + name);
		System.out.println("\nKorean:" + kor + "\nEnglish:" + eng);
		System.out.println("\nTotal Score:" + tot);
		
		
		
	}

}
