package javaPrograming.week5.examples_iteration;

import java.util.*;

public class PrintRightTriangle {

	public static void main(String[] args) {
		//문제에서 라인 수는 변수에 바로 저장된 값이지만 나는 입력받은 값으로 출력하게 만들었다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("라인 수 : ");
		int length = sc.nextInt();
		
		for(int l = 1; l<=length; l++) {
			for(int i = 0; i<l;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int l = 1; l<=length; l++) {
			
			for(int k = length; k>l;k--) {
				System.out.print(" ");
			}
			for(int i = 1; i<=l;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
