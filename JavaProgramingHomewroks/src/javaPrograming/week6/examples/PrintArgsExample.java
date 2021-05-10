package javaPrograming.week6.examples;

import java.util.*;

public class PrintArgsExample {

	public static void main(String[] args) {
		
		//Ŀ�ǵ� ���ο� ���ڰ� ���ٸ� ������ �˸��� ����
		if(args.length<2){
			System.out.println("[����] java PrintArgsExample ����1 ����2");
			//���α׷� ����
			System.exit(1);
		}
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		//���ڿ���  IntŸ������ ��ȯ
		//Integer.parseInt("4");
		//���ڿ���  Double Ÿ������ ��ȯ
		//Double.parseDouble("3.14"); = 3.14
		
		System.out.print(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		System.out.println();
		
		for(int i = 0; i<args.length;i++){
			if(Integer.parseInt(args[i])%2==0){
				System.out.printf("¦�� : %s\n",args[i]);
			}
		}
		

	}
}