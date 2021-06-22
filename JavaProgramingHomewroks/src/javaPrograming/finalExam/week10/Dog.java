package javaPrograming.finalExam.week10;

import java.util.Random;

public class Dog {
	Random r = new Random();
	private String name = "�ǻ�";
	private int hunger = r.nextInt(11); // 0~10����

	public void eat(int food) {
		if (food < 0) {
			System.out.println("�峭 ����!");
		} else if (food + hunger < 10) {
			System.out.println("�߸Ծ���.");
			hunger += food;
		} else {
			System.out.println("����");
			hunger = 10;
		}
	}

	public void play() {
		System.out.println("��. ��մ�..");
	}

	public int getHunger() {
		return hunger;
	}

	public void setName(String name) {
		if (name.length() <= 6) {
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

}
