package javaPrograming.week4.examples_Math;

//Java.lang.Math;
//Java.lang.String;
//Java.lang. 패키지의 클래스들은 import 하지 않아도 무방

public class MathCalculator {
	public static void main(String[] args) {

		int a, b;
		a = 4;
		b = 5;

		System.out.println("제곱근 a : " + Math.sqrt(a));

		System.out.println(" a^b : " + Math.pow(a, b));

		System.out.println("Math.cos(90) : " + Math.cos(90.0));
		System.out.println("Math.sin(180) : " + Math.sin(180.0));
		System.out.println("Math.cos(Math.PI/2) : " + Math.cos(Math.PI / 2));
		System.out.println("Math.sin(Math.PI) : " + Math.sin(Math.PI));

		int r = 10;

		double circleArea = Math.PI * Math.pow(r, 2);

		System.out.printf("원넓이 : %.2f\n", circleArea);
		System.out.println("원넓이 : " + (int) circleArea);

	}
}