package javaPrograming.weekE;

//���� �Է�
import java.io.*;
import java.util.Scanner;

class ReadTest {
	public static void main(String[] args) throws Exception {
		File f = new File("����.txt");
		Scanner sc = new Scanner(f/* ����Ͽ��� �о�ò���? */);
		/*
		 * System.out.println(sc.nextLine()); System.out.println(sc.next());
		 * System.out.println(sc.nextInt());
		 */
		while (sc.hasNext() == true/* ���Ͽ��� ���� ������ �ִٸ� */) {
			// System.out.println(s.nextLine());
			System.out.println(sc.next());
			System.out.println(sc.nextInt());
		}

		sc.close();
	}
}