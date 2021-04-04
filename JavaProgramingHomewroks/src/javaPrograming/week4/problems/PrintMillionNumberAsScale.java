package javaPrograming.week4.problems;

import java.util.*;

public class PrintMillionNumberAsScale {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1억 미만의 정수 :");
		int num = sc.nextInt();
		sc.close();
		
		while(num>100000000) {
			System.out.println("1억 미만을 입력하라고");
			num = sc.nextInt();
		}
		
		
		if(num/10000!=0) {
			System.out.print((num/10000)+"만 ");
		}else if(num/10000==1) {
			System.out.print("만 ");
		}
		

		int num1 = num%10000;
		if(num1/1000!=0) {
			System.out.print((num1/1000)+"천 ");
		}else if(num1/1000==1) {
			System.out.print("천 ");
		}

		int num2 = num1%1000;
		if(num2/100!=0) {
			System.out.print((num2/100)+"백 ");
		}else if(num2/100==1) {
			System.out.print("백 ");
		}
		

		int num3 = num2%100;
		if(num3/10!=0) {
			System.out.print((num3/10)+"십 ");
		}else if(num3/10==1) {
			System.out.print("십 ");
		}
		if(num3%10!=0) {
			System.out.print((num3%10));
		}


	}

}
