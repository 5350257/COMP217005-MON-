package javaPrograming.week4.examples_caseif;

import java.util.*;

public class WeekConverter{
	public static void main (String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요일 (월 :0, 화 :1. .... 일:6)");
		int num = sc.nextInt();
		
		System.out.print("x: ");
		int x = sc.nextInt();
		
	System.out.printf("%d요일 이후는 %d요일입니다.",x,(num+x)%7);
	}
}