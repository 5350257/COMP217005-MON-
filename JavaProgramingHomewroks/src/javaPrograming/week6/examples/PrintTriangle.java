package javaPrograming.week6.examples;

import java.util.*;

public class PrintTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("라인 수 : ");
		int length = sc.nextInt();

		for (int l = 1; l <= length; l++) {
			for (int i = 0; i < l; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println(); //개행

		for (int l = 1; l <= length; l++) {

			for (int k = length; k > l; k--) {
				System.out.print(" ");
			}
			for (int i = 1; i <= l; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
