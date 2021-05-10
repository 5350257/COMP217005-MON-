package javaPrograming.week8.midterm.week4;

import java.util.*;

public class Exercise9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��1�� x��ǥ : ");
		double x1 = sc.nextDouble();
		System.out.print("��1�� y��ǥ : ");
		double y1 = sc.nextDouble();
		System.out.print("��2�� x��ǥ : ");
		double x2 = sc.nextDouble();
		System.out.print("��2�� y��ǥ : ");
		double y2 = sc.nextDouble();
		sc.close();

		if (x1 == x2 || y1 == y2) {
			System.out.println("���簢���� �ƴմϴ�.");
			System.exit(1);
		} else {
			double perimeter = 2 * Math.abs(x1 - x2) + 2 * Math.abs(y1 - y2);
			double C = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
			double area = Math.abs(x1 - x2) * Math.abs(y1 - y2);
			System.out.printf("�ѷ��� ���� : %.2f\n", perimeter);
			System.out.printf("�밢���� ���� : %.2f\n", C);
			System.out.printf("���� : %.2f", area);
		}
	}
}