package javaPrograming.week4.problems;

import java.util.*;

public class RectangularCoordinates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��1�� x��ǥ : ");
		double x1 = sc.nextDouble();
		System.out.print("��1�� y��ǥ : ");
		double y1 = sc.nextDouble();
		System.out.print("��2�� x��ǥ : ");
		double x2 = sc.nextDouble();
		System.out.print("��2�� y��ǥ : ");
		double y2 = sc.nextDouble();
		
		if(x1==x2 || y1==y2) {
			System.out.println("���簢���� �ƴմϴ�.");
			return;
		}else{
			double ab2 = 2*(Math.sqrt(Math.pow(x1-x2,2))+Math.sqrt(Math.pow(y1-y2,2)));
			double C = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
			double area = Math.sqrt(Math.pow(x1-x2,2))*Math.sqrt(Math.pow(y1-y2,2));
			System.out.printf("�ѷ��� ���� : %.2f\n",ab2);
			System.out.printf("�밢���� ���� : %.2f\n",C);
			System.out.printf("���� : %.2f",area);
		}
	}
	//�ٸ� ���
//	width = x1-x2;
//	height = y1-y2;
//	
//	if(x1<x2){//���� ���̰� ����
//		width *= -1; //����� ��ȯ
//	}
//	
//	if(y1<y2){
//		width *= -1; 
//	}
//	
//	if((width==0)||(height==0))	System.out.println("���簢���� �ƴմϴ�.");//���γ� ���ΰ� 0�̸� ���簢���� �ƴ϶�� ���
//	else{
//		System.out.format("�ѷ��� ����: %.2f\n", 2*(width+height));
//		System.out.format("�밢���� ����: %.2f\n", Math.sqrt(Math.pow(width,2)+Math.pow(height,2)));
//		System.out.format("����: %.2f\n",width*height);
}
