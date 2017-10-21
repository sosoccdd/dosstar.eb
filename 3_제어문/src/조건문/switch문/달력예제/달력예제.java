package 조건문.switch문.달력예제;

import java.util.Scanner;

public class 달력예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요. : ");
		int num = sc.nextInt();
		String a = "";
		switch (num) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: a= "31일 까지 입니다.";
			
			break;
		case 4: case 6: case 9: case 11: a="30일 까지 입니다.";
			break;
		case 2: a="28일 또는 29일 까지 입니다.";
			break;

		default: System.out.println("월은 1월 ~ 12월 까지 입니다.");
			return;
		}

		System.out.printf("%d월은 %s",num,a);
	}

}
