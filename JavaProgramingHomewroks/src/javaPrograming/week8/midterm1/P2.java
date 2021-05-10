package javaPrograming.week8.midterm1;

import java.util.*;

public class P2 {
	public static void main(String[] args) {
		int a;
		int b;

		Scanner sc = new Scanner(System.in);

		System.out.print("a :");
		a = sc.nextInt();
		System.out.print("b :");
		b = sc.nextInt();

		if (a > b) {
			int c = a;
			a = b;
			b = c;
		}
		for (int i = a; i <= b; i++) {
			if (i % 2 != 0) {
				if (i < 5) {
					double y1 = 3 * Math.sin(i);
					System.out.printf("(%d, %.2f)\n", i, y1);
				} else if (i >= 5) {
					double y2 = Math.sqrt(Math.pow(i, 2) - 5 * i + 4);
					System.out.printf("(%d, %.2f)\n", i, y2);
				}

			}
		}
	}
}