package javaPrograming.week8.midterm.week5;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���� :");
		char c = sc.next().charAt(0);

		System.out.print(c + " ");
		if (Character.isUpperCase(c) == true) {
			System.out.print("�빮��");
		} else if (Character.isLowerCase(c) == true) {
			System.out.print("�ҹ���");
		} else if (Character.isDigit(c) == true) {
			System.out.print("����");
		} else {
			System.out.print("��Ÿ����");
		}
	}

}
