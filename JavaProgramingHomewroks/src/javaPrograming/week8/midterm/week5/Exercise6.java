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
				System.out.printf("%d! ���Ұ�\n%d!�� ���ϴ� �������� Overflow �߻�",n,i);
				System.exit(1);
			}
			f2 *= i;
		}
		System.out.printf("%d! = %d", n, f);
	}
}
