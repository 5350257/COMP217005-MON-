package javaPrograming.week8.midterm.week5;

import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int t = random.nextInt(101) - 50;
		int input = 0;
		int i = 1;

		while (true) {
			System.out.print("예측 : ");
			input = sc.nextInt();
			if (input < t) {
				i++;
				System.out.println("난수는 더 큰 값입니다. 다시 시도해주세요");
			} else if (input > t) {
				i++;
				System.out.println("난수는 더 작은 값입니다. 다시 시도해주세요");
			} else {

				System.out.printf("총 %d회만에 맞췄다.\n", i);
				sc.close();
				break;
			}
		}
	}

}
