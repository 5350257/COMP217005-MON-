package javaPrograming.week2.examples;

//����ڷκ��� �̸�, ����, Ű�� �Է¹޾� �׷��� ���
import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		double height;
		
		System.out.print("�̸� �Է� : ");
		name = sc.nextLine();
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		System.out.print("Ű �Է�(���� cm) : ");
		height = sc.nextDouble();
		
		System.out.println("�̸� : "+ name +"\n"+"���� : "+age+" ��\n"+"Ű : "+height+" cm\n");		
	}

}

