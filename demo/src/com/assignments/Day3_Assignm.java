package com.assignments;

//Scanner�� ����ϴ� ������ BufferedReader���� ���� ����ϰ� �����ϱ� ������ ���� ���.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
1.������ �Է� �޾Ƽ� ¦��, Ȧ���� �����ؼ� ���.
��) 3 �Է½� -> 3 => Ȧ��
��) 4 �Է½� -> 4 => ¦��
*/

public class Day3_Assignm {

	/*public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		String temp;
		
		System.out.print("Type numbers: ");
		num = Integer.parseInt(br.readLine());

		if(num%2 == 0) {
			temp = "even number";
		}
		else if(num%2 != 0) {
			temp = "odd number";
		}

	}*/
	
	//2.�� ���� ������ �Է� �ް�, ū ���ڿ� ���� ���ڸ� �����ؼ� ���.(if�� �̿�)
	//��) 20, 30 �Է½� -> ū ���� 30, ���� ���� 20
	
	/*
	    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, temp;
		
		System.out.print("Type numbers"); //20 30
		
		num1 = sc.nextInt(); //20
		num2 = sc.nextInt(); //30
		
		if(num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.printf("Result: %d %d", num1, num2);
	}
*/
	
	//3. �� ���� ������ �Է� �ް�, ���� ū ���ڿ� ���� ���� ���ڸ� �����ؼ� ���.(if�� �̿�)
	//��) 20, 30, 40, 50 �Է½� -> ���� ū ���� 50, ���� ���� ���� 20
	
	
	 	public static void main(String[] args) {
		
		
		int num1, num2, num3, num4,temp1, temp2; //20 30 40 50
		temp1 = 0;
		temp2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type four numbers");
		
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		if(num1 > num2) {
			
			temp1 = num1;
			temp2 = num2;
		}
		
		if(num1 < num2) {
			
			temp1 = num2;
			temp2 = num1;
		}
		
		if(temp1 < num3) {
			
			temp1 = num3;
		}
		
		if(temp2 > num3) {
			
			temp2 = num3;
		}
		
		if(temp1 < num4) {
			
			temp1 = num4;
		}
		
		if(temp2 > num4) {
			
			temp2 = num4;
		}
		
		System.out.printf("The biggest number : %d, The smallest number : %d\n", temp1, temp2);

	}
	
	
	//4. �⵵�� �Է¹ް�, �������� �ƴ����� ���.
	//��) 2010 �Է½� -> 2010 => ���
	//	  2012 �Է½� -> 2012 => ����
	
	/*
	    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		String str;
		
		System.out.println("Type the number of year :");
		
		num1 = sc.nextInt(); //2010
		
		str = (num1 % 4 == 0) && (num1 % 100 != 0) || (num1 % 400 ==0)? "����" : "���";

		System.out.println(num1 + ":" + str);

	}
	*/
	
//5.�ܰ� 15,800��¥�� ��ǰ�� ���� ���� �̻� ���Խ� ������ ���ݴϴ�.
//	�������� ������ �����ϴ�.
//	10�� �̻� -> 10%
//	20�� �̻� -> 15%
//	30�� �̻� -> 20%
//	�Ǹűݾ��� ����غ��ϴ�.
//	��) ���Լ��� 15���� ��� -> ���Լ���: 15��, �Ǹ��ѱݾ�: 213300��
	
	/*
	 	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 15800;
		int num;
		double res = 0;
	
		System.out.print("How many number of products did you purchase?");
		
		num = sc.nextInt();
		
		if(num >= 10) {
			
			res = a*0.9;
		}
		
		else if(num >= 20) {
			res = a*0.85;
		}
		else if(num >= 30) {
			res = a*0.8;
		}
		
		System.out.printf("Result : %g\n", res);

	}*/
	
//	6. �̸��� 3������ ������ �Է� �޾� �������ǿ� ���� ���
//	-��� ������ ������ 40�� �̻��̰� ����� 60�� �̻��̸� �հ�
//	-�Ѱ����̶� 40�� �̸��̰� ����� 60�� �̻��̸� ����
//	-����� 60�� �̸��̸� ���հ�
	
	/*public static void main(String[] args) {
		
		int chap1, chap2, chap3, av;
		String name, res;
		String fin = "";
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type your name");
		
		name = sc.next();

		System.out.print("Type your whole scores :");
		
		chap1 = sc.nextInt();
		chap2 = sc.nextInt();
		chap3 = sc.nextInt();
		
		av = (chap1 + chap2 + chap3)/3;
				
		if(av >= 60) {
			
			fin = "Pass";
		}
		else if(av < 60) {
			fin = "Fail";
		}
		
		if(chap1 < 40 || chap2 < 40 || chap3 < 40) {
			fin = "����";
		}
		System.out.println("\nName:" + name + "\nAverage :" + (chap1 + chap2 + chap3)/2 + "\nResult:" + fin);
		fin = sc.next();

	}*/
	
	
}
