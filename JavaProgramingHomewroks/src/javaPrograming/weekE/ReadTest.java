package javaPrograming.weekE;

//파일 입력
import java.io.*;
import java.util.Scanner;

class ReadTest {
	public static void main(String[] args) throws Exception {
		File f = new File("성적.txt");
		Scanner sc = new Scanner(f/* 어떤파일에서 읽어올꺼냐? */);
		/*
		 * System.out.println(sc.nextLine()); System.out.println(sc.next());
		 * System.out.println(sc.nextInt());
		 */
		while (sc.hasNext() == true/* 파일에서 읽을 내용이 있다면 */) {
			// System.out.println(s.nextLine());
			System.out.println(sc.next());
			System.out.println(sc.nextInt());
		}

		sc.close();
	}
}