package javaPrograming.finalExam.week10;

import java.util.*;

public class ArrayTest {
	static Scanner sc = new Scanner(System.in);
	static Random rn = new Random();

	public static void main(String[] args) {
		System.out.println("배열의 원소 개수 : 8");
		/*
		 * int n = sc.nextInt(); n = 8
		 */
		double arr[] = new double[8];
		initArr(arr);
		print(arr);
		System.out.println(sumArr(arr));
		System.out.printf("%.2f\n",maxArr(arr));
		System.out.println(maxIndexArr(arr));
		shuffleArr(arr);
		print(arr);
		System.out.println("오른쪽으로 1");
		rotateRight(arr);
		print(arr);
		System.out.println("왼쪽으로 1");
		rotateLeft(arr);
		print(arr);
		rotateRightNth(arr,5);
		print(arr);
		rotateLeftNth(arr,2);
		print(arr);
	}

	// 배열의 성분들 0이상 10미만의 난수로 초기화
	static void initArr(double arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rn.nextDouble()*10;
		}
	}

	// 배열 출력
	static void print(double arr[]) {
		for (double n : arr) {
			System.out.printf("%.2f ", n);
		}
		System.out.println();
	}

	// 배열의 성분들의 합
	static double sumArr(double arr[]) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// 배열의 최댓값을 반환
	static double maxArr(double arr[]) {
		double max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	// 배열의 최댓값의 인덱스 반환
	static int maxIndexArr(double arr[]) {
		double max = arr[0];
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		return index;
	}

	// 배열을 랜덤으로 재배치
	static void shuffleArr(double arr[]) {
		for (int i = 0; i < arr.length; i++) {
			double temp = arr[i];
			int x= rn.nextInt(arr.length);
			if(i!=x) {
			arr[i] = arr[x];
			arr[x] = temp;
			}
		}
	}

	// 배열의 성분의 순서를 오른쪽으로 한칸 옮기기
	static void rotateRight(double arr[]) {
		double temp = arr[arr.length - 1];
		for (int i = arr.length-1; i >= 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
	}

	// 배열의 성분의 순서를 오른쪽으로 n칸 옮기기
	static void rotateRightNth(double arr[], int n) {
		for (int i = 1; i <= n; i++) {
			rotateRight(arr);
		}
	}

	// 배열의 성분의 순서를 왼쪽으로 한칸 옮기기
	static void rotateLeft(double arr[]) {
		double temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp;
	}

	// 배열의 성분의 순서를 왼쪽으로 n칸 옮기기
	static void rotateLeftNth(double arr[], int n) {
		for (int i = 1; i <= n; i++) {
			rotateLeft(arr);
		}
	}

}
