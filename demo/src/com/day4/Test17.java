package com.day4;

import java.io.IOException;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

//����ڰ� �Է��� �������� �հ踦 ���ϱ�


public class Test17 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int num, sum = 0;
		//String ans;
		char ans;
		
		//������. ��� ����Ǵ� ���� ���� ������ ǥ��. �ε�ȣ�� true/false�� �ν�������, true�� �ϸ� ���ѷ�����.
		
		while(true) {//���� ����. append �żҵ嵵 ���߿� ����.
			
			do{
				System.out.print("Which number do you want?");//100
				
				num = sc.nextInt();
				
			  }while(num < 1 || num > 5000); //������ �� �� �ڿ� false���� ������ ���� ������ ���� �ٿ��༭ �ڵ带 ¥��.
			
			sum = 0;//�׻� �ʱⰪ�� ������ ������ ���� ������ �ʰ� ����� ���� ������ �ڵ�¥��.
			
			for(int i = 1; i <= num; i++) {
				
				sum += i;//sum = sum + i;(<- ������ �����Ǵ� �ڵ���)�� ���� �ڵ�
			}
			
			System.out.println("1~" + num + "������ sum: " + sum);
			System.out.print("Do you want to continue?: "); //Y, y, N, n
			
			ans = (char)System.in.read();
			
			//������ �� �ʴ� ������ �� &&�� ���. EX) ans != 'Y' || ans = 'y' �� �� �ϳ��� ���� ������ ���� ||(or)�� ���.
			if(ans != 'Y' && ans != 'y') { 
				
				System.out.println("Shut down the programme");
				//while, for, do~while, switch��(<-��� break �ʼ�)�� ��밡��. �ݺ����� ������ �� �����.
				break;
			}
		}
		//sc.close();//������ ����ߵ����� ���ص� ������. ���� �� ����� ���� �� ����ؾߵ�.���⼱ ���ʿ���
	}

}
