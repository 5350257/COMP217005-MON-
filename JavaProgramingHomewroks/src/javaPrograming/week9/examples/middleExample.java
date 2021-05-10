package javaPrograming.week9.examples;

import java.util.Scanner;

public class middleExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

/* 1 */ int[] array = new int[100];
		System.out.println(array[0]);

		boolean[] bArr = new boolean[10];
//		bArr[0] : false 배열은 초기화를 하지 않는다면 자동으로 자료형에 맞는 0으로 초기화됨

/* 4 */ double[] arr = { 1.2, 3.1, 6.7 };

/* 5 */ for (int i = 0; i < array.length; i++) {
			array[i] *= 2;
		}

/*
 		for -each
 		for(int x:array){
 		x=*2; // x=4 x만 바뀜
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
		
//		for-each 문 
//		배열의 길이를 명시하지 않아도 된다. 
//		인덱스 오류 발생 안 함.
//		모든 성분에 반복 적용
//		배열의 성분 값 변경 불가. 
//  	배열 출력만 주로 함.
//		for(자료형 변수명 : 배열명){		
//		}
//		일반 for 문
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (double x : arr) {
			System.out.println(x);
		}
		
/*		int [] [] arr= new int [3][10] (행, 열)
		arr[2][1]  = 3행 2열
		arr.length = 행 개수 3
		arr[2] = 3행
		arr[i].length i행의 열 개수
		
		다차원 배열 
		int [] [] [] arr2 = new int [5] [3] [12] 3행 12열 행렬이 5개 있다.
		5번학생의 1학년2학기 기말 영어석정  arr2 [3][1][4]
*/
		String [] [] books = new String [8][100];
		
	}
}