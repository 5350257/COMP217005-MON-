package javaPrograming.week4.examples_Math;

//Java.lang.Math;
//Java.lang.String;
//Java.lang. ��Ű���� Ŭ�������� import���� �ʾƵ� ����

public class MathRandom {

	public static void main(String[] args) {

		/* 0�̻� 1 �̸� �Ǽ��� ���� ���� */
		System.out.println("0�̻� 10�̸� �Ǽ��� ���� ����: " + Math.random());

		/* 150�̻� 200�̸� �Ǽ��� ���� ���� */
		System.out.println("150�̻� 200�̸� �Ǽ��� ���� ����: " + (150 + 50 * Math.random()));

		/* 0�̻� 9������ ������ ���� */
		int num = (int) (Math.random() * 10);
		System.out.println("0�̻� 9������ ������ ���� :" + num);

		/* 20�̻� 39������ ������ ���� */
		num = (int) (20 + Math.random() * 20);
		System.out.println("0�̻� 9������ ������ ���� :" + num);

		/* -3�̻� 3���� ������ ���� */
		num = (int) (-3 + Math.random() * 7);
		System.out.println("0�̻� 9������ ������ ���� :" + num);

	}
}