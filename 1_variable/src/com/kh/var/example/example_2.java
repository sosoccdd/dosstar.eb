package com.kh.var.example;

import java.util.Scanner;

public class example_2 {
	public void example2() {
		
		double ga;
		double se;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로길이를 입력하세요 : ");
		ga = sc.nextDouble();
		System.out.print("세로길이를 입력하세요 : ");
		se = sc.nextDouble();
		
		double mun = ga*se;
		double dul = (ga+se)*2;
		
		System.out.println("면적 : "+mun);
		System.out.println("둘레 : "+dul);
		
	}

}
