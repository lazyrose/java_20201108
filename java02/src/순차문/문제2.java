package ������;

import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		// �ǽ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �̸���? ");
		String name = sc.nextLine();
		
		System.out.print("���� Ű��? ");
		double height = sc.nextDouble();
		
		System.out.print("���� �����Դ�? ");
		double weight = sc.nextDouble();
		
		System.out.print("���� ������ �Ծ�����? ");
		boolean dinner = sc.nextBoolean();
		
		System.out.print("���� �¿����? ");
		String life = sc.nextLine();
		
		// �߰��� ������� ���� enter �ν��ϴ� ���, nextLine()���� ó��
		sc.nextLine();
		
		System.out.println("---------------------");
		System.out.println("�� �̸��� " + name);
		System.out.println("�� ���� Ű�� " + (height + 10));
		System.out.println("�� ���� �����Դ� " + (weight - 10));
		System.out.println("���� ������ " + dinner);
		System.out.println("���� �¿���� " + life);
	}

}
