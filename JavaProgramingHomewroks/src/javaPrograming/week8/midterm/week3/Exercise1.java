package javaPrograming.week8.midterm.week3;

import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int a = sc.nextInt();

		System.out.println("�Է¹��� ������ 2���� ǥ�� : " + Integer.toBinaryString(a));
//		>> , >>> �� �� �� ��Ʈ �̵� �����ڴ�. �׷��� >>>���� ��� �ֻ��� ��Ʈ�� 1�̵� 0�̵� ���� ���� ������ 0���� �ֻ��� ��Ʈ�� ä���.
		if(a!=0) {
			if (a >>> 31 == 0) {
				System.out.printf("%d��(��) ����Դϴ�. �� ���� ������ %d�̰�, %d/4�� %d�̸�, �������� %d�Դϴ�.",a,Math.abs(a),a,a/4,a%4);
			}else {
				System.out.printf("%d��(��) �����Դϴ�. �� ���� ������ %d�̰�, %d/4�� %d�̸�, �������� %d�Դϴ�.",a,Math.abs(a),Math.abs(a),(Math.abs(a))/4,(Math.abs(a))%4);
			}
		}else {System.out.println("a�� 0�̴�. 0�� ���� ������, ���� ������ �ƴϴ�. 0�� 0. ");}
		
	}
}
