package ����;

public class �����Ϳ����� {

	public static void main(String[] args) {
		// �⺻������: ����, �Ǽ�, ����, ��
		double �µ� = 25.5;
		float ������ = 99.9F;	//f
		
		byte age = 100;	//-128~127
		short distance = 20000; //+-3��
		int high = 100;	//+-21��
		long space = 2111111111L;	//1
		
		char gender = '��';	//�ѱ���
		
		boolean check = true;	//false
		
		System.out.println(age + distance);
		System.out.println(age == distance);
		System.out.println(age != distance);
		
		//int�� int����� ������ int
		int sum = high + 1;	//101
		int count = 5;
		//�ϳ��� double�̸� ����� ����� ������ double
		System.out.println(sum / (double)count);
		//����Ÿ�Ժ�ȯ => (�����ϰ��� �ϴ� Ÿ��) ������
		//ĳ����casting
		
		
	}

}
