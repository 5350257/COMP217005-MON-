package javaPrograming.week8.midterm.week4;

import java.util.*;

public class Exercise2 {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� : ");
		String kind = sc.nextLine();
		
		System.out.print("�� �� : ");
		int score = sc.nextInt();
		
		if(kind.equals("1��")) {
			if(score>=70) {
				System.out.println("�հ�");
			}else {
				System.out.println("���հ�");
			}
		}else if(kind.equals("2��")) {
			if(score>=60) {
				System.out.println("�հ�");
			}else {
				System.out.println("���հ�");
			}
		}else {
			System.out.println("ERROR : ��������� 1���� 2���� �����Ѵ�. �ٽ��Է�..");
		}
		
		System.out.println("abc".equals("abc"));		   //ture
		System.out.println("abc".equals("aBC")); 		   //false
		System.out.println("abc".equalsIgnoreCase("aBC")); //true
	}
}
