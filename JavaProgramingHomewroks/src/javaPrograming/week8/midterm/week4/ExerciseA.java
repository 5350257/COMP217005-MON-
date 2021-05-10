package javaPrograming.week8.midterm.week4;

import java.util.*;

public class ExerciseA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1억 미만의 정수: ");
		int n = sc.nextInt();
		sc.close();
		String result = "";

		if (n / 10000 == 1) {
			result += "만 ";
		} else if (n / 10000 != 0) {
			result += n / 10000 + "만 ";
		}

		int n1000 = n % 10000;
		if (n1000 / 1000 != 0 && n1000 / 1000 != 1) {
			result += n1000 / 1000 + "천 ";
		} else if (n1000 / 1000 == 1) {
			result += "천 ";
		}

		int n100 = n1000 % 1000;
		if (n100 / 100 == 1) {
			result += "백 ";
		} else if (n100 / 100 != 0) {
			result += n100 / 100 + "백 ";
		}

		int n10 = n100 % 100;
		if (n10 / 10 == 1) {
			result += "십 ";

		} else if (n10 / 10 != 0) {
			result += n10 / 10 + "십 ";
		}
		if (n10 % 10 != 0) {
			result += n10 % 10;
		}
		System.out.println(result);
	}

}
