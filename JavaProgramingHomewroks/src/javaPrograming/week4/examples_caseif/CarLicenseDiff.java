package javaPrograming.week4.examples_caseif;

import java.util.*;

public class CarLicenseDiff{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� (1��or2�� �Է�): ");
		String License = sc.nextLine();
		
		System.out.print("�� �� : ");
		int score = sc.nextInt();
		
		if(License.equals("1��")){
			if(score>=70){
				System.out.println("�հ�");
			}else{
				System.out.println("���հ�");
			}
			
		}else if(License.equals("2��")){
			if(score>=60){
				System.out.println("�հ�");
			}else{
				System.out.println("���հ�");
			}
		}else{
				System.out.println(" ERROR :��������� 1���� 2���� �����Ѵ�. �ٽ��Է�..");
		}
		
		System.out.println("abc".equals("abc"));		   //ture
		System.out.println("abc".equals("aBC")); 		   //false
		System.out.println("abc".equalsIgnoreCase("aBC")); //true
		
}
}