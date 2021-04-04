package javaPrograming.week4.examples_caseif;

import java.util.*;

public class WeekConverterVer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요일 (월 :0, 화 :1. .... 일:6) : ");
		int num = sc.nextInt();
		System.out.print("x: ");
		int x = sc.nextInt();
		int result = (num + x) % 7;
		;

		switch (result) {
		case 0:
			System.out.println(x + "일 후는 월요일입니다");
			break;

		case 1:
			System.out.println(x + "일 후는 화요일입니다");
			break;

		case 2:
			System.out.println(x + "일 후는 수요일입니다");
			break;

		case 3:
			System.out.println(x + "일 후는 목요일입니다");
			break;

		case 4:
			System.out.println(x + "일 후는 금요일입니다");
			break;

		case 5:
			System.out.println(x + "일 후는 토요일입니다");
			break;

		case 6:
			System.out.println(x + "일 후는 일요일입니다");
			break;
		}

	}
}