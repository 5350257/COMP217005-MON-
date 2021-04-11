package javaPrograming.week5.problems;

import java.util.*;

public class HomeWorks2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		String operator;
		double b;
		double result = 0;
		do {
			System.out.print("식을 입력하세요 (ex. 7 + 4): ");
			a = sc.nextDouble();
			operator = sc.next();
			b = sc.nextDouble();
			if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")
					&& !operator.equals("%")) {
				System.out.println("[입력오류] +, -, *, /, % 연산만 지원합니다. 다시 입력해주세요. ");
			}
		} while (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")
				&& !operator.equals("%"));

		switch (operator) {
		case "+":
			result = a + b;
			break;

		case "-":
			result = a - b;
			break;

		case "*":
			result = a * b;
			break;

		case "/":
			if (b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(1);
			}
			result = a / b;
			break;

		case "%":
			if (b == 0) {
				System.out.println("0으로 나눈 나머지는 구할 수 없습니다.");
				System.exit(2);
			}
			result = a % b;
			break;
		}
		if (result == (int) (result)) {
			System.out.println((int) result);
		} else {
			System.out.printf("%.2f", result);
		}
	}
}
