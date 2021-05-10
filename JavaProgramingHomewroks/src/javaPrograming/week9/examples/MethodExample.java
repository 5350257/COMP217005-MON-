package javaPrograming.week9.examples;

public class MethodExample {

	public static void main(String[] args) {

		System.out.println(sumTwo(3, 5));
		System.out.println(returnMax(2, 5, 100));

		printSumThree(1, 20, 55);

		int[][] array = { { 10, 7, 9 }, { 4, 8, 7 }, { 5, 4, 1 }, { 23, 4, 8 } };
		printArrayEl(array);

	}

	static int sumTwo(int a, int b) {
		return a + b;
	}

	static double returnMax(double a, double b, double c) {

		double max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		return max;
	}

	static void printSumThree(double a, double b, double c) {
		double result = a + b + c;
		System.out.println("합 : " + result);

	}

	// 정수형 2차원배열의 모든 성분 출력
	static void printArrayEl(int[][] values) {
		for (int i = 0; i < values.length; i++) {
			for (int x : values[i]) {
				System.out.print(x + " ");
			}
			System.out.println();

		}
	}
}