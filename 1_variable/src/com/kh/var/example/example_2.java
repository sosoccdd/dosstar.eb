package com.kh.var.example;

import java.util.Scanner;

public class example_2 {
	public void example2() {
		
		double ga;
		double se;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���α��̸� �Է��ϼ��� : ");
		ga = sc.nextDouble();
		System.out.print("���α��̸� �Է��ϼ��� : ");
		se = sc.nextDouble();
		
		double mun = ga*se;
		double dul = (ga+se)*2;
		
		System.out.println("���� : "+mun);
		System.out.println("�ѷ� : "+dul);
		
	}

}
