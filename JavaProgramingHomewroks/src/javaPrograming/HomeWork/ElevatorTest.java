package javaPrograming.HomeWork;

import java.util.*;

public class ElevatorTest {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Elevator el = new Elevator();
		int input;
		while (true) {
			System.out.printf("�������� �����?");
			input = sc.nextInt();
			while (true) {
				if (input == el.floor) {
					System.out.printf("���� �����δ� �� �� �����ϴ�.\n �������� �����?");
					input = sc.nextInt();
				} else {
					break;
				}

			}
			// 451�� �Է��ϸ� ����.
			if (input == 451) {
				System.out.println("ElevatorTest ����.");
				break;
			} else {
				el.open();
				el.move(input);
				el.close();
			}
		}
	}

}

class Elevator {
	static int floor = 0;

	Elevator() {
	}

	public void open() throws Exception {
		System.out.println("���� �����ϴ�.");
		Thread.sleep(300);
	}

	public void close() throws Exception {
		System.out.println("���� �����ϴ�.");
		Thread.sleep(300);
	}

	public void move(int input) throws Exception {

		if (input < 0) {
			System.out.printf("���� %d������ �̵��մϴ�.\n", Math.abs(input));

		} else if (input == 0) {
			System.out.println("�κ�� �̵��մϴ�.");

		} else {
			System.out.printf("%d������ �̵��մϴ�.\n", input);
		}
		if (floor < input) {
			for (int i = 0; i <= input - floor; i++) {
				if (i + floor > 0) {
					System.out.print(i + floor + " ");
					Thread.sleep(200);
				} else if (i + floor < 0) {
					System.out.printf("B%d ", Math.abs(i + floor));
					Thread.sleep(200);
				} else {
					System.out.print("L ");
					Thread.sleep(200);
				}

			}
			System.out.println();
		} else if (floor > input) {
			for (int i = 0; i <= floor - input; i++) {
				if (floor - i > 0) {
					System.out.print(floor - i + " ");
					Thread.sleep(200);
				} else if (floor - i < 0) {
					System.out.printf("B%d ", Math.abs(floor - i));
					Thread.sleep(200);
				} else {
					System.out.print("L ");
					Thread.sleep(200);
				}

			}
			System.out.println();
		}
		if (input < 0) {
			System.out.printf("����%d���Դϴ�.\n", Math.abs(input));
			Thread.sleep(500);
		} else if (input > 0) {
			System.out.printf("%d���Դϴ�.\n", input);
			Thread.sleep(500);
		} else {
			System.out.println("�κ��Դϴ�");
			Thread.sleep(500);
		}

		floor = input;
	}
}
