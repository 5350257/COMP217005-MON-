package javaPrograming.week4.examples_ifs;

import java.util.*;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temp = sc.nextDouble();
		// 32도 이상 시 폭염주의 출력

		if (temp > 32) {
			System.out.println("온도 " + temp + " 폭염주의");
		} else {
			System.out.println("온도 " + temp + " 양호");
		}
		sc.close();
	}
}