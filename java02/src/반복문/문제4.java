package �ݺ���;

import java.util.Scanner;

public class ����4 {

	public static void main(String[] args) {
		//�ǽ�
		//int score = 88;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A����");
		}else if (score >= 80 && score < 90) {
			System.out.println("B����");
		}else if (score >= 70 && score < 80) {
			System.out.println("C����");
		}
		else{
			System.out.println("F����");
		}

	}

}
