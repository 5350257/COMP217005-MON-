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
			System.out.println("원본파일이 존재하지 않아 프로그램을 종료합니다. ");
			System.exit(2);
		}
		if (copy.exists() == true) {
			System.out.println("복사본 파일이 이미 존재하여 프로그램을 종료합니다. ");
			System.exit(3);
		}

		PrintWriter pw = new PrintWriter(copy);
		Scanner s = new Scanner(original);

		// 원본에서 읽어와
		// 복사본에 출력
		while (s.hasNext() == true)
			pw.println(s.nextLine());

		s.close();
		pw.close();

		System.out.printf("복사 완료. %s 파일을 확인해주세요.\n", copy.getAbsolutePath());
	}
}
