package javaPrograming.week4.examples;

import java.util.*;

public class TernaryOperator{
public static void main (String [] args){
	
	int a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 두 개를 입력");
	a = sc.nextInt();
	b = sc.nextInt();
	
	System.out.printf("최대 값은 %d이며, %s",(a>b?a:b),(a>b?"최대값은 앞의 수 입니다.":"최대값은 뒤의 수 입니다."));
}
}