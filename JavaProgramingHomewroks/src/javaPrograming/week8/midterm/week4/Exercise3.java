package javaPrograming.week8.midterm.week4;

import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {

		Random random = new Random();

		int diceNum = random.nextInt(6) + 1;

		switch (diceNum) {

		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("��");
			break;
		case 5:
			System.out.println("��");
			break;
		case 6:
			System.out.println("��");
			break;
		}
	}

}
