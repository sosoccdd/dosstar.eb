package 조건문.elseif문;

import java.util.Scanner;

public class elseifTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int point;
		
		System.out.print("점수를 입력하세요");
		point = sc.nextInt();
		
		String grade = "";
		
		if(point >=90) {
			grade = "A";
			if(point>=95) {
				grade += "+";
			}
		}else if(point >= 80) {
			grade = "B";
			if(point>=85) {
				grade += "+";
			}
		}else if(point >= 70) {
			grade = "C";
			if(point>=75) {
				grade += "+";
			}
		}else if(point >= 60) {
			grade = "D";
			if(point>=65) {
				grade += "+";
			}
		}else {
			grade = "F";
		}
		System.out.printf("당신의 점수는 %d이고, 등급은 %s입니다.", point, grade);
		

	}

}
