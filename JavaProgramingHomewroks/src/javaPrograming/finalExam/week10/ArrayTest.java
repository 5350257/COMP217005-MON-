package javaPrograming.finalExam.week10;

import java.util.*;

public class ArrayTest {
	static Scanner sc = new Scanner(System.in);
	static Random rn = new Random();

	public static void main(String[] args) {
		System.out.println("�迭�� ���� ���� : 8");
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
		System.out.println("���������� 1");
		rotateRight(arr);
		print(arr);
		System.out.println("�������� 1");
		rotateLeft(arr);
		print(arr);
		rotateRightNth(arr,5);
		print(arr);
		rotateLeftNth(arr,2);
		print(arr);
	}

	// �迭�� ���е� 0�̻� 10�̸��� ������ �ʱ�ȭ
	static void initArr(double arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rn.nextDouble()*10;
		}
	}

	// �迭 ���
	static void print(double arr[]) {
		for (double n : arr) {
			System.out.printf("%.2f ", n);
		}
		System.out.println();
	}

	// �迭�� ���е��� ��
	static double sumArr(double arr[]) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// �迭�� �ִ��� ��ȯ
	static double maxArr(double arr[]) {
		double max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	// �迭�� �ִ��� �ε��� ��ȯ
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

	// �迭�� �������� ���ġ
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

	// �迭�� ������ ������ ���������� ��ĭ �ű��
	static void rotateRight(double arr[]) {
		double temp = arr[arr.length - 1];
		for (int i = arr.length-1; i >= 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
	}

	// �迭�� ������ ������ ���������� nĭ �ű��
	static void rotateRightNth(double arr[], int n) {
		for (int i = 1; i <= n; i++) {
			rotateRight(arr);
		}
	}

	// �迭�� ������ ������ �������� ��ĭ �ű��
	static void rotateLeft(double arr[]) {
		double temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp;
	}

	// �迭�� ������ ������ �������� nĭ �ű��
	static void rotateLeftNth(double arr[], int n) {
		for (int i = 1; i <= n; i++) {
			rotateLeft(arr);
		}
	}

}
