package ���ǹ�.switch��.�޷¿���;

import java.util.Scanner;

public class �޷¿��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���. : ");
		int num = sc.nextInt();
		String a = "";
		switch (num) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: a= "31�� ���� �Դϴ�.";
			
			break;
		case 4: case 6: case 9: case 11: a="30�� ���� �Դϴ�.";
			break;
		case 2: a="28�� �Ǵ� 29�� ���� �Դϴ�.";
			break;

		default: System.out.println("���� 1�� ~ 12�� ���� �Դϴ�.");
			return;
		}

		System.out.printf("%d���� %s",num,a);
	}

}
