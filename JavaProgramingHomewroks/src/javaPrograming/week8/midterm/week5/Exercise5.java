package javaPrograming.week8.midterm.week5;

import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int t = random.nextInt(101) - 50;
		int input = 0;
		int i = 1;

		while (true) {
			System.out.print("���� : ");
			input = sc.nextInt();
			if (input < t) {
				i++;
				System.out.println("������ �� ū ���Դϴ�. �ٽ� �õ����ּ���");
			} else if (input > t) {
				i++;
				System.out.println("������ �� ���� ���Դϴ�. �ٽ� �õ����ּ���");
			} else {

				System.out.printf("�� %dȸ���� �����.\n", i);
				sc.close();
				break;
			}
		}
	}

}
