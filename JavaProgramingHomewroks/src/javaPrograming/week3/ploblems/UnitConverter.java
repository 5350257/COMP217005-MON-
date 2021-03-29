package javaPrograming.week3.ploblems;

import java.util.*;

public class UnitConverter{
	public static void main (String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키 : ");
		int height = sc.nextInt();
		
		double inch = (height/2.54);
		int feet = (int) (inch/12);
		System.out.println(inch+"와"+feet);
		inch -= feet*12;
		
		System.out.printf("%dcm는 %d피트 %f인치입니다.\n", height, feet, inch);
		
		
	}
}