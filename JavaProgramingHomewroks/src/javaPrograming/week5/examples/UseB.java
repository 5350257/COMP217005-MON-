package javaPrograming.week5.examples;

/* 
정수 입력 : -3
정수가 양수라면, b=1 대입
정수가 음수라면, b=-1 대입
정수가 0, b=0 대입

b출력
 */
import java.util.*;

public class UseB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 0;
		System.out.print("정수 : ");
		int input = sc.nextInt();
		sc.close();

		if (input > 0) {
			b = 1;
		} else if (input < 0) {
			b = -1;
		}
		// 초기화를 조건문(if)으로 할 때에는 모든 경우에 값을 입력해 주어야 한다. if, else if, else 전부 다.
		System.out.printf("b : %d", b);
	}
}