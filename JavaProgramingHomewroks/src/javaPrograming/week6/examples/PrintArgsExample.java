package javaPrograming.week6.examples;

import java.util.*;

public class PrintArgsExample {

	public static void main(String[] args) {
		
		//커맨드 라인에 인자가 없다면 사용법을 알리고 종료
		if(args.length<2){
			System.out.println("[사용법] java PrintArgsExample 정수1 정수2");
			//프로그램 종료
			System.exit(1);
		}
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		//문자열을  Int타입으로 변환
		//Integer.parseInt("4");
		//문자열을  Double 타입으로 변환
		//Double.parseDouble("3.14"); = 3.14
		
		System.out.print(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		System.out.println();
		
		for(int i = 0; i<args.length;i++){
			if(Integer.parseInt(args[i])%2==0){
				System.out.printf("짝수 : %s\n",args[i]);
			}
		}
		

	}
}