package javaPrograming.week8.midterm.week5;

import java.util.*;

public class Exercise9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("x : ");
		int x = sc.nextInt();
		System.out.print("y : ");
		int y = sc.nextInt();

		if (x < y) {
			int c = x;
			x = y;
			y = c;
		}
		
		while (y != 0) {
			int r = x % y;
			x = y;
			y = r;

		}

		System.out.println("최대공약수는 " + x + "이다.");
	}

}
