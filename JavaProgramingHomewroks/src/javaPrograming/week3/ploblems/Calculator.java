package javaPrograming.week3.ploblems;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����:");
		int a = sc.nextInt();
		
//		System.out.println(toBinaryString(a));
		
		if(a>>>31==0) {
			System.out.printf("%d��(��) ����Դϴ�. �� ���� ������ %d�̰�,\n\t������ 4�� ���� ���� %d�̰�,\n\t\t�������� %d�Դϴ�.",a,a,a/4,a%4);
		}else {
			int b=-a;
			System.out.printf("%d��(��) �����Դϴ�. �� ���� ������ %d�̰�,\n\t������ 4�� ���� ���� %d�̰�,\n\t\t�������� %d�Դϴ�.",a,b,b/4,b%4);
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
