package javaPrograming.week8.midterm1;

import java.util.*;

public class P6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String s = sc.nextLine();
		int k =0;
		System.out.println("���Ӹ�");
		if(s.charAt(0)!=' ') {
			System.out.print(s.charAt(0));
		}
		
		for(int i =0;i<s.length();i++){
		
			if(s.charAt(i)==' '){
				if(i+1!=s.length()) {
			System.out.print(s.charAt(i+1));
			}
			}
		}
		System.out.println();
		System.out.println("���� ����");
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
			
		}
	}
}