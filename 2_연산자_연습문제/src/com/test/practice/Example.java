package com.test.practice;

import java.util.Scanner;

public class Example {
	
	public void sample1() {
		
		int jum1, jum2, jum3, sum;
		double dou1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���������� �Է��ϼ��� : ");
		jum1 = sc.nextInt();
		System.out.print("���������� �Է��ϼ��� : ");
		jum2 = sc.nextInt();
		System.out.print("���������� �Է��ϼ��� : ");
		jum3 = sc.nextInt();
		
		sum = jum1+jum2+jum3;
		dou1 = sum/3.0;
		
		System.out.println((jum1>=40)&&(jum2>=40)&&(jum3>=40)&&(dou1>=60));
	}

}
