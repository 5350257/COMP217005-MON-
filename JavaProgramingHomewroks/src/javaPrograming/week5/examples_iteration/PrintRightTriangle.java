package javaPrograming.week5.examples_iteration;

import java.util.*;

public class PrintRightTriangle {

	public static void main(String[] args) {
		//�������� ���� ���� ������ �ٷ� ����� �������� ���� �Է¹��� ������ ����ϰ� �������.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� : ");
		int length = sc.nextInt();
		
		for(int l = 1; l<=length; l++) {
			for(int i = 0; i<l;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int l = 1; l<=length; l++) {
			
			for(int k = length; k>l;k--) {
				System.out.print(" ");
			}
			for(int i = 1; i<=l;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
