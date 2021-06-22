package javaPrograming.week8.midterm.week5;

import java.util.*;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		if (a > b) {
			int c = a;
			a = b;
			b = c;
		}
		for(int i = a;i<=b;i++) {
			System.out.printf("%dÀÇ ¾à¼ö : ",i);
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					System.out.print(j+", ");
				}
			}
			System.out.println("");
		}
		
	}

}
