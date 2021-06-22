package javaPrograming.HomeWork;

import java.util.*;

public class ReservationTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Theater th = new Theater();
		th.makeSeats();
		String row;
		int col;
		String input;
		int temp;

		while (true) {
			th.showSeat();
			System.out.print("�����Ͻðڽ��ϱ�?(Y,y/N,n)?");
			input = sc.next();

			if (input.equalsIgnoreCase("n")) {
				System.out.println("�������α׷��� �����մϴ�.");
				System.exit(0);
			} else if (input.equalsIgnoreCase("y")) {
				th.run = true;
				while (th.run) {
					System.out.print("�� ��? ");
					row = sc.next();
					temp = (int) (row.charAt(0)) - 97;
					System.out.print("�� ��? ");
					col = sc.nextInt() - 1;
					th.reservation(temp, col);

				}
			}else {
				System.out.println("(Y,y/N,n)�� �Է�.");
			}

		}

	}

}

class Theater {
	static Random rn = new Random();
	static String seat[][] = new String[10][10];
	String ox[] = { "X", " " };
	static boolean run = true;

	public void makeSeats() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				seat[i][j] = ox[rn.nextInt(2)];
			}
		}

	}

	public void showSeat() {
		System.out.print(" ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%3d", i + 1);
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print((char) (97 + i) + "  ");
			for (int j = 0; j < 10; j++) {
				System.out.print(seat[i][j]);
				System.out.print("  ");
			}
			System.out.println();
		}

	}

	public void reservation(int row, int col) {
		if (seat[row][col].equals("X")) {
			System.out.println("�̹� ����� �¼��Դϴ�. �ٸ� �¼��� �����ϼ���");

		} else {
			System.out.printf("%c�� %d�� ���࿡ �����Ͽ����ϴ�.\n", (char) (row + 97), col + 1);
			seat[row][col] = "X";
			run = false;
		}

	}
}
