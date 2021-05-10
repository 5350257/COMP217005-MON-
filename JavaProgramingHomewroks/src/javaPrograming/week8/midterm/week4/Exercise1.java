package javaPrograming.week8.midterm.week4;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 두 개를 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.printf("두 정수 중 최대값은 %d이며, %s", a > b ? a : b, (a > b ? "최대값은 앞의 수 입니다." : "최대값은 뒤의 수 입니다."));
	}

}
