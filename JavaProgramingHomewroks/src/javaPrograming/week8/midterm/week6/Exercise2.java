package javaPrograming.week8.midterm.week6;

import java.util.*;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n , count =0;
		double sum =0;
		
		while(true) {
			System.out.print("Á¤¼ö ");
			n = sc.nextInt();
			if(n==1111) {
				break;
			}
			if(n%7!=0 && n%2!=0) {
				count++;
				sum+=n;
			}
		}
		if(count==0) {
			System.out.println("Æò±Õ °è»êÇÒ È¦¼ö°¡ ¾ø´Ù.");
			System.exit(1);
		}
		System.out.println(count);
		System.out.println("Æò±Õ = "+(sum/count));
	}

}
