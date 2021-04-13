package javaPrograming.week6.examples;

import java.util.*;

public class CalculateOddNumExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		double result = 0;
		int i = 0;
		boolean run = true;
		while (run) {
			System.out.print("정수 : ");
			a = sc.nextInt();
			if (a % 2 == 1 && a % 7 != 0 && a != 1111) {
				result += a;
				i++;
			} else if (a == 1111) {
				run = false;
			}
		}
		if (i == 0) {
			System.out.print("평균을 계산할 홀수가 없습니다.");
		} else {
			System.out.printf("조건을 만족하는 %d개의 홀수들의 평균은 %.2f입니다.", i, result / i);
		}
	}
}