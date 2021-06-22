package javaPrograming.HomeWork;

import java.util.*;

public class ElevatorTest {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Elevator el = new Elevator();
		int input;
		while (true) {
			System.out.printf("몇층으로 갈까요?");
			input = sc.nextInt();
			while (true) {
				if (input == el.floor) {
					System.out.printf("같은 층으로는 갈 수 없습니다.\n 몇층으로 갈까요?");
					input = sc.nextInt();
				} else {
					break;
				}

			}
			// 451을 입력하면 종료.
			if (input == 451) {
				System.out.println("ElevatorTest 종료.");
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
		System.out.println("문이 열립니다.");
		Thread.sleep(300);
	}

	public void close() throws Exception {
		System.out.println("문이 닫힙니다.");
		Thread.sleep(300);
	}

	public void move(int input) throws Exception {

		if (input < 0) {
			System.out.printf("지하 %d층으로 이동합니다.\n", Math.abs(input));

		} else if (input == 0) {
			System.out.println("로비로 이동합니다.");

		} else {
			System.out.printf("%d층으로 이동합니다.\n", input);
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
			System.out.printf("지하%d층입니다.\n", Math.abs(input));
			Thread.sleep(500);
		} else if (input > 0) {
			System.out.printf("%d층입니다.\n", input);
			Thread.sleep(500);
		} else {
			System.out.println("로비입니다");
			Thread.sleep(500);
		}

		floor = input;
	}
}
