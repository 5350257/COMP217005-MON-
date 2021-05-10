package javaPrograming.week8.midterm.week5;

import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0;
		String operator;
		double b = 0;
		double result = 0;

		while (true) {
			System.out.print("���� �Է��ϼ��� (ex 7 + 4) :");
			a = sc.nextDouble();
			operator = sc.next();
			b = sc.nextDouble();
			if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")
					|| operator.equals("%")) {
				break;
			}
			System.out.println("[�Է¿���] +, -, *, /, % ���길 �����մϴ�. �ٽ� �Է����ּ���. ");
		}
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
				System.out.println("0���� ���� �� �����ϴ�.");
				System.exit(1);
			}
			result = a / b;
			break;
		case "%":
			if (b == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				System.exit(1);
			}
			result = a % b;
			break;
		}
		if (result == (int) result) {
			System.out.println((int) result);
		}else {
			System.out.printf("%.2f",result);
		}

	}

}
