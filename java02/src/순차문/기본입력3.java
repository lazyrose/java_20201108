package ������;

import javax.swing.JOptionPane;

public class �⺻�Է�3 {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("����1 �Է�");	//200
		String n2 = JOptionPane.showInputDialog("����2 �Է�");
		
		System.out.println(n1 + n2); 	//���տ�����(1�� �̻� String)
		
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		System.out.println(n11 + n22); 	//���������

	}

}
