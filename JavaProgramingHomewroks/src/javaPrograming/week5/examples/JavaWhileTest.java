package javaPrograming.week5.examples;

import java.util.Scanner;

public class JavaWhileTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : "); // �ڵ� �ߺ�
		int age = sc.nextInt();

		while (0 > age || age >= 200) {

			System.out.println("[�Է¿���] ���̴� 0�� �̻� 200�� �̸��� ���� ��ȿ�մϴ�.");
			System.out.print("���� : "); // �ڵ� �ߺ�
			age = sc.nextInt();
		}

		System.out.printf("����� ���̴� %d�� �Դϴ�.", age);
	}

}