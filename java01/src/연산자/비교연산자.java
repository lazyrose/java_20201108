package ������;

public class �񱳿����� {

	public static void main(String[] args) {
		int x = 200;
		int y = 100;
		//�񱳿����� ����� ����(boolean, true/false)
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x >= y);
		
		int id = 1111;	//ȸ�������� ���� ����� id
		int id2 = 2222;	//�α����� ���� id�Է�
		
		if (id == id2) {	//������ �񱳿����� ����, ����� true/false
			//������ ������ ����Ǵ� �κ�
			System.out.println("�α��� ����");
		} else {
			//������ �ȸ����� ����Ǵ� �κ�
			System.out.println("�α��� ����");
		}
	}

}
