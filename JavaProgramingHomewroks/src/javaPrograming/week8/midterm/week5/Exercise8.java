package javaPrograming.week8.midterm.week5;
import java.util.*;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.print("문자열 : ");
		String ss = sc.nextLine();
		System.out.print("문자 : ");
		char x = sc.next().charAt(0);
		for(int i=0;i<ss.length();i++) {
			if(ss.charAt(i)==x) {
				count++;
				System.out.printf((i+1)+"번째 ");
			}
		}
	System.out.println();
	System.out.printf("문자열 %s에서 %c는 총%d번 검색되었습니다.",ss,x,count);
		
		
	}

}
