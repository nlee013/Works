package com.day4;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {

		//�ݺ���(for, while, do~while)
		
		Scanner sc = new Scanner(System.in);
		
		int unit;
		
		System.out.print("Type unit: "); //7
		unit = sc.nextInt();
		
		//���� ���� ��밡���� �ݺ����� if�̸�, �ʱⰪ�� ��������ߵ�.
		
		for(int i = 1; i <= 9; i++){ //�迭�� �� 1=0;�ϸ� i<9;�� �ε�ȣ�� =�� ����.
			
			System.out.println(unit + "*" + i + "=" + (unit*i));
		}
		
		//�������� �ݺ��ؼ� �����ϴ� �ݺ���
//		System.out.println(unit + "*" + 1 + "=" + (unit)*1);
//		System.out.println(unit + "*" + 2 + "=" + (unit)*2);
//		System.out.println(unit + "*" + 3 + "=" + (unit)*3);
//		System.out.println(unit + "*" + 4 + "=" + (unit)*4);
		
		System.out.println("-----------------------");
		
		int j = 1; //�ʿ��� ���ڰ��� ���ؼ� �ʱⰪ�� ��������. �׸��� ���� while���� j=1���� �����Ѵ�.(���߿� ���� �迭���� ������)
		
		while(j <= 9) {
			
			System.out.println(unit + "*" + j + "=" + (unit*j));
			j++;
		}
		
		System.out.println("-----------------------");
		
		int k = 0; //������ 1���� ����. do~while���� ex) ����ڿ��� ���� ������ �䱸 ��, ���� ������ ����/ �Ҹ����� �ҽ���.
		
		do {
			
			k++;
			System.out.println(unit + "*" + k + "=" + (unit*k));
			
		}while(k < 9);

		
	}

}
