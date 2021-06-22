package javaPrograming.finalExam.week10;

import java.util.*;

// �迭�� ��������, �������� �����ϱ�
public class ArraySort {
	static Scanner sc = new Scanner(System.in);
	static Random rn = new Random();

	public static void main(String[] args) {

		System.out.print("�迭�� ���� : ");
		int n = sc.nextInt();
		int array[] = new int[n];
		creatArray(array);
		printArray(array);
		
		sortUpArray(array);
		printArray(array);
		
		sortDownArray(array);
		printArray(array);

	}

	// �迭 ���е鿡 ���� �Է� �޼ҵ�
	static void creatArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(100);
		}

	}

	// �迭 ���� ��� �޼ҵ�
	static void printArray(int array[]) {
		for (int x : array) {
			System.out.print(x + " ");

		}
		System.out.println();
	}

	// �迭�� ���е� ������������ �����
	static void sortUpArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
	}
	// �迭�� ���е� ������������ �����
	static void sortDownArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}

	}

}
