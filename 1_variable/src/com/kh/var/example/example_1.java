package com.kh.var.example;

import java.util.Scanner;

public class example_1 {
	public void example1() {
	int num1;
	int num2;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("ù��° ������ �Է��ϼ��� : ");
	num1 = sc.nextInt();
	System.out.print("�ι�° ������ �Է��ϼ��� : ");
	num2 = sc.nextInt();
	
	int sum = num1+num2;
	int min = num1-num2;
	int mul = num1*num2;
	int div = num1/num2;
	int mod = num1%num2;
	
	System.out.println("���ϱ� ��� : "+sum);
	System.out.println("���� ��� : "+min);
	System.out.println("���ϱ� ��� : "+mul);
	System.out.println("�������� �� : "+div);
	System.out.println("�������� ������ : "+mod);
	
	}
}
