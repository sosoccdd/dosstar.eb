package ���׿�����.����������;

public class �����������׽�Ʈ {

	public static void main(String[] args) {
		int num1 = 20;
		//���� �������� �ܵ� ���
		++num1;
		System.out.println("num1 : " + num1);  //1 ����
		
		int num2 = 10;
		//���� ���� ���� �ܵ� ���
		num2++;
		System.out.println("num2 : " + num2); //1����
		
		//�ٸ� �����ڿ� �Բ� ���ÿ��� ����,������ ���� ���������� �޶�����.
		
		int a = 10;
		//�ٸ� �����ڿ� �Բ�  ���� ������ ����� ���
		int b = a++;
		System.out.println("a : "+ a); //�� 1����
		System.out.println("b : "+ b); //�� �������� ���� 
		
		int c = 10;
		//�ٸ� �����ڿ� �Բ� ���� ������ ����� ���
		int d = ++c;
		System.out.println("c : "+ c); //�� 1����
		System.out.println("d : "+ d); //�� 1����
		
	}

}
