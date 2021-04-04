package javaPrograming.week4.examples_Math;

//Java.lang.Math;
//Java.lang.String;
//Java.lang. ��Ű���� Ŭ�������� import ���� �ʾƵ� ����

public class MathCalculator {
	public static void main(String[] args) {

		int a, b;
		a = 4;
		b = 5;

		System.out.println("������ a : " + Math.sqrt(a));

		System.out.println(" a^b : " + Math.pow(a, b));

		System.out.println("Math.cos(90) : " + Math.cos(90.0));
		System.out.println("Math.sin(180) : " + Math.sin(180.0));
		System.out.println("Math.cos(Math.PI/2) : " + Math.cos(Math.PI / 2));
		System.out.println("Math.sin(Math.PI) : " + Math.sin(Math.PI));

		int r = 10;

		double circleArea = Math.PI * Math.pow(r, 2);

		System.out.printf("������ : %.2f\n", circleArea);
		System.out.println("������ : " + (int) circleArea);

	}
}