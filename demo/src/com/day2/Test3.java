package com.day2;


public class Test3 {

	public static void main(String[] args) {


	int r = 10; // (r= radius)
	
	//�ڷ���. �Ǽ�(�Ҽ��� ���� ��) -> double�� �ν��� -> float���� �ν��Ϸ��� ���� �ڿ� f�� ���δ� 3.14f
	
	//float area; float length;�� ����
	
	//double area, length;
	
	//float�� ǥ�� �� �� �ִ� ���ڴ� �Ҽ��� 6�ڸ� �� (�� ������ ���ڰ��� �����Ⱚ <- ������� 62.800003)
	float area, length;
	
	area = r*r*3.14f; //����. 3.14f = �ܹ��� ���� double = ������ ����
	length = r*2*3.14f; //�ѷ�

	System.out.println(area);
	System.out.println(length);
	
	System.out.println("radius: " + r + ", area: " + area);
	
	// �Ҽ��� ù��° �ڸ��� �����Ϸ��� area : %f -> %.1f�� ���� (�ٸ� ���ڵ� ����)
	System.out.printf("radius: %d, area: %.3f\n", r, area); //double -> %g�� ǥ��. int 5 < float 5.0f (�Ѵ�4byte)
	
	
	//---------------------------------- ����
	
	int a = 3;
	float b;
	
	b = a;
	
	System.out.println(b);
	
	}
}

