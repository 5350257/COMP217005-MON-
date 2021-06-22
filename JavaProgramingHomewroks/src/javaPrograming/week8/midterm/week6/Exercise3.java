package javaPrograming.week8.midterm.week6;

import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String type;
		int line;
		int a;
		int b;
		int re;
		int line2;

		while (true) {
			System.out.print("도형 타입: ");
			type = sc.nextLine();
			if (type.equals("피라미드") || type.equals("사각형") || type.equals("다이아")) {
				break;
			}
			System.out.println("[입력오류] 도형의 타입은 ~~이다.");

		}
		switch (type) {
		case "피라미드":
			while (true) {
				System.out.print("라인 수: ");
				line = sc.nextInt();
				if (line <= 10 && line > 0) {
					break;
				}
				System.out.println("[입력오류] 0<라인<=10 ~~이다.");
			}
			for (int i = 1; i <= line; i++) {
				for (int k = 0; line-i > k; k++)
					System.out.print(" ");
				for (int j = i - 1; j >= 0; j--)
					System.out.print(j);
				for (int j = 1; j < i; j++)
					System.out.print(j);
				System.out.println();
			}
			break;
			
		case "사각형":
			while (true) {
				System.out.print("가로: ");
				a = sc.nextInt();
				if (a > 0) {
					break;
				}
				System.out.println("[입력오류] a>0");
			}
			while (true) {
				System.out.print("세로: ");
				b = sc.nextInt();
				if (b > 0) {
					break;
				}
				System.out.println("[입력오류] b>0");
			}
			while (true) {
				System.out.print("반복: ");
				re = sc.nextInt();
				if (re >= 0) {
					break;
				}
				System.out.println("[입력오류] re>=0");
			}
			for (int k = 1; k <= b; k++) {
				for (int i = 1; i <= re; i++) {
					for (int j = 1; j <= a; j++) {
						System.out.print("*");
					}
					System.out.print(" ");
				}
				System.out.println();
			}
			break;
			
		case "다이아":
			while (true) {
				System.out.print("라인 수: ");
				line2 = sc.nextInt();
				if (line2 % 2 != 0 && line2 > 0) {
					break;
				}
				System.out.println("[입력오류] 라인 수 >0,= 홀수");
				break;
			}
			for(int i=1;i<=(line2/2)+1;i++) {
				for(int k=(line2/2)+1;k>=i;k--)
					System.out.print(" ");
				for(int j=1;j<2*i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int i=1;i<=(line2/2)+1;i++) {
				for(int j=0;j<=i;j++)
					System.out.print(" ");
				for(int k=0;k<line2-2*i;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			break;
		}
	}

}
