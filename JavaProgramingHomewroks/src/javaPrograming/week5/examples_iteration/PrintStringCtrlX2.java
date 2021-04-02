package javaPrograming.week5.examples_iteration;

import java.util.*;

public class PrintStringCtrlX2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String s = sc.nextLine();
		
		System.out.print("a : ");
		int a = sc.nextInt();
		
		while(s.length()<a || a<1 ) {
			System.out.println("[입력오류] a는 문자열의 길이 이하의 양의 정수만 유효합니다.");
			System.out.print("a : ");
			a = sc.nextInt();
		}
		
		System.out.print("b : ");
		int b = sc.nextInt();
		
		while(s.length()<b || b<1) {
			System.out.println("[입력오류] b는 문자열의 길이 이하의 양의 정수만 유효합니다.");
			System.out.print("b : ");
			b = sc.nextInt();
		}while(s.length()<a) {
			
			System.out.println("[입력오류] x는 문자열의 길이 이하의 양의 정수만 유효합니다.");
			System.out.println("x : ");
			a = sc.nextInt();
		}
		
		String cs = s.substring(b-1, a);
		
		System.out.printf("입력한 문자열" + "\""+"%s"+"\""+"에서 %d에서 %d까지 추출한 문자는" + "\""+"%s" + "\""+ "입니다.",s,b,a,cs);
	}

}
