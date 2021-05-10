package javaPrograming.week9.examples;

public class printArrTest {
	public static void main(String[] args) {
		int[][] array = { { 10, 7, 9 }, { 4, 8, 7 }, { 5, 4, 1 }, { 23, 4, 8 } };
		for (int i = 0; i < array.length; i++) {
			for (int x : array[i]) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
}
