package javaPrograming.week9.examples;

import java.util.*;

public class printArrTest2 {
	static Random rd = new Random();

	public static void main(String[] args) {
		double c = 0;
		double[] arr = new double[10];

		initArr(arr);
		for (double x : arr) {
			System.out.printf("%.2f ", x);
		}

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					c = arr[i];
					arr[i] = arr[j];
					arr[j] = c;
				}

			}
		}
		for (double x : arr) {
			System.out.printf("%.2f ", x);
		}
	}

	static void initArr(double[] values) {
		for (int i = 0; i < values.length; i++) {
			values[i] = rd.nextDouble();
		}
	}

}
