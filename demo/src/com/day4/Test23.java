package com.day4;

import java.util.Scanner;

//ctrl + i -> �ڵ� �ڵ� ���� ���� Ű

public class Test23 {

	public static void main(String[] args) {
		
		//��� �������� �迭�� �ִ�.
		//int num[] = new int[5];
		
		int[] num = new int[5]; //<-�⺻ �����̹Ƿ� �̰� ���� �Ẹ��.
		//���� ���� �̸��� �ٲٰ� ������ �տ� int->string/float/double�� �ٲ� �ۼ�����������, ���� ����ϸ� �����ϱ� ����.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ټ����� ����? "); //5 7 9 3 2
		
		for(int i = 0; i< num.length; i++) { //num.length�� int[5]�� �޴´�. 0~4���� 5�� ����
			num[i] = sc.nextInt();

		}
		
		//�Ʒ��ڵ�� �ƹ� ���ڸ� �Է��ص� ��µǰ� �ڵ� «
		/*num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		num[3] = sc.nextInt();
		num[4] = sc.nextInt();*/
		
		//������ ������
		/*num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;*/

		for(int i = 0; i< num.length; i++) { //�迭�� ����� �� <=�� �� ������. 
			
		// �Ʒ��ڵ尰�� ��� <=���� 'Runtime Error'�� �Ҹ�. Logic �����̹Ƿ� �ڵ� �����ϸ� ��.
			
			System.out.println("num["+ i +"]:" + num[i]);
			
		/*System.out.println("num[0]" + num[0]);
		System.out.println("num[1]" + num[1]);
		System.out.println("num[2]" + num[2]);
		System.out.println("num[3]" + num[3]);
		System.out.println("num[4]" + num[4]);*/
		
		}
		
		//�迭�� length�� ��ȣ()�� ����
		System.out.println("�迭 ����: " + num.length); //-> length�� �� �ڵ��� int[5]-> 5���� �����´�. 
		
		num[3] = 100;//[0][1][2][3]->[3]�� 100���� ��.
		System.out.println("num[3]: " + num[3]);
		
		int a = num[3] - 30;
		System.out.println("a: " + a);
		
	}

}
