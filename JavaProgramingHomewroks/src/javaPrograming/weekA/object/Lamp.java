package javaPrograming.weekA.object;

public class Lamp {
	boolean power;
	int bright;
	// 초기화하지 않아도 자료형에 맞는 0으로 초기화.

	public void turnOn() {
		power = true;
		System.out.println("램프가 켜졌습니다.");
	}

	public void turnOff() {
		power = false;
		System.out.println("램프가 꺼졌습니다.");
	}

	public void lightUp() {
		if (power == true) {
			if (bright < 10) {
				bright++;
				System.out.println("한단계 밝아졌습니다.");
				System.out.printf("현재 밝기는 %d입니다.\n", bright);
			} else {
				System.out.println("더 이상 밝아 질 수 없습니다.");
			}
		} else {
			System.out.println("전원이나 켜라");
		}

	}

	public void lightDown() {
		if (power == true) {
			if (bright < 10 && bright > 0) {
				bright--;
				System.out.println("한단계 어두워졌습니다.");
				System.out.printf("현재 밝기는 %d입니다.\n", bright);
			} else {
				System.out.println("더 이상 어두워 질 수 없습니다.");
			}
		} else {
			System.out.println("전원이나 켜라");
		}
	}

}
