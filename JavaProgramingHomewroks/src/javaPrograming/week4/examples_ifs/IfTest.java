package javaPrograming.week4.examples_ifs;

import java.util.*;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temp = sc.nextDouble();
		// 32�� �̻� �� �������� ���

		if (temp > 32) {
			System.out.println("�µ� " + temp + " ��������");
		} else {
			System.out.println("�µ� " + temp + " ��ȣ");
		}
		sc.close();
	}
}