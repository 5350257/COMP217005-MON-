package javaPrograming.week6.examples;
/*
  �迭 : ���� �ڷ����� �ڷḦ �ѹ��� ���� ������ �ڷᱸ��
	�л� 100���� ������ ������ �� �ִ� �迭
	�ڷ��� [] �迭��;
	int [] scores = new int [100];
*/
import java.util.*;

public class ArrayExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л� �� : ");
		int x = sc.nextInt();
		
		// �л� 100���� �÷��� ������ �� �ִ� �迭 index = 0~99
		double[] sight = new double[100];

		// �л� 50���� �̸��� ������ �� �ִ� �迭 index = 0~49
		String[] name = new String[50];

		int[] score = new int[x];
		for (int i = 0; i < score.length; i++) { //�迭�� length���� '()'�� ����.
			System.out.printf("%d�� �л� ���� : ", i + 1);
			score[i] = sc.nextInt();

		} //�迭�� �󸶳� �ִ��� �� ��, int [] score = {10,20,30,40,50,};
		
	/* 	int [] nums;
		nums = new int[] {1,2,3,4}; 	
	*/
		
	// �迭�� ��� ���� ���
		for(int i=0;i<score.length;i++){
			System.out.printf("%d�� �л� ���� : %d\n",(i+1),score[i]);
		}
		System.out.print("��� �л�? ");
		int b = sc.nextInt();

		System.out.printf("%d�� �л� ���� : %d", b, score[b - 1]);

	}

}