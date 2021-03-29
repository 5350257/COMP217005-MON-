package javaPrograming.week2.examples;

//사용자로부터 이름, 나이, 키를 입력받아 그래도 출력
import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		double height;
		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		System.out.print("키 입력(단위 cm) : ");
		height = sc.nextDouble();
		
		System.out.println("이름 : "+ name +"\n"+"나이 : "+age+" 세\n"+"키 : "+height+" cm\n");		
	}

}

