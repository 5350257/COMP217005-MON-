package javaPrograming.week5.examples;

import java.util.Scanner;

public class InfinityRotation {
//한무 반복문 console 창에서 CTRL + C 하면 강제종료 됨
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age = 442142;

		while (true) {
			System.out.print("나이 : ");
			age = sc.nextInt();
			if (0 <= age && age < 200) { // 탈출
				break;
			}

			System.out.println("[입력오류] 나이는 0세 이상 200세 미만의 값만 유효합니다.");

		}
		System.out.printf("당신의 나이는 %d세 입니다.", age);

	}
}