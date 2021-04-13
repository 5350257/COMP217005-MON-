package javaPrograming.week6.examples;

import java.util.*;

public class SubstringExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		System.out.print("���ڿ� : ");
		String s = sc.nextLine();

		while (true) {
			System.out.print("a :");
			a = sc.nextInt();
			if (a > s.length() || a <= 0) {
				System.out.println("[�Է¿���] a�� ���ڿ��� ���� ������ ���� ������ ��ȿ�մϴ�.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("b :");
			b = sc.nextInt();
			if (b > s.length() || b <= 0) {
				System.out.println("[�Է¿���] b�� ���ڿ��� ���� ������ ���� ������ ��ȿ�մϴ�.");
			} else {
				break;
			}
		}
		if (a > b) { // ab ��ȯ �ڵ�
			int c = a;
			a = b;
			b = c;
		}
		System.out.printf("�Է��� ���ڿ� \"%s\"���� %d���� %d���� ������ ���ڿ��� \"%s\"�Դϴ�.", s, a, b, s.substring(a - 1, b));
	}
}

/*
import java.util.Scanner;

class SubstringTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String st;
		int a, b, tmp;
		
		System.out.print("���ڿ�: ");
		st = s.nextLine();
		
		while(true){
			System.out.print("a: ");
			a = s.nextInt();
			if(a>0 && a<=st.length())
				break;
			else
				System.out.println("[�Է¿���]a�� ���ڿ� ���� ������ ����� �����մϴ�. ");
		}
		
		while(true){
			System.out.print("b: ");
			b = s.nextInt();
			if(b>0 && b<=st.length())
				break;
			else
				System.out.println("[�Է¿���]b�� ���ڿ� ���� ������ ����� �����մϴ�. ");
		}
		if(a>b){
			//a, b ��ȯ �ڵ� 
			tmp = a; //tmp = 5
			a = b; //a = 1
			b = tmp; //b = 5
		}
		
		
		
		System.out.printf("�Է��� ���ڿ� \"%s\"���� %d ���� %d���� ������ ���ڿ��� \"%s\"�Դϴ�.\n", st, a, b, st.substring(a-1, b));
		
	}
}

 */