package javaPrograming.week4.examples_caseif;

import java.util.*;

public class WeekConverterVer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� (�� :0, ȭ :1. .... ��:6) : ");
		int num = sc.nextInt();
		System.out.print("x: ");
		int x = sc.nextInt();
		int result = (num + x) % 7;
		;

		switch (result) {
		case 0:
			System.out.println(x + "�� �Ĵ� �������Դϴ�");
			break;

		case 1:
			System.out.println(x + "�� �Ĵ� ȭ�����Դϴ�");
			break;

		case 2:
			System.out.println(x + "�� �Ĵ� �������Դϴ�");
			break;

		case 3:
			System.out.println(x + "�� �Ĵ� ������Դϴ�");
			break;

		case 4:
			System.out.println(x + "�� �Ĵ� �ݿ����Դϴ�");
			break;

		case 5:
			System.out.println(x + "�� �Ĵ� ������Դϴ�");
			break;

		case 6:
			System.out.println(x + "�� �Ĵ� �Ͽ����Դϴ�");
			break;
		}

	}
}