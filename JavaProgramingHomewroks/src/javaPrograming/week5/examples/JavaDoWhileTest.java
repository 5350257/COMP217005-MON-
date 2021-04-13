package javaPrograming.week5.examples;

import java.util.Scanner;

public class JavaDoWhileTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age;
		
		do {
			System.out.print("나이 : ");
			age = sc.nextInt();

			if (0 > age || age >= 200) {
				System.out.println("[입력오류] 나이는 0세 이상 200세 미만의 값만 유효합니다.");
			}
		} while (0 > age || age >= 200);

		System.out.printf("당신의 나이는 %d세 입니다.", age);
	}

}