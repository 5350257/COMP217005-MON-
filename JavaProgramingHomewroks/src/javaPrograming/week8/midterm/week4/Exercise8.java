package javaPrograming.week8.midterm.week4;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("년도 :");
		int year = sc.nextInt();
		System.out.print("달 : ");
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
			System.out.println("[입력오류] 1~12월까지만 존재합니다.");
			System.exit(1);
		}
		System.out.printf("%d년 %d월은 %d일까지 존재합니다.", year, month, days);
	}

}
