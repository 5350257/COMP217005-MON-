package javaPrograming.week4.examples;

import java.util.*;

public class ConversorTemperatura{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("ȭ�� �µ� �Է� : ");
		int F = sc.nextInt();
		
		double C = 5.0/9*(F-32);
		
		System.out.printf("ȭ�� %d�� ���� %f��.",F,C);
		
		
	}
}