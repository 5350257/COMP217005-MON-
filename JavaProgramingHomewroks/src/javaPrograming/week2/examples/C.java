package javaPrograming.week2.examples;

import java.util.Scanner;

public class C{
	public static void main (String [] args){
	
	int a,b;
	a=10;
			b=8;
	Scanner sc = new Scanner(System.in);
	
//	System.out.print("양의 정수 입력 1 :");
//	a = sc.nextInt();
//	
//	System.out.print("양의 정수 입력 2 :");
//	b = sc.nextInt();
//	
	System.out.println("두 수의 합 : " + (a+b));

	System.out.printf("두 수의 합: %-+10d",(a+b));
	System.out.println();
	System.out.printf("두 수의 합: %-#10o",(a+b));
	System.out.println();
	System.out.printf("두 수의 합: %#010x",(a+b));
	
	}
}