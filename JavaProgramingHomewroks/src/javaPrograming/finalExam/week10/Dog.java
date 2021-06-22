package javaPrograming.finalExam.week10;

import java.util.Random;

public class Dog {
	Random r = new Random();
	private String name = "»Ç»Ç";
	private int hunger = r.nextInt(11); // 0~10Á¤¼ö

	public void eat(int food) {
		if (food < 0) {
			System.out.println("Àå³­ ¸ØÃç!");
		} else if (food + hunger < 10) {
			System.out.println("Àß¸Ô¾ú´Ù.");
			hunger += food;
		} else {
			System.out.println("°ú½Ä");
			hunger = 10;
		}
	}

	public void play() {
		System.out.println("Âü. Àç¹Õ´Ù..");
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
