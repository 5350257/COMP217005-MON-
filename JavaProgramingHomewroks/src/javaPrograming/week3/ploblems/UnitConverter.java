package javaPrograming.week3.ploblems;

import java.util.*;

public class UnitConverter{
	public static void main (String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű : ");
		int height = sc.nextInt();
		
		double inch = (height/2.54);
		int feet = (int) (inch/12);
		System.out.println(inch+"��"+feet);
		inch -= feet*12;
		
		System.out.printf("%dcm�� %d��Ʈ %f��ġ�Դϴ�.\n", height, feet, inch);
		
		
	}
}