package javaPrograming.finalExam.week10;

import java.util.*;

// 배열을 오름차순, 내릴차순 정렬하기
public class ArraySort {
	static Scanner sc = new Scanner(System.in);
	static Random rn = new Random();

	public static void main(String[] args) {

		System.out.print("배열의 길이 : ");
		int n = sc.nextInt();
		int array[] = new int[n];
		creatArray(array);
		printArray(array);
		
		sortUpArray(array);
		printArray(array);
		
		sortDownArray(array);
		printArray(array);

	}

	// 배열 성분들에 난수 입력 메소드
	static void creatArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(100);
		}

	}

	// 배열 성분 출력 메소드
	static void printArray(int array[]) {
		for (int x : array) {
			System.out.print(x + " ");

		}
		System.out.println();
	}

	// 배열의 성분들 오름차순으로 만들기
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
	// 배열의 성분들 내림차순으로 만들기
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
