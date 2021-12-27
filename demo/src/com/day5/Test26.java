package com.day5;

import java.util.Scanner;

public class Test26 {

	//10명 이내의 이름과 점수를 입력 시,
	//정수가 높은 사람에서 낮은 사람 순으로(내림차순) 출력하기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//name의 갯수가 몇개일지 모를 때 선언만 한다 -> String[] name;
		String[] name; 
		int[] score;
		
		int i, j, num, temp1;
		String temp2; //출력시 입력값이 서로 다를 것을 방지하기 위해 씀
		
		do {
			System.out.print("Type any number of members: ");
			num = sc.nextInt();
		}while(num < 1 || num > 10);
		
		//배열이 메모리 할당을 받았다 (객체 생성)
		name = new String[num];// <- String[] name = new String[num];
		score = new int[num];
		
		for(i = 0; i < num; i++) {
			System.out.print("Type your name: ");
			name[i] = sc.next();
				
			System.out.print("Type your score: ");
			score[i] = sc.nextInt();
			}
		
		//총점 정렬
		
		for(i = 0; i < score.length - 1; i++) {
			for(j = i + 1; j < score.length; j++ ) {
				if(score[i] < score[j]) {
					temp1 = score[i];
					score[i] = score[j];
					score[j] = temp1;
					
					temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
				}
			}
		}
		
		
		for(i = 0; i < num; i++) {
			System.out.printf("%6s %4d\n", name[i], score[i]);// &6s -> string
		}
	
		//System.out.println("Name: " + name + "Score: " + score);
		
		//new로 무언가를 만들면 그 안에 null값이 초기값으로 들어감?
		
		/*
		System.out.print("Type your name: ");
		name[0] = sc.next();
		
		System.out.print("Type your score: ");
		score[0] = sc.nextInt();

		System.out.print("Type your name: ");
		name[1] = sc.next();
		
		System.out.print("Type your score: ");
		score[1] = sc.nextInt();
		
		System.out.print("Type your name: ");
		name[2] = sc.next();
		
		System.out.print("Type your score: ");
		score[2] = sc.nextInt();
		*/
		//....위의 코드 형식으로 해도 되지만 반복되기 때문에
	
	}

}

