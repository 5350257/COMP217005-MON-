package javaPrograming.weekA.array;

import java.util.*;

public class ArrayMethodExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] arr;

		System.out.print("배열 성분 개수 : ");
		int size = sc.nextInt();
		arr = new double[size];
		sc.close();

		initArr(arr);
		printArr(arr);
		System.out.println(sumArr(arr));
		System.out.println(maxArr(arr));
		System.out.println(indexMaxArr(arr));
		System.out.println("셔플 후 배열 성분");
		shiftArr(arr);
		printArr(arr);
		System.out.println("오른쪽으로 한칸 이동 후 배열 성분");
		rotateR1Arr(arr);
		printArr(arr);
		rotateRightRn(arr, 12);
		System.out.println("오른쪽으로 12칸 이동 후 배열 성분");
		printArr(arr);
		rotateL1Arr(arr);
		System.out.println("왼쪽으로 한칸 이동 후 배열 성분");
		printArr(arr);
		rotateLeftRn(arr, 12);
		System.out.println("왼쪽으로 12칸 이동 후 배열 성분");
		printArr(arr);
	}

	static Random rn = new Random();

	static void initArr(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rn.nextDouble() * 10;
		}
	}

	static void printArr(double[] arr) {
		for (double x : arr) {
			System.out.printf("%.2f  ", x);
		}
		System.out.println();
	}

	static double sumArr(double[] arr) {
		double sum = 0;

		for (double x : arr) {
			sum += x;
		}
		return sum;
	}

	static double maxArr(double[] arr) {
		double max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	static int indexMaxArr(double[] arr) {
		int index = 0;
		double max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		return index;
	}

	static void shiftArr(double[] arr) {
		int r = 0;
		double c = 0;
		for (int i = 0; i < arr.length; i++) {
			r = rn.nextInt(arr.length);
			c = arr[i];
			arr[i] = arr[r];
			arr[r] = c;
		}
	}

	static void rotateR1Arr(double[] arr) {
		double c = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = c;
	}

	static void rotateRightRn(double[] arr, int n) {
		n %= arr.length;
		for (int i = 0; i < n; i++) {
			rotateR1Arr(arr);
		}
	}

	static void rotateL1Arr(double[] arr) {
		double c = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = c;
	}

	static void rotateLeftRn(double[] arr, int n) {
		n %= arr.length;
		for (int i = 0; i < n; i++) {
			rotateL1Arr(arr);
		}
	}
}
