package javaPrograming.week4.examples_ifs;

import java.util.*;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("니 점수 : ");
		int score = sc.nextInt();

		/*
		 * 60 이상이라면 합격
		 * 
		 * if(score>=60){ System.out.println("합격"); }else{ System.out.println("불합격"); }
		 */

		// 90이상 A, 80이상 B, 70이상 C
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("B");
		} else {
			System.out.println("탈락");
		}
		/* else if (80<=score && score<90) 이거도 되긴 된다. 근데 안쓴다 */
		sc.close();
	}
}