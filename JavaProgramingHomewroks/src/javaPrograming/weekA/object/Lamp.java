package javaPrograming.weekA.object;

public class Lamp {
	boolean power;
	int bright;
	// �ʱ�ȭ���� �ʾƵ� �ڷ����� �´� 0���� �ʱ�ȭ.

	public void turnOn() {
		power = true;
		System.out.println("������ �������ϴ�.");
	}

	public void turnOff() {
		power = false;
		System.out.println("������ �������ϴ�.");
	}

	public void lightUp() {
		if (power == true) {
			if (bright < 10) {
				bright++;
				System.out.println("�Ѵܰ� ��������ϴ�.");
				System.out.printf("���� ���� %d�Դϴ�.\n", bright);
			} else {
				System.out.println("�� �̻� ��� �� �� �����ϴ�.");
			}
		} else {
			System.out.println("�����̳� �Ѷ�");
		}

	}

	public void lightDown() {
		if (power == true) {
			if (bright < 10 && bright > 0) {
				bright--;
				System.out.println("�Ѵܰ� ��ο������ϴ�.");
				System.out.printf("���� ���� %d�Դϴ�.\n", bright);
			} else {
				System.out.println("�� �̻� ��ο� �� �� �����ϴ�.");
			}
		} else {
			System.out.println("�����̳� �Ѷ�");
		}
	}

}
