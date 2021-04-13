package javaPrograming.week5.examples;

import java.util.Scanner;

public class JavaWhileTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : "); // 코드 중복
		int age = sc.nextInt();

		while (0 > age || age >= 200) {

			System.out.println("[입력오류] 나이는 0세 이상 200세 미만의 값만 유효합니다.");
			System.out.print("나이 : "); // 코드 중복
			age = sc.nextInt();
		}

		System.out.printf("당신의 나이는 %d세 입니다.", age);
	}

}