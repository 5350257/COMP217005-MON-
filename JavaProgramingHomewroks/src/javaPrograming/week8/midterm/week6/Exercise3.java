package javaPrograming.week8.midterm.week6;

import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String type;
		int line;
		int a;
		int b;
		int re;
		int line2;

		while (true) {
			System.out.print("���� Ÿ��: ");
			type = sc.nextLine();
			if (type.equals("�Ƕ�̵�") || type.equals("�簢��") || type.equals("���̾�")) {
				break;
			}
			System.out.println("[�Է¿���] ������ Ÿ���� ~~�̴�.");

		}
		switch (type) {
		case "�Ƕ�̵�":
			while (true) {
				System.out.print("���� ��: ");
				line = sc.nextInt();
				if (line <= 10 && line > 0) {
					break;
				}
				System.out.println("[�Է¿���] 0<����<=10 ~~�̴�.");
			}
			for (int i = 1; i <= line; i++) {
				for (int k = 0; line-i > k; k++)
					System.out.print(" ");
				for (int j = i - 1; j >= 0; j--)
					System.out.print(j);
				for (int j = 1; j < i; j++)
					System.out.print(j);
				System.out.println();
			}
			break;
			
		case "�簢��":
			while (true) {
				System.out.print("����: ");
				a = sc.nextInt();
				if (a > 0) {
					break;
				}
				System.out.println("[�Է¿���] a>0");
			}
			while (true) {
				System.out.print("����: ");
				b = sc.nextInt();
				if (b > 0) {
					break;
				}
				System.out.println("[�Է¿���] b>0");
			}
			while (true) {
				System.out.print("�ݺ�: ");
				re = sc.nextInt();
				if (re >= 0) {
					break;
				}
				System.out.println("[�Է¿���] re>=0");
			}
			for (int k = 1; k <= b; k++) {
				for (int i = 1; i <= re; i++) {
					for (int j = 1; j <= a; j++) {
						System.out.print("*");
					}
					System.out.print(" ");
				}
				System.out.println();
			}
			break;
			
		case "���̾�":
			while (true) {
				System.out.print("���� ��: ");
				line2 = sc.nextInt();
				if (line2 % 2 != 0 && line2 > 0) {
					break;
				}
				System.out.println("[�Է¿���] ���� �� >0,= Ȧ��");
				break;
			}
			for(int i=1;i<=(line2/2)+1;i++) {
				for(int k=(line2/2)+1;k>=i;k--)
					System.out.print(" ");
				for(int j=1;j<2*i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int i=1;i<=(line2/2)+1;i++) {
				for(int j=0;j<=i;j++)
					System.out.print(" ");
				for(int k=0;k<line2-2*i;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			break;
		}
	}

}
