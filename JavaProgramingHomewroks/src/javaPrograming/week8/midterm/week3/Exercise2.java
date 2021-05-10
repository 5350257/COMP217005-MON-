package javaPrograming.week8.midterm.week3;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("키 : ");
		int ki = sc.nextInt();

		double inch = (ki / 2.54);
		int feet = (int) (inch / 12);
		System.out.printf("%f인치, %d피트\n",inch,feet);
		inch -=feet*12;
		
		System.out.printf("%dcm는 %d피트 %f인치입니다.\n", ki, feet, inch);
 }
}
