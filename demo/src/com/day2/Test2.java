package com.day2;

class Test2 {
	
	//�Ʒ� �̸��� �ݵ�� ����Ǹ� �ȵ�. �ݵ�� �⺻���� �ܿ�����.
	
	public static void main(String[]args) {
		
		//�޸𸮿� �׸�(����)�� �����. a��� �׸��� 10�� �ִ´ٴ� �ǹ� -> ������ ���� ���ʿ� �ִ´�

		//����(���ϴ� ��) ����
		//�ڷ��� int (������ 8����)
		//int �� ���� ���ڰ��� �Է��� �� ����(�Ҽ���, ���� �Ұ�, �� -21��~21�� ���� ����)
		
		int a = 10;
		int b = 5;
		
		//����ִ� �׸��� �ƴ϶�, ����(�����Ⱚ)�� ��������� �츮�� �������� ��.
		//���࿡ ���� ���� �Է��Ѵٸ�, �� ���� ����(�����Ⱚ)�� ����� ��� ��.
		
		int c, d;
		
		//�׸��� ��� �� ���
		System.out.println(a);
		System.out.println(b);
		
		/*System.out.println(c); �����Ⱚ�� ��ºҰ�.
		->���� ���� ���� �� = ������ ���� = �ݵ�� ���� �����ؾߵ�.
		Runtime error = ���� ������ ������ ������ ���� �� ������
		������ 6�� ���� ������ ���� ���� Logic�� �����ϸ� ��
		*/
		
		c = a + b;
		
		System.out.println(c);
		
		d = b-c;
		
		System.out.println(d);
		
		//""�ȿ� ���� ���� ���� = string. + �� �ٿ��Ἥ ����.
		System.out.println(a + "+" + b + "=" + c); 
		System.out.println(); //enter ȿ�� = �� �ٲ�
		System.out.println(b + "-" + c + "=" + d);
		
		//System.out.print(); ���� �� = ���� �ȿ� ���ڸ� ���� ������ ������ ������
		
		/* < ���� ���� ���̴� ��>
		
		d = decimal ������ ������ �� �ִ� ��. ������� ���� ��  -> int���� 10������ ���
		s
		c
		f = double���� �Ҽ��� ���
		g
		
		f = format�� ���� format(���)
		%n = \n = �� �ٲ�
		 */
		
		System.out.printf("%d + %d = %d%n", a, b, c); 
		System.out.printf("%d - %d = %d", a, b, d);

		
	}

}
