package javaPrograming.week8.midterm1;

import java.util.*;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문장 :");
		String s = sc.nextLine();
		s = s.toUpperCase();
		char[] arr = new char[26];
		int[] count = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (char) (i + 65); // 소문자 저장 - 소문자는 아스키 코드 97부터 26개

		}

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (s.charAt(i) == arr[j]) {
					count[j]++;

				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (count[i] != 0) {
				System.out.println(arr[i] + " : " + count[i]);
			}

		}

	}
}
