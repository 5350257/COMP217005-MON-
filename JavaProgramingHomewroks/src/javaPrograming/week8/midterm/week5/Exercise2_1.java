package javaPrograming.week8.midterm.week5;

import java.util.*;

public class Exercise2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String s = sc.nextLine();
		int a = 0;
		while (true) {
			System.out.print("a : ");
			a = sc.nextInt();
			if (a <= s.length() && a >= 1) {
				break;
			}
			System.out.println("[입력오류] a는 문자열의 길이 이하의 양의 정수만 유효합니다.");
		}

		int b = 0;
		while (true) {
			System.out.print("b : ");
			b = sc.nextInt();
			if (b <= s.length() && b >= 1) {
				break;
			}
			System.out.println("[입력오류] b는 문자열의 길이 이하의 양의 정수만 유효합니다.");
		}
		
		if(a>b) {
			int c =a;
			a=b;
			b=c;
		}
		String sub = s.substring(a-1,b);
		
		System.out.printf("입력한 문자열" + "\""+"%s"+"\""+"에서 %d에서 %d까지 추출한 문자는" + "\""+"%s" + "\""+ "입니다.",s,a,b,sub);
	}

}
