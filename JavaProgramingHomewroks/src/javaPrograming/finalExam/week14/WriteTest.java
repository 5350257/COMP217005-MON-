package javaPrograming.finalExam.week14;

//���Ͽ� �л��� �̸�, ���� ���
import java.io.*;

class WriteTest {
	public static void main(String[] args) throws Exception {
		File file = new File("����.txt");
		PrintWriter pw = new PrintWriter(file); // file ��Ʈ���� ����

		pw.print("ȫ�浿 ");
		pw.println("75");
		// pw.printf("%s %d\r\n", "�Ѹ�", 100);
		pw.println(String.format("%s %d", "�Ѹ�", 100));// ���� ������ �ʿ��� ���
		pw.println(String.format("%s %d", "�����", 50));// ���� ������ �ʿ��� ���

		/*
		 * ���� ���� - ��������: \r\n - ������: \n - ��: \r
		 */
		pw.close();// �ڿ� ����
		System.out.printf("%s ������ Ȯ�����ּ���.\n", file.getName());
	}
}
