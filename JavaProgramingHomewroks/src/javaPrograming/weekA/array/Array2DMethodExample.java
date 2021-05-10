package javaPrograming.weekA.array;

import java.util.*;

public class Array2DMethodExample {

	static Scanner sc = new Scanner(System.in);
	static Random rn = new Random();

	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		initArr(arr);
		printArr(arr);
		System.out.println("배열 성분들의 총 합");
		System.out.println(sumArr(arr));
		System.out.println("행 합의 최대값");
		System.out.println(rowSumMaxArr(arr));
		shuffleArr(arr);
		System.out.println("섞고 출력");
		printArr(arr);
		System.out.println("배열의 열 별 합");
		for (int x : colSumArr(arr)) {
			System.out.printf(x + "  ");
		}
		System.out.println();
		System.out.println("배열 성분의 최대값의 인댁스");
		for (int x : indexMaxArr(arr)) {
			System.out.printf(x+1 + "  ");
		}
		System.out.println();

	}

	static void initArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d행 %d열 성분 : ", i + 1, j + 1);
				arr[i][j] = sc.nextInt();
			}
		}
	}

	static void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}

	static int sumArr(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	static int rowSumMaxArr(int[][] arr) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			if (maxSum < sum) {
				maxSum = sum;
			}
			sum = 0;
		}
		return maxSum;
	}

	static void shuffleArr(int[][] arr) {
		int tem, r, c;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				r = rn.nextInt(arr.length);
				c = rn.nextInt(arr[i].length);
				tem = arr[i][j];
				arr[i][j] = arr[r][c];
				arr[r][c] = tem;
			}
		}
	}

	static int[] colSumArr(int[][] arr) {
		int[] sum = new int[arr[0].length];

		for (int i = 0; i < arr[i].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				sum[i] += arr[j][i];
			}
		}
		return sum;
	}

	static int[] indexMaxArr(int[][] arr) {
		int max = arr[0][0];
		int[] index = { 0, 0 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
					index[0] = i;
					index[1] = j;
				}
			}
		}
		return index;
	}
}
