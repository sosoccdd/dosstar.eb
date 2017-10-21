package 삼항연산자;

import java.util.Scanner;

public class 삼항연산자테스트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		//삼항연산자 사용
		// 조건식 ? 참일때 수행할 연산(값) : 거짓일때 수행할 연산 (값);
		
		System.out.println(num%2==0? "짝수" : "홀수");

	}

}
