package ������;

import javax.swing.JOptionPane;

public class �׷��ȿ��� {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("�̸��� �Է�");	//ȫ�浿
		System.out.println(name);
		//int age = 100;
		//�ܺο��� �Է��ؼ� ������ �־��ִ� ���� 
		//��ǻ�ʹ� ������ String ó����
		String age = JOptionPane.showInputDialog("���̸� �Է�");
		int age2 = Integer.parseInt(age);
		
		//System.out.println(age + 1 + "��");
		//���ڰ� �����Ǿ� ���ڸ� �Է������� ���ڷ� �ν�, 201���� ����
		System.out.println(age2 + 1 + "��");
	}

}
