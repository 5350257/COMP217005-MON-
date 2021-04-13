package javaPrograming.week6.examples;

import java.util.*;

public class Test6Week {

	public static void main(String[] args) {
		int a, d, e, b = 0;
		String c;
		char f, g;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.printf("문자열 : ");
		c = s.nextLine();

		d = c.length();
		e = r.nextInt(d);
		f = c.charAt(e);

		while (true) {
			System.out.printf("문자 '%c'는 언제 발견될까요? ", f);
			a = s.nextInt();
			g = c.charAt(a - 1);
			b++;
			if (g == f)
				break;

			System.out.printf("아쉽네요. 장답이 아닙니다.\n");
		}

		System.out.printf("축하합니다. %d번만에 정답을 맞추셧습니다.", b);
	}
}