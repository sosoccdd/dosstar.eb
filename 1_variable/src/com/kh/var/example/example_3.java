package com.kh.var.example;

import java.util.Scanner;

public class example_3 {
	public void example3() {
		
		String st1;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		st1 = sc.nextLine();
		
		char ch1 = st1.charAt(0);
		char ch2 = st1.charAt(1);
		char ch3 = st1.charAt(2);
		
		System.out.println("ù��° ���� : "+ch1);
		System.out.println("�ι�° ���� : "+ch2);
		System.out.println("����° ���� : "+ch3);

		
	}

}
