package javaPrograming.week6.examples;

import java.util.*;

public class PrintArgsReverseExample {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("[�Է¿���] �ϳ��� ���ڿ��� �Է����� �ʾ� ���α׷��� �����մϴ�.");
			System.exit(1);
		} else {
			String s = args[0];

			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
		}
	}
}