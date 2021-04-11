package javaPrograming.week5.problems;

import java.util.*;

public class HomeWorks1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1, x2, y1, y2;

		do {
			System.out.print("�� 1�� x��ǥ : ");
			x1 = sc.nextDouble();
			System.out.print("�� 1�� y��ǥ : ");
			y1 = sc.nextDouble();
			System.out.print("�� 2�� x��ǥ : ");
			x2 = sc.nextDouble();
			System.out.print("�� 2�� y��ǥ : ");
			y2 = sc.nextDouble();
			sc.close();
			if (x1 == x2 || y1 == y2) {
				System.out.printf("�� (%.2f, %.2f)�� �� (%.2f, %.2f)�� ���簢���� �̷��� �ʽ��ϴ�. �ٽ� �Է����ּ���\n", x1, y1, x2, y2);
			}
		} while (x1 == x2 || y1 == y2);
		
		double round = 2 * (Math.sqrt(Math.pow(x1 - x2, 2) ) + Math.sqrt(Math.pow(y1 - y2, 2) ) );
		double xy = Math.sqrt(Math.pow(x1 - x2, 2) )*Math.sqrt(Math.pow(y1 - y2, 2) );
		double z = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		System.out.println("==========��� ���==========");
		System.out.printf("-�ѷ��� ���� : %.2f\n", round);
		System.out.printf("-���� : %.2f \n",xy);
		System.out.printf("-�밢���� ���� :%.2f\n", z);

	}

}
/*
double x1, y1, x2, y2; //�� ���� x,y ��ǥ��
		double width, height;  //����, ����
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.print("��1�� x��ǥ: ");
			x1 = s.nextDouble();
			System.out.print("��1�� y��ǥ: ");
			y1 = s.nextDouble();
			
			System.out.print("��2�� x��ǥ: ");
			x2 = s.nextDouble();
			System.out.print("��2�� y��ǥ: ");
			y2 = s.nextDouble();
			
			
			width = x1-x2;
			height = y1-y2;
			
			if(width!=0 && height!=0)
				break;
			
			System.out.format("�� (%.2f, %.2f)�� �� (%.2f, %.2f)�� ���簢���� �̷��� �ʽ��ϴ�. \n�ٽ� �Է����ּ���. \n", x1, y1, x2, y2);			
		}
		
		if(width<0){//���� ���̰� ����
			width *= -1; //����� ��ȯ
		}
		if(height<0){
			height *= -1; 
		}
		
		System.out.println("=============��� ���=============");
		System.out.format(" - �ѷ��� ����: %.2f\n", 2*(width+height));
		System.out.format(" - ����: %.2f\n",width*height);
		System.out.format(" - �밢���� ����: %.2f\n", Math.sqrt(Math.pow(width,2)+Math.pow(height,2)));
	
 */
