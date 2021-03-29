package javaPrograming.week3.examples;

import java.util.Scanner;

public class NextSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		double height;
		
		System.out.print("나이 :");
		age = sc.nextInt();
		System.out.print("키 :");
		height = sc.nextDouble();
		
		sc.nextLine();
		//nextLine()이 밑에 있으면  엔터키를 입력받아 그냥 넘어가진다. 따라서 버퍼에 Enter를 저장해줄 	sc.nextLine(); 를 하나 추가하여 문제를 해결해준다.
		
		System.out.print("이름 :");
		name = sc.nextLine();
		
		System.out.println("나이 : "+age);
		System.out.println("키 : "+ height);
		System.out.println("이름 :"+name);
		
	}

}
