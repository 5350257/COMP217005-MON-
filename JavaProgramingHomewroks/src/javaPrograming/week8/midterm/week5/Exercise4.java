package javaPrograming.week8.midterm.week5;
import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char input;
		while(true) {
			System.out.print("문자 : ");
			input = sc.next().charAt(0);
			
			if(input=='Q'||input=='q') {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
			}
			System.out.printf("입력하신 문자는 '%c'입니다.\n",input);
		}
	}

}
