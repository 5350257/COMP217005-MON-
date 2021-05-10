package javaPrograming.week8.midterm.week4;

import java.util.*;

public class Exercise7 {
	public static void main(String[] args) {
		Random rn = new Random();
		
		int num = (int)(Math.random()*30+70);
		System.out.println(num);
		
		System.out.println(rn.nextInt());
		
		System.out.println(rn.nextInt(4));
		
		System.out.println(rn.nextDouble()*10);
		
	}
}