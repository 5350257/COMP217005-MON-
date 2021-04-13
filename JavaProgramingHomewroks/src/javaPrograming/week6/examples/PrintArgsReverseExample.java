package javaPrograming.week6.examples;

import java.util.*;

public class PrintArgsReverseExample {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("[입력오류] 하나의 문자열을 입력하지 않아 프로그램을 종료합니다.");
			System.exit(1);
		} else {
			String s = args[0];

			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
		}
	}
}