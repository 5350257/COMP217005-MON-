package javaPrograming.week4.examples_caseif;

import java.util.*;

public class MonthsDays {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("���� �� �� �Է�: ");
		int month = sc.nextInt();
		int days = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;

		case 2:

			days = 28;
			break;

		case 4:
		case 6:
		case 9:
		case 11:

			days = 30;
			break;

		default:
			System.out.println("�Է¿��� : 1~12�������� �����մϴ�, �ٽ��Է�.");
			// ���α׷�����
			// return; //�Լ� ���� �ٵ� ���ε� �����.
			System.exit(1);
		}
		System.out.printf("%d���� %d�ϱ��� �����մϴ�.", month, days);

	}
}