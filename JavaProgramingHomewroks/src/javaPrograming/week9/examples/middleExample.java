package javaPrograming.week9.examples;

import java.util.Scanner;

public class middleExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

/* 1 */ int[] array = new int[100];
		System.out.println(array[0]);

		boolean[] bArr = new boolean[10];
//		bArr[0] : false �迭�� �ʱ�ȭ�� ���� �ʴ´ٸ� �ڵ����� �ڷ����� �´� 0���� �ʱ�ȭ��

/* 4 */ double[] arr = { 1.2, 3.1, 6.7 };

/* 5 */ for (int i = 0; i < array.length; i++) {
			array[i] *= 2;
		}

/*
 		for -each
 		for(int x:array){
 		x=*2; // x=4 x�� �ٲ�
 		}
 */
 
/* 6 */ double[] arrd;
		System.out.print("length : ");
		int length = sc.nextInt();
		arr = new double[length];

/* 8 */ int[] arr1 = new int[10];
		int[] arr2 = new int[10];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
//		for-each �� 
//		�迭�� ���̸� ������� �ʾƵ� �ȴ�. 
//		�ε��� ���� �߻� �� ��.
//		��� ���п� �ݺ� ����
//		�迭�� ���� �� ���� �Ұ�. 
//  	�迭 ��¸� �ַ� ��.
//		for(�ڷ��� ������ : �迭��){		
//		}
//		�Ϲ� for ��
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (double x : arr) {
			System.out.println(x);
		}
		
/*		int [] [] arr= new int [3][10] (��, ��)
		arr[2][1]  = 3�� 2��
		arr.length = �� ���� 3
		arr[2] = 3��
		arr[i].length i���� �� ����
		
		������ �迭 
		int [] [] [] arr2 = new int [5] [3] [12] 3�� 12�� ����� 5�� �ִ�.
		5���л��� 1�г�2�б� �⸻ �����  arr2 [3][1][4]
*/
		String [] [] books = new String [8][100];
		
	}
}