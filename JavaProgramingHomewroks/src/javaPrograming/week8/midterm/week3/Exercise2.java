package javaPrograming.week8.midterm.week3;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ű : ");
		int ki = sc.nextInt();

		double inch = (ki / 2.54);
		int feet = (int) (inch / 12);
		System.out.printf("%f��ġ, %d��Ʈ\n",inch,feet);
		inch -=feet*12;
		
		System.out.printf("%dcm�� %d��Ʈ %f��ġ�Դϴ�.\n", ki, feet, inch);
 }
}
