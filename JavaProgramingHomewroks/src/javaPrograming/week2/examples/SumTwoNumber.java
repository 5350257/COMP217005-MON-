package javaPrograming.week2.examples;

import java.util.*;

//두개의 정수를 입력받아 두 수의 합을 출력하는 프로그램
public class SumTwoNumber {

	public static void main(String[] args) {
		//변수 선언 : 메모리 공간 확보
		int num1,num2; 
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개 입력");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("두 수의 합 : " +(num1 + num2));

	}

}
