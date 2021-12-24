package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test8 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2;
		
		System.out.print("What is the first number?:");//25
		num1 = Integer.parseInt(br.readLine()); //readline�� string Ÿ���̿��� Integer�� �̿���
		
		System.out.println("What is the second number?:");//27
		num2 = Integer.parseInt(br.readLine());
		
		//\t = tab�� �ǹ�.-> tab ������ ���� ����.
		//�������� ���� ���� ��.
		System.out.printf("%d + %d = %d\t", num1, num2, (num1 + num2)); //�������� ���� ���� ��.
		System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
		System.out.printf("%d * %d = %d\t", num1, num2, (num1 * num2));
		System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2)); //���� ���� ���� ����.
		System.out.printf("%d %% %d = %d\n", num1, num2, (num1 % num2)); //������ ���� ����.
		//printf�� ��ȣ���̸�, %�� ��ǻ�Ͱ� �����ϱ⿡ %% �ι� ���δ�.
		
		System.out.println();
		
		System.out.println("Do you think 'First number' is bigger than 'Second number'?:" + (num1 > num2));
		// �ݵ�� ���η� �����ؼ� �������� ����.
		System.out.println("Do you think 'First number' is same as 'Second number'?:" + (num1 == num2));
		//���� false �Ǵ� true�� ����.
		
		
		String str;
		
		//if ��ſ� ª�� �� �� �־ �� �ڵ��� ����.
		//���� ������ (����?   true��   :  false ��)-> 3���� ������ �̷�����ֱ� ����.
		str = num1 % 2 == 0? "even number": "odd number";
		
		str = num1 > 0? "positive number" : (num1<0? "negative number" : "zero");
		
		System.out.println(num1 + ":" + str);
		
		//A (and)&& B -> A�� B �Ѵ� true. -> �Ѵ� true������ ������� true.
		//A  (or)|| B -> A�� true/B�� true/ �Ѵ� true ->�� ���� true �̸� ��� ���� true.
		//DB������ ||�� �����Ͱ� ����.
		str = (num1 % 4 == 0) && (num1 % 100 != 0) || (num1 % 400 ==0)? "����" : "���";
		
		System.out.println(num1 + ":" + str);
	}

}
