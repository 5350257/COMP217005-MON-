package javaPrograming.week5.examples;

import java.util.*;

public class FindChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� : ");
		String s = sc.nextLine();
		System.out.print("x : ");
		int x = sc.nextInt();

		while (s.length() < x || x < 1) {

			System.out.println("[�Է¿���] x�� ���ڿ��� ���� ������ ���� ������ ��ȿ�մϴ�.");
			System.out.print("x : ");
			x = sc.nextInt();
		}
		char o = s.charAt(x - 1);

		System.out.printf("�Է��Ͻ� ���ڿ�" + "\"" + "%s" + "\"" + "���� %d��° ���ڴ�" + "\'" + "%s" + "\'" + "�Դϴ�.", s, x, o);
	}
}