package javaPrograming.week4.examples_random_class;

import java.util.Random;

public class RandomClass{

	public static void main (String [] args){
		
		Random r = new Random();//���� �����⸦ ����.
		
		/* (0<=x<n),, n�� ��ȣ���� ���� */
		
		/* ���� Ŭ������ �̿��Ͽ� ���� ���� */
		
		//0�̻� 10 �̸��� �Ǽ��� ����
		System.out.println(r.nextDouble()*10);
		// nextDouble()�� ��ȣ�ȿ� ���ڸ� ���� �� ����.
		
		//0�̻� 9 ������ ������ ����
		System.out.println(r.nextInt(10));
		
		//-3�̻� 3������ ������ ����
		System.out.println(r.nextInt(7)-3);
		
	}
}