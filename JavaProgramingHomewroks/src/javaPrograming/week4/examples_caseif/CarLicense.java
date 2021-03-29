package javaPrograming.week4.examples_caseif;

import java.util.*;

public class CarLicense{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 종 1종일시 : 1, 2종일시 : 2 입력 =");
		int License = sc.nextInt();
		
		System.out.print("몇 점 : ");
		int score = sc.nextInt();
		
		if(License==1){
			if(score>=70){
				System.out.println("합격");
			}else{
				System.out.println("불합격");
			}
			
		}else if(License==2){
			if(score>=60){
				System.out.println("합격");
			}else{
				System.out.println("불합격");
			}
		}else{
				System.out.println(" ERROR :운전면허는 1종과 2종만 존재한다. 다시입력..");
		}
		
}
}