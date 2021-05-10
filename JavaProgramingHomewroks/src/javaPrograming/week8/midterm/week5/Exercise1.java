package javaPrograming.week8.midterm.week5;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("문자 :");
		char c = sc.next().charAt(0);

		System.out.print(c + " ");
		if (Character.isUpperCase(c) == true) {
			System.out.print("대문자");
		} else if (Character.isLowerCase(c) == true) {
			System.out.print("소문자");
		} else if (Character.isDigit(c) == true) {
			System.out.print("숫자");
		} else {
			System.out.print("기타문자");
		}
	}

}
