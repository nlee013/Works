package com.day5assign;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//3. 1~3������ ������ �߻����� ����,����,�� ���� ���α׷� �ۼ�
//1:����, 2:����, 3:��

public class Day5Q3 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		//System.out.print("1:����, 2:����, 3:��");
		
		int com, user, cnt;
		int[] num = new int[3];
		char ans;
		
		Random rd = new Random();
		
		com = rd.nextInt(3) + 1;
		
		System.out.println(com);//com�� ������ ��
		
		while(true) {
			
			cnt = 0;
			
			while(cnt < 3) {
				
				do {
					
					System.out.print("1:����, 2:����, 3:��");
					user = sc.nextInt();
					
					if((com == 1 && user == 2) || com == 2 && user == 3 || com == 3 && user == 1) {//1 2 //1 3
						System.out.print("You Win!!\n");
						//break;
					}
					else if((com == 1 && user == 3) || com == 2 && user == 1 || com == 3 && user == 2 ){
						System.out.print("You Lose!!\n");
						break;
					}
					
					}while(user < 1 || user >3);
				
				cnt++;
				break;
			}
			
			System.out.print("The answer is: " + com + "\n");
			
			System.out.print("Do you want to continue? [Y/N]");
			
			ans = (char)System.in.read();
			
			if(ans == 'Y' && ans == 'y') {
	        break;
	        
			}else{
				System.out.print("The End!");
				break;
			}
	}

  }
}