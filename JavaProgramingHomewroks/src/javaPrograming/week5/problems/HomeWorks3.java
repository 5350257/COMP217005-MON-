package javaPrograming.week5.problems;

import java.util.*;

public class HomeWorks3 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int dap = rd.nextInt(101) - 50;
		System.out.print("맞춰봐라 : ");
		int userInput = sc.nextInt();
		boolean run = true;
		int i = 1;
		while (run) {

			if (dap > userInput) {
				i++;
				System.out.println("더 크게");
				System.out.print("예측값 : ");
				userInput = sc.nextInt();
			} else if (dap < userInput) {
				i++;
				System.out.println("더 작게");
				System.out.print("예측값 : ");
				userInput = sc.nextInt();
			} else {
				System.out.printf("총 %d회만에 맞췄다!. dap은 %d이다.", i, dap);
				run = false;
				sc.close();
			}
		}
	}
}