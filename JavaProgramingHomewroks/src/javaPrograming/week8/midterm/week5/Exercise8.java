package javaPrograming.week8.midterm.week5;
import java.util.*;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.print("���ڿ� : ");
		String ss = sc.nextLine();
		System.out.print("���� : ");
		char x = sc.next().charAt(0);
		for(int i=0;i<ss.length();i++) {
			if(ss.charAt(i)==x) {
				count++;
				System.out.printf((i+1)+"��° ");
			}
		}
	System.out.println();
	System.out.printf("���ڿ� %s���� %c�� ��%d�� �˻��Ǿ����ϴ�.",ss,x,count);
		
		
	}

}
