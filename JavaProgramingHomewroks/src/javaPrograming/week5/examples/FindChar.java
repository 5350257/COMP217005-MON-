package javaPrograming.week5.examples;

import java.util.*;

public class FindChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String s = sc.nextLine();
		System.out.print("x : ");
		int x = sc.nextInt();

		while (s.length() < x || x < 1) {

			System.out.println("[입력오류] x는 문자열의 길이 이하의 양의 정수만 유효합니다.");
			System.out.print("x : ");
			x = sc.nextInt();
		}
		char o = s.charAt(x - 1);

		System.out.printf("입력하신 문자열" + "\"" + "%s" + "\"" + "에서 %d번째 문자는" + "\'" + "%s" + "\'" + "입니다.", s, x, o);
	}
}