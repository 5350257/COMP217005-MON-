package javaPrograming.week3.examples;

import java.util.Scanner;

public class NextSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		double height;
		
		System.out.print("���� :");
		age = sc.nextInt();
		System.out.print("Ű :");
		height = sc.nextDouble();
		
		sc.nextLine();
		//nextLine()�� �ؿ� ������  ����Ű�� �Է¹޾� �׳� �Ѿ����. ���� ���ۿ� Enter�� �������� 	sc.nextLine(); �� �ϳ� �߰��Ͽ� ������ �ذ����ش�.
		
		System.out.print("�̸� :");
		name = sc.nextLine();
		
		System.out.println("���� : "+age);
		System.out.println("Ű : "+ height);
		System.out.println("�̸� :"+name);
		
	}

}
