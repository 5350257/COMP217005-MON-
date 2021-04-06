package javaPrograming.week5.problems;

import java.util.*;

public class HomeWorks1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1, x2, y1, y2;

		do {
			System.out.print("점 1의 x좌표 : ");
			x1 = sc.nextDouble();
			System.out.print("점 1의 y좌표 : ");
			y1 = sc.nextDouble();
			System.out.print("점 2의 x좌표 : ");
			x2 = sc.nextDouble();
			System.out.print("점 2의 y좌표 : ");
			y2 = sc.nextDouble();
			sc.close();
			if (x1 == x2 || y1 == y2) {
				System.out.printf("점 (%.2f, %.2f)와 점 (%.2f, %.2f)는 직사각형을 이루지 않습니다. 다시 입력해주세요\n", x1, y1, x2, y2);
			}
		} while (x1 == x2 || y1 == y2);
		double round = 2 * (Math.sqrt(Math.pow(x1 - x2, 2) ) + Math.sqrt(Math.pow(y1 - y2, 2) ) );
		double xy = Math.sqrt(Math.pow(x1 - x2, 2) )*Math.sqrt(Math.pow(y1 - y2, 2) );
		double z = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		System.out.println("===========계산 결과===========");
		System.out.printf("-둘레의 길이 : %.2f\n", round);
		System.out.printf("-넓이 : %.2f \n",xy);
		System.out.printf("-대각선의 길이 :%.2f\n", z);

	}

}
