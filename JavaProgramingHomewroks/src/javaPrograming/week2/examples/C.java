package javaPrograming.week2.examples;

import java.util.Scanner;

public class C{
	public static void main (String [] args){
	
	int a,b;
	a=10;
			b=8;
	Scanner sc = new Scanner(System.in);
	
//	System.out.print("���� ���� �Է� 1 :");
//	a = sc.nextInt();
//	
//	System.out.print("���� ���� �Է� 2 :");
//	b = sc.nextInt();
//	
	System.out.println("�� ���� �� : " + (a+b));

	System.out.printf("�� ���� ��: %-+10d",(a+b));
	System.out.println();
	System.out.printf("�� ���� ��: %-#10o",(a+b));
	System.out.println();
	System.out.printf("�� ���� ��: %#010x",(a+b));
	
	}
}