package ������;

import javax.swing.JOptionPane;

public class �⺻�Է�2 {

	public static void main(String[] args) {
		String id1 = "root"; // ����
		String id2 = JOptionPane.showInputDialog("���̵� �Է��ϼ���");
		String pass1 = "abc123"; // ����
		//String pass2 = "abc123"; // �Է�
		String pass2 = JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���");

		//��������: and(&&, ������ �� �¾ƾ���), or(||, ������ �� �� �̻� �¾ƾ���), not(!)
		if (id1.equals(id2) && pass1.equals(pass2)) { // true
			System.out.println("PASS");
		} else { // false
			// ��Ʈ��+����Ʈ+f : �ڵ� format
			System.out.println("���Է�");
		}

	}

}
