package javaPrograming.week5.examples;

import java.util.Scanner;

public class InfinityRotation {
//�ѹ� �ݺ��� console â���� CTRL + C �ϸ� �������� ��
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age = 442142;

		while (true) {
			System.out.print("���� : ");
			age = sc.nextInt();
			if (0 <= age && age < 200) { // Ż��
				break;
			}

			System.out.println("[�Է¿���] ���̴� 0�� �̻� 200�� �̸��� ���� ��ȿ�մϴ�.");

		}
		System.out.printf("����� ���̴� %d�� �Դϴ�.", age);

	}
}