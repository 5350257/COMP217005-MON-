package javaPrograming.week4.examples_caseif;

import java.util.*;

public class CarLicense{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� 1���Ͻ� : 1, 2���Ͻ� : 2 �Է� =");
		int License = sc.nextInt();
		
		System.out.print("�� �� : ");
		int score = sc.nextInt();
		
		if(License==1){
			if(score>=70){
				System.out.println("�հ�");
			}else{
				System.out.println("���հ�");
			}
			
		}else if(License==2){
			if(score>=60){
				System.out.println("�հ�");
			}else{
				System.out.println("���հ�");
			}
		}else{
				System.out.println(" ERROR :��������� 1���� 2���� �����Ѵ�. �ٽ��Է�..");
		}
		
}
}