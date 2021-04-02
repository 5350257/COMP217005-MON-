package javaPrograming.week5.examples_iteration;

import java.util.*;

public class The99Dan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("¸î ´Ü : ");
		int d = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d\n", d, i, d * i);
		}
	}

}
