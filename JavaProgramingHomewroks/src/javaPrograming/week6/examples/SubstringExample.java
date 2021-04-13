package javaPrograming.week6.examples;

import java.util.*;

public class SubstringExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		System.out.print("문자열 : ");
		String s = sc.nextLine();

		while (true) {
			System.out.print("a :");
			a = sc.nextInt();
			if (a > s.length() || a <= 0) {
				System.out.println("[입력오류] a는 문자열의 길이 이하의 양의 정수만 유효합니다.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("b :");
			b = sc.nextInt();
			if (b > s.length() || b <= 0) {
				System.out.println("[입력오류] b는 문자열의 길이 이하의 양의 정수만 유효합니다.");
			} else {
				break;
			}
		}
		if (a > b) { // ab 교환 코드
			int c = a;
			a = b;
			b = c;
		}
		System.out.printf("입력한 문자열 \"%s\"에서 %d에서 %d까지 추출한 문자열은 \"%s\"입니다.", s, a, b, s.substring(a - 1, b));
	}
}

/*
import java.util.Scanner;

class SubstringTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String st;
		int a, b, tmp;
		
		System.out.print("문자열: ");
		st = s.nextLine();
		
		while(true){
			System.out.print("a: ");
			a = s.nextInt();
			if(a>0 && a<=st.length())
				break;
			else
				System.out.println("[입력오류]a는 문자열 길이 이하의 양수만 가능합니다. ");
		}
		
		while(true){
			System.out.print("b: ");
			b = s.nextInt();
			if(b>0 && b<=st.length())
				break;
			else
				System.out.println("[입력오류]b는 문자열 길이 이하의 양수만 가능합니다. ");
		}
		if(a>b){
			//a, b 교환 코드 
			tmp = a; //tmp = 5
			a = b; //a = 1
			b = tmp; //b = 5
		}
		
		
		
		System.out.printf("입력한 문자열 \"%s\"에서 %d 부터 %d까지 추출한 문자열은 \"%s\"입니다.\n", st, a, b, st.substring(a-1, b));
		
	}
}

 */