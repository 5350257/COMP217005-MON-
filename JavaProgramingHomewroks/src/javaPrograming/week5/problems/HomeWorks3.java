package javaPrograming.week5.problems;

import java.util.*;

public class HomeWorks3 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int dap = rd.nextInt(101) - 50;
		System.out.print("������� : ");
		int userInput = sc.nextInt();
		boolean run = true;
		int i = 1;
		while (run) {

			if (dap > userInput) {
				i++;
				System.out.println("�� ũ��");
				System.out.print("������ : ");
				userInput = sc.nextInt();
			} else if (dap < userInput) {
				i++;
				System.out.println("�� �۰�");
				System.out.print("������ : ");
				userInput = sc.nextInt();
			} else {
				System.out.printf("�� %dȸ���� �����!. dap�� %d�̴�.", i, dap);
				run = false;
				sc.close();
			}
		}
	}
}