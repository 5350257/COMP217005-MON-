package javaPrograming.week6.examples;

import java.util.*;

public class CalculateOddNumExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		double result = 0;
		int i = 0;
		boolean run = true;
		while (run) {
			System.out.print("���� : ");
			a = sc.nextInt();
			if (a % 2 == 1 && a % 7 != 0 && a != 1111) {
				result += a;
				i++;
			} else if (a == 1111) {
				run = false;
			}
		}
		if (i == 0) {
			System.out.print("����� ����� Ȧ���� �����ϴ�.");
		} else {
			System.out.printf("������ �����ϴ� %d���� Ȧ������ ����� %.2f�Դϴ�.", i, result / i);
		}
	}
}