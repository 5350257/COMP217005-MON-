package javaPrograming.week2.problem;
import java.util.*;

public class Homework2{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		int age;
		String name;
		double weight;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("몸무게 : ");
		weight = sc.nextDouble();
		
		System.out.printf("\"나의 이름은 \'%s\'\n\t나이는 %#x\n\t\t몸무게는%10.2f입니다.\"",name,age,weight);
	}
}

/*
import java.util.Scanner;

class HW1_2{
	public static void main(String [] args){
		String name;	
		int age;
		double weight;
		
		Scanner s = new Scanner(System.in);
		System.out.print("이름 : ");
		name = s.nextLine();
		System.out.print("나이 : ");
		age = s.nextInt();
		System.out.print("몸무게 : ");
		weight = s.nextDouble();
		
		System.out.printf("\"나의 이름은 '%s', \n\t나이는 %#x,\n\t\t몸무게는 %10.2f입니다.\"\n", name, age, weight);	
		
	}
}
*/