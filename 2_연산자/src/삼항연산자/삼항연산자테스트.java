package ���׿�����;

import java.util.Scanner;

public class ���׿������׽�Ʈ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		//���׿����� ���
		// ���ǽ� ? ���϶� ������ ����(��) : �����϶� ������ ���� (��);
		
		System.out.println(num%2==0? "¦��" : "Ȧ��");

	}

}
