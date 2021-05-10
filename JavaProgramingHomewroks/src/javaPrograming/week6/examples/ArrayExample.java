package javaPrograming.week6.examples;
/*
  배열 : 같은 자료형의 자료를 한번에 접근 가능한 자료구조
	학생 100명의 점수를 저장할 수 있는 배열
	자료형 [] 배열명;
	int [] scores = new int [100];
*/
import java.util.*;

public class ArrayExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 : ");
		int x = sc.nextInt();
		
		// 학생 100명의 시력을 저장할 수 있는 배열 index = 0~99
		double[] sight = new double[100];

		// 학생 50명의 이름을 저장할 수 있는 배열 index = 0~49
		String[] name = new String[50];

		int[] score = new int[x];
		for (int i = 0; i < score.length; i++) { //배열의 length에는 '()'이 없다.
			System.out.printf("%d번 학생 점수 : ", i + 1);
			score[i] = sc.nextInt();

		} //배열이 얼마나 있는지 알 때, int [] score = {10,20,30,40,50,};
		
	/* 	int [] nums;
		nums = new int[] {1,2,3,4}; 	
	*/
		
	// 배열의 모든 성분 출력
		for(int i=0;i<score.length;i++){
			System.out.printf("%d번 학생 점수 : %d\n",(i+1),score[i]);
		}
		System.out.print("몇번 학생? ");
		int b = sc.nextInt();

		System.out.printf("%d번 학생 점수 : %d", b, score[b - 1]);

	}

}