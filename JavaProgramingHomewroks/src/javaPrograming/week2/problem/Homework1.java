package javaPrograming.week2.problem;
import java.util.Scanner;

public class Homework1{
	public static void main (String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = "number";
		String s2 = "decimal";
		String s3 = "otcal";
		String s4 = "hexadecimal";
		String s5 = "sum";
		
		int num1, num2;

		System.out.print("ù��° ���� ���� : ");
		num1 = sc.nextInt();
		
		while(num1<0){
			
			System.out.print("���� ���� �Է��ض�(ù��°��) : ");
			num1=sc.nextInt();
			
		}
		
		System.out.print("�ι�° ���� ���� : ");
		num2 = sc.nextInt();
		
		while(num2<0){
			
			System.out.print("���� ���� �Է��ض�(�ι�°��) : ");
			num2=sc.nextInt();
			
		}
		
		int result = num1+num2;
		
//		System.out.println("ù��° ���� ���� : " +num1);
//		System.out.println("�ι�° ���� ���� : " +num2);
		
		System.out.println();
		System.out.printf("%-11s|%-11s|%-11s|%11s|\n" ,"number","decimal","otcal","hexadecimal");
		System.out.printf("%-11s|%2$+11d|%2$#11o|%2$#11x|\n" ,"number 1",num1);
		System.out.printf("%-11s|%2$+11d|%2$#11o|%2$#11x|\n" ,"number 2",num2);
		System.out.printf("%-11s|%2$-+11d|%2$#-11o|%2$#-11x|\n" ,"sum",result);
		
	}
}
// �ٸ� ��

//public static void main(String [] args){
//	int a;
//	int b;
//	
//	Scanner s = new Scanner(System.in);
//	System.out.printf("ù��° ���� ���� : ");
//	a = s.nextInt();
//	System.out.print("�ι�° ���� ���� : ");
//	b = s.nextInt();
//
//	System.out.printf("\n%-11s|%-11s|%-11s|%-11s|\n", "number","decimal","otcal","hexadecimal");


//	System.out.printf("%-11s|%2$+11d|%2$#11o|%2$#11x|\n", "number 1",a);
//	System.out.printf("%-11s|%2$+11d|%2$#11o|%2$#11x|\n", "number 2",b);
//	System.out.printf("%-11s|%2$+-11d|%2$-#11o|%2$-#11x|\n", "sum",a+b);
//	
//	
//	�Ǵ� 
//	
//	System.out.printf("%-11s|%+11d|%#11o|%#11x|\n", "number 1",a,a,a);
//	System.out.printf("%-11s|%+11d|%#11o|%#11x|\n", "number 2",b,b,b);
//	System.out.printf("%-11s|%+-11d|%-#11o|%-#11x|\n", "sum",a+b,a+b,a+b);
//	}}
