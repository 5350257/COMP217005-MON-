package javaPrograming.week4.examples_ifs;

import java.util.*;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� : ");
		int score = sc.nextInt();

		/*
		 * 60 �̻��̶�� �հ�
		 * 
		 * if(score>=60){ System.out.println("�հ�"); }else{ System.out.println("���հ�"); }
		 */

		// 90�̻� A, 80�̻� B, 70�̻� C
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("B");
		} else {
			System.out.println("Ż��");
		}
		/* else if (80<=score && score<90) �̰ŵ� �Ǳ� �ȴ�. �ٵ� �Ⱦ��� */
		sc.close();
	}
}