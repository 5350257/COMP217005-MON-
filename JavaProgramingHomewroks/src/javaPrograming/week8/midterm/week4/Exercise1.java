package javaPrograming.week8.midterm.week4;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �� ���� �Է� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.printf("�� ���� �� �ִ밪�� %d�̸�, %s", a > b ? a : b, (a > b ? "�ִ밪�� ���� �� �Դϴ�." : "�ִ밪�� ���� �� �Դϴ�."));
	}

}
