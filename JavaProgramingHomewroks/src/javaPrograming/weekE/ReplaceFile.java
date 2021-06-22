package javaPrograming.weekE;

import java.io.*;
import java.util.Scanner;

class ReplaceFile {
	public static void main(String[] args) throws Exception {
		if (args.length < 4) {
			System.out.println("[Usage]java CopyFile original_file replace_file old_word new_word");
			System.exit(1);
		}

		File original = new File(args[0]);
		File copy = new File(args[1]);

		if (original.exists() == false) {
			System.out.println("���������� �������� �ʾ� ���α׷��� �����մϴ�. ");
			System.exit(2);
		}
		if (copy.exists() == true) {
			System.out.println("��ü�� ������ �̹� �����Ͽ� ���α׷��� �����մϴ�. ");
			System.exit(3);
		}

		Scanner s = new Scanner(original);
		PrintWriter pw = new PrintWriter(copy);

		// �������� �о��,
		// ���纻�� ���
		while (s.hasNext() == true) {
			pw.println(s.nextLine().replaceAll(args[2], args[3]));
		}
		s.close();
		pw.close();

		System.out.printf("��ü �Ϸ�. %s ������ Ȯ�����ּ���.\n", copy.getAbsolutePath());
	}
}
