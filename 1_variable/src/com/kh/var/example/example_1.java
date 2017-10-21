package com.kh.var.example;

import java.util.Scanner;

public class example_1 {
	public void example1() {
	int num1;
	int num2;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("첫번째 정수를 입력하세요 : ");
	num1 = sc.nextInt();
	System.out.print("두번째 정수를 입력하세요 : ");
	num2 = sc.nextInt();
	
	int sum = num1+num2;
	int min = num1-num2;
	int mul = num1*num2;
	int div = num1/num2;
	int mod = num1%num2;
	
	System.out.println("더하기 결과 : "+sum);
	System.out.println("빼기 결과 : "+min);
	System.out.println("곱하기 결과 : "+mul);
	System.out.println("나누기한 몫 : "+div);
	System.out.println("나누기한 나머지 : "+mod);
	
	}
}
