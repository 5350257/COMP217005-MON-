package javaPrograming.week8.midterm.week5;
import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char input;
		while(true) {
			System.out.print("���� : ");
			input = sc.next().charAt(0);
			
			if(input=='Q'||input=='q') {
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				System.exit(0);
			}
			System.out.printf("�Է��Ͻ� ���ڴ� '%c'�Դϴ�.\n",input);
		}
	}

}
