package javaPrograming.week3.ploblems;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수:");
		int a = sc.nextInt();
		
//		System.out.println(toBinaryString(a));
		
		if(a>>>31==0) {
			System.out.printf("%d는(은) 양수입니다. 이 수의 절댓값은 %d이고,\n\t절댓값을 4로 나눈 몫은 %d이고,\n\t\t나머지는 %d입니다.",a,a,a/4,a%4);
		}else {
			int b=-a;
			System.out.printf("%d는(은) 음수입니다. 이 수의 절댓값은 %d이고,\n\t절댓값을 4로 나눈 몫은 %d이고,\n\t\t나머지는 %d입니다.",a,b,b/4,b%4);
		}
	}

//	public static String toBinaryString(int value) {
//		String str = Integer.toBinaryString(value);
//		while(str.length()<32) {
//			str = "0"+ str;
//		}
//		return str;
//	}
//
}
