package 복습;

import javax.swing.JOptionPane;

public class subject {

	public static void main(String[] args) {
		String[] subject = new String[3];
		//{null, null, null}
		//subject[0], subject[1], ~~~
		//JOptionPane.showInputDialog();
		//=> 내가 이번학기에 듣는 과목은 수학 컴퓨터 영어
		for (int i = 0; i < subject.length; i++) {
			subject[i] = JOptionPane.showInputDialog("과목입력");
		}
		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i] + " ");
		}
	}

}
