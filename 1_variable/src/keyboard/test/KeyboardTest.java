package keyboard.test;

import java.util.Scanner;

public class KeyboardTest {
	public void input() {
		String name;
		int age;
		char gender;
		String address;
		double height;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		System.out.print("������ �Է��ϼ��� : ");
		age = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		gender = sc.next().charAt(0);
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		sc.nextLine();
		address = sc.nextLine();
		System.out.print("Ű�� �Է��ϼ��� : ");
		height = sc.nextDouble();
		
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("���� : "+gender);
		System.out.println("�ּ� : "+address);
		System.out.println("Ű : "+height);
		
	}
}
