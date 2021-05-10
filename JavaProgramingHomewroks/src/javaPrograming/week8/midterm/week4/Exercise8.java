package javaPrograming.week8.midterm.week4;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ :");
		int year = sc.nextInt();
		System.out.print("�� : ");
		int month = sc.nextInt();

		int days = 31;

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

		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if (year % 4 == 0 && year % 100 != 0) {
				days = 29;
			} else if ((year % 400) == 0) {
				days = 29;
			} else {
				days = 28;
			}
			break;
			
		default:
			System.out.println("[�Է¿���] 1~12�������� �����մϴ�.");
			System.exit(1);
		}
		System.out.printf("%d�� %d���� %d�ϱ��� �����մϴ�.", year, month, days);
	}

}
