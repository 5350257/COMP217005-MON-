package javaPrograming.week5.examples_iteration;

import java.util.*;

public class FindFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("n : ");
		int n = sc.nextInt();
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f *= i;
		}
		System.out.printf("%d! = %d", n, f);
	}
}
