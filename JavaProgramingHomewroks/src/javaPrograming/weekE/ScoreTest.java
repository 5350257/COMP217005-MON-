package javaPrograming.weekE;

import java.io.*;
import java.util.Scanner;

class ScoreTest {
	public static void main(String[] args) throws Exception {
		File f1 = new File("�л��鼺��.txt");
		File f2 = new File("���.txt");

		Scanner s = new Scanner(f1);
		PrintWriter pw = new PrintWriter(f2);

		double sum = 0;

		s.nextLine();
		pw.println("�̸� ���");
		while (s.hasNext()) {
			pw.print(s.next() + " ");
			for (int i = 0; i < 3; i++)
				sum += s.nextInt();
			pw.println(String.format("%.2f", sum / 3));
			sum = 0;
		}
		pw.close();
		s.close();
		System.out.printf("%s ������ Ȯ�����ּ���. \n", f2.getName());
	}
}