package ������;

import javax.swing.JOptionPane;

public class ����1 {

	public static void main(String[] args) {
		// �ǽ�
		String n1 = JOptionPane.showInputDialog("����1 �Է�");
		String n2 = JOptionPane.showInputDialog("����2 �Է�");
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		System.out.println("�� ���� ���� " + (num1 + num2));
		System.out.println("�� ���� ���� " + (num1 - num2));
		System.out.println("�� ���� ���� " + (num1 * num2));
		System.out.println("�� ���� �������� " + (num1 / num2));
		
		JOptionPane.showMessageDialog(null, num1+num2);
		//null, ���ٶ�� �ǹ�, ��
	}

}
