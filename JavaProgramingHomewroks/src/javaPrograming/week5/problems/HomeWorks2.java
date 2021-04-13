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
			System.out.print("���� �Է��ϼ��� (ex. 7 + 4): ");
			a = sc.nextDouble();
			operator = sc.next();
			b = sc.nextDouble();
			if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")
					&& !operator.equals("%")) {
				
				System.out.println("[�Է¿���] +, -, *, /, % ���길 �����մϴ�. �ٽ� �Է����ּ���. ");
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
				System.out.println("0���� ���� �� �����ϴ�.");
				System.exit(1);
			}
			result = a / b;
			break;

		case "%":
			if (b == 0) {
				System.out.println("0���� ���� �������� ���� �� �����ϴ�.");
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
/*
 double a, b, result = 0;//���ǹ��� ���� result�� �ʱ�ȭ�ϱ� ������ �ǹ̴� ������ 0���� �ʱ�ȭ
		String operator; //���� �ٷ� �� ó�� char Ÿ������ �μŵ� �����մϴ�. 
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.print("���� �Է��ϼ���(ex. 7 + 4): ");
			a = s.nextDouble();
			operator = s.next(); //operator�� char Ÿ������ �״ٸ� .charAt(0)�ϸ� �ǰ���?
			b = s.nextDouble();
			
			if(operator.equals("+")==true ||  operator.equals("-")==true || operator.equals("*")==true || operator.equals("/")==true || operator.equals("%")==true)
				break;
			System.out.println("[�Է¿���] +, -, *, /, % ���길 �����մϴ�. �ٽ� �Է����ּ���. ");
		}	
		
		switch(operator){
		case "+":
			result = a+b;
			break;
		case "-":
			result = a-b;
			break;
		case "*":
			result = a*b;
			break;		
		case "/":
			if(b==0){
				System.out.println("0���� ���� �� �����ϴ�.");
				System.exit(1);
			}
			result = a/b;
			break;				
		case "%":
			if(b==0){
				System.out.println("0���� ���� �������� ���� �� �����ϴ�.");
				System.exit(2);
			}
			result = a%b;
			break;
		}
		
		if(result==(int)result) System.out.println((int)result);
		else System.out.printf("%.2f\n", result);	
	}
}
 */
