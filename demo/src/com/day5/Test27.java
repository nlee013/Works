package com.day5;

import java.util.Random;

public class Test27 {

	//1~45������ �� �߿��� 6���� ����(Random�̶�� �Լ�)�� �߻����� ũ������� ����
	public static void main(String[] args) {

		Random rd = new Random();
		int[] num = new int[6];
		
		int i, j, n, temp;
		
		n = 0;
		
		//�������� �ǹ̴� move���� random�� copy�� ������ ��
		//�� ���� ���� ���� �� �ִ�
		
		while(n < 6) {
			num[n] = rd.nextInt(45) + 1; //0���� ���� �� + 1 ���̸� 44+1 = 45���� ����.
			
			for(i = 0; i < n; i++) {
				if(num[i] == num[n]) {
					n--;
					break;//for���� ���������� ����.
				}
			}			
			n++; //�������Ѿ߸� �� num�� ���� ������
		}
		
		//�������� ����
		//num.length();->method �żҵ� �̹Ƿ� ���⼭ ���� �ȵ�.
		for(i = 0; i < num.length-1; i++) {
			for(j = i+1; j < num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		//�Ʒ� �ڵ�� for(int k = 0; k < num.length; k++)�� ����
		for(int k : num) {
			System.out.printf("%4d", k);
		}
	}
}