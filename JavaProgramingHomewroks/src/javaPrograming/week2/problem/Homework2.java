package javaPrograming.week2.problem;
import java.util.*;

public class Homework2{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		int age;
		String name;
		double weight;
		
		System.out.print("�̸� : ");
		name = sc.nextLine();
		
		System.out.print("���� : ");
		age = sc.nextInt();
		
		System.out.print("������ : ");
		weight = sc.nextDouble();
		
		System.out.printf("\"���� �̸��� \'%s\'\n\t���̴� %#x\n\t\t�����Դ�%10.2f�Դϴ�.\"",name,age,weight);
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
		System.out.print("�̸� : ");
		name = s.nextLine();
		System.out.print("���� : ");
		age = s.nextInt();
		System.out.print("������ : ");
		weight = s.nextDouble();
		
		System.out.printf("\"���� �̸��� '%s', \n\t���̴� %#x,\n\t\t�����Դ� %10.2f�Դϴ�.\"\n", name, age, weight);	
		
	}
}
*/