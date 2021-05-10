package javaPrograming.week8.midterm1;

import java.util.*;

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (args.length == 0) {
			System.out.println("[사용법] : java Pattern 3 이상의 정수");
			System.exit(1);
		} else if (Integer.parseInt(args[0]) < 3) {
			System.out.println("패턴을 출력할 수 없습니다. 사용법을 확인해주세요.");
			System.exit(1);
		}

		int a = Integer.parseInt(args[0]);
		if (a % 2 == 0) {
			for (int i = 0; i < a; i++) {
				for (int j = 1; j < a - i; j++)
					System.out.print("  ");
				for (int k = 0; k <= i * 4; k++)
					System.out.print("*");
				System.out.println();
			}
		} else if (a % 2 != 0) {
			int c = a % 10;
			for (int i = 0; i < a / 2 + 1; i++) {
				for (int j = 1; j <= a / 2 - i; j++)
					System.out.print(" ");
				for (int k = 0; k <= i; k++)
					System.out.print(c);
				System.out.println();
			}
			for (int i = 1; i < a / 2 + 1; i++) {
				for (int k = 0; k < (a / 2 + 1) - i; k++)
					System.out.print(c);
				System.out.println();
			}
		}
	}
}
