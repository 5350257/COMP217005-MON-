package javaPrograming.week4.examples;

import java.util.*;

public class TernaryOperator{
public static void main (String [] args){
	
	int a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("���� �� ���� �Է�");
	a = sc.nextInt();
	b = sc.nextInt();
	
	System.out.printf("�ִ� ���� %d�̸�, %s",(a>b?a:b),(a>b?"�ִ밪�� ���� �� �Դϴ�.":"�ִ밪�� ���� �� �Դϴ�."));
}
}