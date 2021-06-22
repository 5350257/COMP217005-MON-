package javaPrograming.finalExam.week10;

import java.util.*;

public class ArrayTest2 {
	static Scanner sc = new Scanner(System.in);
	static Random rn = new Random();

	public static void main(String[] args) {
		System.out.println("m�� n���� �迭 ���� : m, n *2");
//		int m = sc.nextInt();
//		int n = sc.nextInt();
//		int arr[][] = new int [3][2];
		int arr[][] = { { 2, 1 }, { 5, 8 }, { 7, 4 } };
		System.out.println("�迭�� ���е�");
		print(arr);
		System.out.println("�迭�� ��� ���е��� �� : " + sumArr(arr));
		
		System.out.println("�迭�� �� �� ��:");
		for(int x : rowSumArr(arr)) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("�迭�� �� �� ��:");
		for(int x : colSumArr(arr)) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("�� �� ���� �ִ� : " + rowSumMaxArr(arr));
		
		System.out.println("�迭�� �ִ��� �ε��� : ");
		for(int x : indexMax(arr)) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("�迭 ����");
		shuffleArr(arr);
		System.out.println("�迭�� ���е�");
		print(arr);
	}

	static void initArr(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}

	static void print(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d�� %d�� ���� : %d\n", i+1, j+1, arr[i][j]);
			}
		}
		System.out.println();
	}

	static int sumArr(int arr[][]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
	
	static int[] rowSumArr(int arr[][]) {
		int row[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				row[i]+=arr[i][j];
			}
		}
		return row;
	}

	static int[] colSumArr(int arr[][]) {
		int col[] = new int[arr[0].length];
		for (int i = 0; i < arr[i].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				col[i] += arr[j][i];
			}
		}
		return col;
	}

	static int rowSumMaxArr(int arr[][]) {
		int max = 0;
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				row += arr[i][j];
			}
			if (max < row) {
				max = row;
			}
			row = 0;
		}
		return max;
	}

	static int[] indexMax(int arr[][]) {
		int index[] = new int[2];
		int max = arr[0][0];
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

	static void shuffleArr(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int x = rn.nextInt(arr.length);
				int y = rn.nextInt(arr[0].length);
				if (arr[i][j] != arr[x][y]) {
					int temp = arr[i][j];
					arr[i][j] = arr[x][y];
					arr[x][y] = temp;
				}
			}
		}
	}

}
