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
		//switch ��
		int com, user, cnt;
		int[] num = new int[3];
		char ans;
		
		Random rd = new Random();
		
		com = rd.nextInt(3) + 1;
		
		System.out.println(com);//com�� ������ ��
		
		String tmp = sc.nextLine(); 
		
		user = Integer.parseInt(tmp);

		
		while(true) {
			
			for(int i = 0; i < 3; i++) {
			
				System.out.print("���� ���� �� ����!\n����: 1:����, 2:����, 3:�� �� ���� �ϳ��� �ۼ�����");
				user = sc.nextInt();
			
				System.out.println("I" + com);
				
				switch(com) {
				
				case 1:
					System.out.println("1:����");
					
				case 2: 
					System.out.println("2:����");
					break;
					
				case 3: 
					System.out.println("3:��");
					break;
				}
				
				System.out.println("You" + user);
				
				switch(user) {
				
				case 1:
					System.out.println("1:����!");
					
				case 2: 
					System.out.println("2:����");
					break;
					
				case 3: 
					System.out.println("3:��");
					break;
				}
				
				if(user == com) {
					System.out.println("��ǻ�Ϳ� �����ϴ�.");
				}
				else if((user == 1 && com ==3)||(user==2 && com ==1)||(user == 3 &&com ==2)) {
					System.out.println("����� �̰���ϴ�");
				}
				else {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				}
				/*int j = 0;
					
				if((com == 1 && num[j] == 2) || com == 2 && num[j] == 3 || com == 3 && num[j] == 1) {//1 2 //1 3
						System.out.print("You Win!!\n");
						//break;
				}
				else if((com == 1 && num[j] == 3) || com == 2 && num[j] == 1 || com == 3 && num[j] == 2 ){
						System.out.print("You Lose!!\n");
						break;
				}*/
			}	
			
			System.out.print("Do you want to continue? [Y/N]");
			
			ans = (char)System.in.read();
			
			if(ans != 'Y' && ans != 'y') {
				System.out.println("The End!");
	        break;
			}
			
	}

  }
}
