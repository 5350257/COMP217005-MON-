package javaPrograming.week8.midterm.week6;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int result = 0;
		while (true) {
			System.out.print("1보다 큰 정수 :");
			n = sc.nextInt();
			if (n > 1) {
				break;
			}
			System.out.println("1보다 큰 정수를 입력");
		}
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d² ",i);
			if (i % 2 == 1) {
				result+=Math.pow(i,2);
				System.out.print("-");
			} else if (i % 2 == 0) {
				result-=Math.pow(i, 2);
				System.out.print("+");
			}
		}
		System.out.print("\b= " + result);
	}

}
