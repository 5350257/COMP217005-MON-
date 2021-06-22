package javaPrograming.weekB;

import java.util.Scanner;

class StringManipulate {
	String concat(String s1, String s2) {
		return s1 + s2;
	}

	String toUpper(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				result += (char) ((int) s.charAt(i) - 32);
			} else {
				result += s.charAt(i);
			}
		}
		return result;
	}
	boolean equals(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
				}
		}
		return true;
	}
}

public class StringManipulateTest {
	public static void main(String[] args) {
		String s1, s2;
		StringManipulate sm = new StringManipulate();
		Scanner s = new Scanner(System.in);
		
		System.out.print("문장 1: ");
		s1 = s.nextLine();
		System.out.print("문장 2: ");
		s2 = s.nextLine();
		
		System.out.println("문장 1과 문장 2의 연결 결과: "+sm.concat(s1, s2));
		System.out.println("문장 1 대문자 변환 결과: "+sm.toUpper(s1));
		System.out.println("문장 1과 문장 2의 일치 여부: "+sm.equals(s1, s2));

	}
}