package javaPrograming.week5.problems;

import java.util.*;

public class HomeWorks1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1, x2, y1, y2;

		do {
			System.out.print("�� 1�� x��ǥ : ");
			x1 = sc.nextDouble();
			System.out.print("�� 1�� y��ǥ : ");
			y1 = sc.nextDouble();
			System.out.print("�� 2�� x��ǥ : ");
			x2 = sc.nextDouble();
			System.out.print("�� 2�� y��ǥ : ");
			y2 = sc.nextDouble();
			sc.close();
			if (x1 == x2 || y1 == y2) {
				System.out.printf("�� (%.2f, %.2f)�� �� (%.2f, %.2f)�� ���簢���� �̷��� �ʽ��ϴ�. �ٽ� �Է����ּ���\n", x1, y1, x2, y2);
			}
		} while (x1 == x2 || y1 == y2);
		double round = 2 * (Math.sqrt(Math.pow(x1 - x2, 2) ) + Math.sqrt(Math.pow(y1 - y2, 2) ) );
		double xy = Math.sqrt(Math.pow(x1 - x2, 2) )*Math.sqrt(Math.pow(y1 - y2, 2) );
		double z = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		System.out.println("===========��� ���===========");
		System.out.printf("-�ѷ��� ���� : %.2f\n", round);
		System.out.printf("-���� : %.2f \n",xy);
		System.out.printf("-�밢���� ���� :%.2f\n", z);

	}

}
