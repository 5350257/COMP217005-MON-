package javaPrograming.week4.problems;

import java.util.*;

public class PrintMillionNumberAsScale {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�� �̸��� ���� :");
		int num = sc.nextInt();
		sc.close();
		
		while(num>100000000) {
			System.out.println("1�� �̸��� �Է��϶��");
			num = sc.nextInt();
		}
		
		
		if(num/10000!=0) {
			System.out.print((num/10000)+"�� ");
		}else if(num/10000==1) {
			System.out.print("�� ");
		}
		

		int num1 = num%10000;
		if(num1/1000!=0) {
			System.out.print((num1/1000)+"õ ");
		}else if(num1/1000==1) {
			System.out.print("õ ");
		}

		int num2 = num1%1000;
		if(num2/100!=0) {
			System.out.print((num2/100)+"�� ");
		}else if(num2/100==1) {
			System.out.print("�� ");
		}
		

		int num3 = num2%100;
		if(num3/10!=0) {
			System.out.print((num3/10)+"�� ");
		}else if(num3/10==1) {
			System.out.print("�� ");
		}
		if(num3%10!=0) {
			System.out.print((num3%10));
		}


	}

}
