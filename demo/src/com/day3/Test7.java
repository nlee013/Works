package com.day3;

public class Test7 {

	//void = ��ȯ�� ����. main�� �⺻ default.
	
	//System.out.print -> out�� printStream�� out�� �����ͼ� ������� ���°���.
	
	public static void main(String[] args) {

		float f = 0; //�ʱ�ȭ. �����δ� 0.0.�� �� �ִ� ����
		double d = 0; //0.0
		
		//�Ϲ������� i, j, k �� �����
		//<= ũ�ų� ���ų��� �ǹ�.

		//for ���۰�; �ִ밪; ������; i++ = i+1 �� �ǹ�.
		
		for(int i = 1; i <=100000; i++ ) {
			
			f += 100000; //f = f + 10000; �� ����. 1�̻��� ���ڴ� ���� ���� ǥ��.
			d += 100000;
			
			//System.out.println("Cheers!!:" + i); //����ؼ� ��Ÿ�� ��
			
			System.out.println("float:" + (f/100000));
			System.out.println("double:" + (d/100000));
			
			// ������� �� ���������ʰ� �������� �ʴ� ������ ����(�˷��� 2������ �����ϸ� ��)
			
		}
		
	}

	
}
