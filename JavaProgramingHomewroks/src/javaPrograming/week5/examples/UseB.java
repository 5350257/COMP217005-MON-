package javaPrograming.week5.examples;

/* 
���� �Է� : -3
������ ������, b=1 ����
������ �������, b=-1 ����
������ 0, b=0 ����

b���
 */
import java.util.*;

public class UseB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 0;
		System.out.print("���� : ");
		int input = sc.nextInt();
		sc.close();

		if (input > 0) {
			b = 1;
		} else if (input < 0) {
			b = -1;
		}
		// �ʱ�ȭ�� ���ǹ�(if)���� �� ������ ��� ��쿡 ���� �Է��� �־�� �Ѵ�. if, else if, else ���� ��.
		System.out.printf("b : %d", b);
	}
}