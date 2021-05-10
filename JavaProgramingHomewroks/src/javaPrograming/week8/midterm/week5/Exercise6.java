package javaPrograming.week8.midterm.week5;

import java.util.*;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("n : ");
		int n = sc.nextInt();
		int f = 1;
		int f2 = 1;
		for (int i = 1; i <= n; i++) {
			f *= i;
			if (f2 != f / i) {
				System.out.printf("%d! 계산불가\n%d!을 구하는 과정에서 Overflow 발생",n,i);
				System.exit(1);
			}
			f2 *= i;
		}
		System.out.printf("%d! = %d", n, f);
	}
}
