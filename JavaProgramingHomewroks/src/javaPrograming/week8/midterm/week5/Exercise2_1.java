package javaPrograming.week8.midterm.week5;

import java.util.*;

public class Exercise2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� : ");
		String s = sc.nextLine();
		int a = 0;
		while (true) {
			System.out.print("a : ");
			a = sc.nextInt();
			if (a <= s.length() && a >= 1) {
				break;
			}
			System.out.println("[�Է¿���] a�� ���ڿ��� ���� ������ ���� ������ ��ȿ�մϴ�.");
		}

		int b = 0;
		while (true) {
			System.out.print("b : ");
			b = sc.nextInt();
			if (b <= s.length() && b >= 1) {
				break;
			}
			System.out.println("[�Է¿���] b�� ���ڿ��� ���� ������ ���� ������ ��ȿ�մϴ�.");
		}
		
		if(a>b) {
			int c =a;
			a=b;
			b=c;
		}
		String sub = s.substring(a-1,b);
		
		System.out.printf("�Է��� ���ڿ�" + "\""+"%s"+"\""+"���� %d���� %d���� ������ ���ڴ�" + "\""+"%s" + "\""+ "�Դϴ�.",s,a,b,sub);
	}

}
