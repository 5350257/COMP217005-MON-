package javaPrograming.week5.examples_iteration;

import java.util.*;

public class PrintStringCtrlX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String s = sc.nextLine();
		
		System.out.print("a : ");
		int a = sc.nextInt();
		
		while(s.length()<a || a<1 ) {
			System.out.println("[�Է¿���] a�� ���ڿ��� ���� ������ ���� ������ ��ȿ�մϴ�.");
			System.out.print("a : ");
			a = sc.nextInt();
		}
		
		System.out.print("b : ");
		int b = sc.nextInt();
		
		while(s.length()<b || b<1) {
			System.out.println("[�Է¿���] b�� ���ڿ��� ���� ������ ���� ������ ��ȿ�մϴ�.");
			System.out.print("b : ");
			b = sc.nextInt();
		}
		
		String cs = s.substring(a-1, b);
		
		System.out.printf("�Է��� ���ڿ�" + "\""+"%s"+"\""+"���� %d���� %d���� ������ ���ڴ�" + "\""+"%s" + "\""+ "�Դϴ�.",s,a,b,cs);
	}

}
