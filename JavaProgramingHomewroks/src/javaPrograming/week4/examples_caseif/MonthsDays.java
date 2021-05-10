package javaPrograming.week4.examples_caseif;

import java.util.*;

public class MonthsDays {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("현재 월 수 입력: ");
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
			System.out.println("입력오류 : 1~12월까지만 존재합니다, 다시입력.");
			// 프로그램종료
			// return; //함수 종료 근데 메인도 종료됨.
			System.exit(1);
		}
		System.out.printf("%d월은 %d일까지 존재합니다.", month, days);

	}
}