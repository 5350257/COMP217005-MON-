package javaPrograming.week4.examples_caseif;

import java.util.*;

public class WeekConverter{
	public static void main (String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� (�� :0, ȭ :1. .... ��:6)");
		int num = sc.nextInt();
		
		System.out.print("x: ");
		int x = sc.nextInt();
		
	System.out.printf("%d���� ���Ĵ� %d�����Դϴ�.",x,(num+x)%7);
	}
}