package javaPrograming.week8.midterm.week6;

import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����");
		String line = sc.nextLine();
		System.out.println("ã�� ��");
		String word = sc.next();

		int lineL = line.length();
		int wordL = word.length();
		int blank = 0;
		int count = 0;
		for (int i = 0; i <= lineL - wordL; i++) {
			if (line.charAt(i) == ' ')
				blank++;
			if (word.equals(line.substring(i, i + wordL))) {
				count++;
				System.out.printf("%d��°, ", blank+1);
			}
		}
		System.out.printf("�������� %s�� �˻��Ǿ�, �� %dȸ �˻� �Ǿ����ϴ�.",word,count);
	}
}
