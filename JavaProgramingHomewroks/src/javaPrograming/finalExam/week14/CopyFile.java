package javaPrograming.finalExam.week14;

import java.io.*;
import java.util.Scanner;

class CopyFile {
	public static void main(String[] args) throws Exception {
		if (args.length < 2) {
			System.out.println("[Usage]java CopyFile original_file copy_file");
			System.exit(1);
		}

		File original = new File(args[0]);
		File copy = new File(args[1]);

		if (original.exists() == false) {
			System.out.println("���������� �������� �ʾ� ���α׷��� �����մϴ�. ");
			System.exit(2);
		}
		if (copy.exists() == true) {
			System.out.println("���纻 ������ �̹� �����Ͽ� ���α׷��� �����մϴ�. ");
			System.exit(3);
		}

		PrintWriter pw = new PrintWriter(copy);
		Scanner s = new Scanner(original);

		// �������� �о��
		// ���纻�� ���
		while (s.hasNext() == true)
			pw.println(s.nextLine());

		s.close();
		pw.close();

		System.out.printf("���� �Ϸ�. %s ������ Ȯ�����ּ���.\n", copy.getAbsolutePath());
	}
}
