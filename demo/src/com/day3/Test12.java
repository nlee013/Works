package com.day3;

import java.util.Scanner;

//Scanner�� �ܶ� ���ڸ� �����ؼ� �����͸� �Է�.
//�⺻ �ܶ��� ����
public class Test12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, mat;
		
		//System.out.print("Name Korean English Mathematics?");
		System.out.print("Name,Korean,English,Mathematics?");
		
		// \\s�� ������ �ǹ�-> ����ȭ ǥ�����̶�� �θ�. *�� �������� �ǹ�
		
		//�⺻ �ܶ��� ������ �ǹ��ϴ� ���� ny 100 100 100 ó�� Scanner���� �ν��� �ڵ����� ������
		// �ٸ� ��ȣ�� ����Ϸ��� use Delimiter�� ����ؼ� �з��� ���ش�.
		
		// \\s�� ��������ν� �������� ��ĭ�� �з��� �����ϴٴ� �ǹ�.
		//\\s�� *�� ���̹Ƿ� ������ �������� ����� �� �ִٴ� �ǹ�.
		
		//�ٸ�, Scanner���� ���⸦ �νĸ��ϰ� null������ �ν��ؼ� ������ ������ �ν���.
		// "\\s*,\\s*"�� ,�ϳ��� �����̶�� �����ϸ� ��.
		
		//�Ʒ� �ڵ�� ���� ������� ������ �˰� �ֱ�.
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		System.out.println(name + ":" + "Total Score is " + (kor + eng + mat));
	}

}
