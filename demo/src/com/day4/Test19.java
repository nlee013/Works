package com.day4;

//���� for��

public class Test19 {

	public static void main(String[] args) {

		int i, j;
		
		for(i = 2; i <= 9; i++) {
			
			System.out.println( i + "unit");
			
			System.out.println("------------------");

			for(j = 1; j <=9; j++) {
				
				//System.out.println(i + "x" + j + "=" + (i*j));
				System.out.printf("%d*%d=%d\n", i, j, (i*j));
			}
			System.out.println(); //for���� ����ǰ� ���� �ٽ� �ö󰡱� ������ ���⿡ �ؾ� ó������ ���⸦ ���ϰ� ����.
		}
		
	}

}
