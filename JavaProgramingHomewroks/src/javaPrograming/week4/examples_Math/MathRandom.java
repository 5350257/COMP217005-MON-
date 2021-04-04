package javaPrograming.week4.examples_Math;

//Java.lang.Math;
//Java.lang.String;
//Java.lang. 패키지의 클래스들은 import하지 않아도 무방

public class MathRandom {

	public static void main(String[] args) {

		/* 0이상 1 미만 실수형 난수 생성 */
		System.out.println("0이상 10미만 실수형 난수 생성: " + Math.random());

		/* 150이상 200미만 실수형 난수 생성 */
		System.out.println("150이상 200미만 실수형 난수 생성: " + (150 + 50 * Math.random()));

		/* 0이상 9이하의 정수형 난수 */
		int num = (int) (Math.random() * 10);
		System.out.println("0이상 9이하의 정수형 난수 :" + num);

		/* 20이상 39이하의 정수형 난수 */
		num = (int) (20 + Math.random() * 20);
		System.out.println("0이상 9이하의 정수형 난수 :" + num);

		/* -3이상 3이하 정수형 난수 */
		num = (int) (-3 + Math.random() * 7);
		System.out.println("0이상 9이하의 정수형 난수 :" + num);

	}
}