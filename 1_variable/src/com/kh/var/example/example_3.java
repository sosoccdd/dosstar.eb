package com.kh.var.example;

import java.util.Scanner;

public class example_3 {
	public void example3() {
		
		String st1;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		st1 = sc.nextLine();
		
		char ch1 = st1.charAt(0);
		char ch2 = st1.charAt(1);
		char ch3 = st1.charAt(2);
		
		System.out.println("첫번째 문자 : "+ch1);
		System.out.println("두번째 문자 : "+ch2);
		System.out.println("세번째 문자 : "+ch3);

		
	}

}
