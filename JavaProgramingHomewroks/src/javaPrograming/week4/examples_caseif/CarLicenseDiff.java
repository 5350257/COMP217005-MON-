package javaPrograming.week4.examples_caseif;

import java.util.*;

public class CarLicenseDiff{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 종 (1종or2종 입력): ");
		String License = sc.nextLine();
		
		System.out.print("몇 점 : ");
		int score = sc.nextInt();
		
		if(License.equals("1종")){
			if(score>=70){
				System.out.println("합격");
			}else{
				System.out.println("불합격");
			}
			
		}else if(License.equals("2종")){
			if(score>=60){
				System.out.println("합격");
			}else{
				System.out.println("불합격");
			}
		}else{
				System.out.println(" ERROR :운전면허는 1종과 2종만 존재한다. 다시입력..");
		}
		
		System.out.println("abc".equals("abc"));		   //ture
		System.out.println("abc".equals("aBC")); 		   //false
		System.out.println("abc".equalsIgnoreCase("aBC")); //true
		
}
}