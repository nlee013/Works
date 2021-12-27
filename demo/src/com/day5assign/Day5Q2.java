package com.day5assign;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

// 2. 1~10사이의 난수를 발생시켜 발생시킨 난수를 3번안에 알아 맞추는 게임
//(3번안에 알아맞추지 못하면 발생된 난수를 출력)
public class Day5Q2 {

	public static void main(String[] args) throws IOException {

		int[] num = new int[10];
		int com, user, cnt;
		char ans;
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		com = rd.nextInt(10) + 1;
			
		System.out.println(com);//com이 생각한 값
		
		while(true) {
			
			for(int i = 0; i < 3; i++) {
				System.out.print("Guess what is this number!: ");
				num[i] = sc.nextInt();
				
				if(com == num[i]) {
					System.out.print("Correct!!\n");
					break;
				}
				else {
					System.out.print("Wrong!!\n");
				}
			}
			
			System.out.printf("The answer is: %d", com);
			System.out.println("Do you want to continue? [Y/N]");
			
			ans = (char) System.in.read();
			
			if(ans != 'Y' && ans !='y') {
				System.out.println("The End!");
				break;
			}
		}
		
		
		/*while(true) {
			
			cnt = 0;
			
			while(cnt < 3) {
				
				do {
					
					System.out.print("Guess what number it is! ");
					user = sc.nextInt();
					
					if(com == user) {
						System.out.print("Correct!!\n");
						//break;
					}
					else {
						System.out.print("Wrong!!\n");
						break;
					}
					
					}while(user < 1 || user >10);
				
				cnt++;
				break;
			}
			
			System.out.print("The answer is: " + com + "\n");
			
			System.out.print("Do you want to continue? [Y/N]");
			
			ans = (char)System.in.read();
			
			if(ans != 'Y' && ans != 'y') {
			System.out.println("The End!");
	        break;
			}
		}*/
	}

}
