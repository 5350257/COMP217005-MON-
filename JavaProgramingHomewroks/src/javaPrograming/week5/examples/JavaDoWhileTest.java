package javaPrograming.week5.examples;

import java.util.Scanner;

public class JavaDoWhileTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age;
		
		do {
			System.out.print("���� : ");
			age = sc.nextInt();

			if (0 > age || age >= 200) {
				System.out.println("[�Է¿���] ���̴� 0�� �̻� 200�� �̸��� ���� ��ȿ�մϴ�.");
			}
		} while (0 > age || age >= 200);

		System.out.printf("����� ���̴� %d�� �Դϴ�.", age);
	}

}