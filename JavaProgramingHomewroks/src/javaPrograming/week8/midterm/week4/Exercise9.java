package javaPrograming.week8.midterm.week4;

import java.util.*;

public class Exercise9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("점1의 x좌표 : ");
		double x1 = sc.nextDouble();
		System.out.print("점1의 y좌표 : ");
		double y1 = sc.nextDouble();
		System.out.print("점2의 x좌표 : ");
		double x2 = sc.nextDouble();
		System.out.print("점2의 y좌표 : ");
		double y2 = sc.nextDouble();
		sc.close();

		if (x1 == x2 || y1 == y2) {
			System.out.println("직사각형이 아닙니다.");
			System.exit(1);
		} else {
			double perimeter = 2 * Math.abs(x1 - x2) + 2 * Math.abs(y1 - y2);
			double C = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
			double area = Math.abs(x1 - x2) * Math.abs(y1 - y2);
			System.out.printf("둘레의 길이 : %.2f\n", perimeter);
			System.out.printf("대각선의 길이 : %.2f\n", C);
			System.out.printf("넓이 : %.2f", area);
		}
	}
}