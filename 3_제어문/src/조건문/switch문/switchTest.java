package ���ǹ�.switch��;

import java.util.Scanner;

public class switchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ϴ� ������ �Է��ϼ���.(1.���  2.�ٳ���  3.������)  :  ");
		int num = sc.nextInt();
		String color = "";
		
		switch (num) {
		case 1: color = "������"; 
			break;
		case 2: color = "�����";
			break;
		case 3: color = "��Ȳ��";
			break;
		default: System.out.println("�߸��Է��ϼ̽��ϴ�.");
			return;
		}
		System.out.println("������ ������ ������ : "+ color);

	}

}
