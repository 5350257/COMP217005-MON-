package javaPrograming.week6.examples;

import java.util.*;

public class Test6Week {

	public static void main(String[] args) {
		int a, d, e, b = 0;
		String c;
		char f, g;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.printf("���ڿ� : ");
		c = s.nextLine();

		d = c.length();
		e = r.nextInt(d);
		f = c.charAt(e);

		while (true) {
			System.out.printf("���� '%c'�� ���� �߰ߵɱ��? ", f);
			a = s.nextInt();
			g = c.charAt(a - 1);
			b++;
			if (g == f)
				break;

			System.out.printf("�ƽ��׿�. ����� �ƴմϴ�.\n");
		}

		System.out.printf("�����մϴ�. %d������ ������ ���߼˽��ϴ�.", b);
	}
}