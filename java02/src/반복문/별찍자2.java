package �ݺ���;

import java.util.Scanner;

public class ������2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���۰� >> ");
		int s = sc.nextInt();	//1
		System.out.print("���ᰪ >> ");
		int e = sc.nextInt();	//10
		
		int sum = 0;
		for (int i = s; i <= e; i++) {
			//sum = sum + i;
			if (i % 2 == 0) {
				System.out.println();
			}
		}
		System.out.println("�� ���� ���� " + sum);

	}

}
