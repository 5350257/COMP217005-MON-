package javaPrograming.week6.homeworks;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.print("1���� ū ���� : ");
			num = sc.nextInt();
			if(num<=1) {
				System.out.println("[�Է¿���] 1���� ū ������ �Է����ּ���.");
			}else {
				break;
			}
		}
		
	}

}
