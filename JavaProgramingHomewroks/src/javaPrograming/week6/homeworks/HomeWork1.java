package javaPrograming.week6.homeworks;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.print("1보다 큰 정수 : ");
			num = sc.nextInt();
			if(num<=1) {
				System.out.println("[입력오류] 1보다 큰 정수를 입력해주세요.");
			}else {
				break;
			}
		}
		
	}

}
