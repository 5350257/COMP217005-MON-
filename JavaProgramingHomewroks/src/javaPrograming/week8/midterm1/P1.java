package javaPrograming.week8.midterm1;

import java.util.*;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� :");
		String s = sc.nextLine();
		s = s.toUpperCase();
		char[] arr = new char[26];
		int[] count = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (char) (i + 65); // �ҹ��� ���� - �ҹ��ڴ� �ƽ�Ű �ڵ� 97���� 26��

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
