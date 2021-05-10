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

		System.out.print("첫번째 양의 정수 : ");
		num1 = sc.nextInt();
		
		while(num1<0){
			
			System.out.print("양의 정수 입력해라(첫번째임) : ");
			num1=sc.nextInt();
			
		}
		
		System.out.print("두번째 양의 정수 : ");
		num2 = sc.nextInt();
		
		while(num2<0){
			
			System.out.print("양의 정수 입력해라(두번째임) : ");
			num2=sc.nextInt();
			
		}
		
		int result = num1+num2;
		
//		System.out.println("첫번째 양의 정수 : " +num1);
//		System.out.println("두번째 양의 정수 : " +num2);
		
		System.out.println();
		System.out.printf("%-11s|%-11s|%-11s|%11s|\n" ,"number","decimal","otcal","hexadecimal");
		System.out.printf("%-11s|%2$+11d|%2$#11o|%2$#11x|\n" ,"number 1",num1);
		System.out.printf("%-11s|%2$+11d|%2$#11o|%2$#11x|\n" ,"number 2",num2);
		System.out.printf("%-11s|%2$-+11d|%2$#-11o|%2$#-11x|\n" ,"sum",result);
		
	}
}
// 다른 답

//public static void main(String [] args){
//	int a;
//	int b;
//	
//	Scanner s = new Scanner(System.in);
//	System.out.printf("첫번째 양의 정수 : ");
//	a = s.nextInt();
//	System.out.print("두번째 양의 정수 : ");
//	b = s.nextInt();
//
//	System.out.printf("\n%-11s|%-11s|%-11s|%-11s|\n", "number","decimal","otcal","hexadecimal");


//	System.out.printf("%-11s|%2$+11d|%2$#11o|%2$#11x|\n", "number 1",a);
//	System.out.printf("%-11s|%2$+11d|%2$#11o|%2$#11x|\n", "number 2",b);
//	System.out.printf("%-11s|%2$+-11d|%2$-#11o|%2$-#11x|\n", "sum",a+b);
//	
//	
//	또는 
//	
//	System.out.printf("%-11s|%+11d|%#11o|%#11x|\n", "number 1",a,a,a);
//	System.out.printf("%-11s|%+11d|%#11o|%#11x|\n", "number 2",b,b,b);
//	System.out.printf("%-11s|%+-11d|%-#11o|%-#11x|\n", "sum",a+b,a+b,a+b);
//	}}
