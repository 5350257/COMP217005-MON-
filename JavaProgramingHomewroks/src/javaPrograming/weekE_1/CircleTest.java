package javaPrograming.weekE_1;

import java.io.*;
import java.util.*;

class CircleTest{
	public static void main (String [] args)throws Exception{
		if(args.length<1){
			System.out.println("[Usage] java CircleTest ����� ����� ���� ��");
			System.exit(1);
		}else{
			

			File f1 = new File("���� �������� ����.java");
			File f2 = new File(args[0]);
			
			if(f1.exists()==false){
				System.out.printf("\"%s\" ������ �������� �ʽ��ϴ�. Ȯ�����ּ���. \n", f1.getName());
				System.exit(2);
			}
			if(f2.exists()==true){
				System.out.printf("\"%s\" ������ �̹� �����մϴ�. ���ο� ���ϸ��� �Է����ּ���. \n", f2.getName());
				System.exit(2);
			}
			
			PrintWriter pw = new PrintWriter(f2);
			Scanner sc = new Scanner(f1);
			int r;
			double area, result;
			int i =0;
			
			while(sc.hasNext()==true){
			i++;
			r = Integer.parseInt(sc.next().substring(4));
			area = Double.parseDouble(sc.next().substring(3));
			result = r*r*3.14;
			if(result==area){
				pw.println(String.format("%d��° ���� ���̴� ����� ���������ϴ�: ������(%d), ����(%.2f)", i, r, area));
			}else{
				pw.println(String.format("%d��° ���� ���̴� �� �� ���߽��ϴ�: �������� %d�� ���, ���̴� %.2f�� �ƴ϶� %.2f�Դϴ�.", i, r, area, result));
			}
			
			}
			System.out.printf("�������(%s) �����Ϸ�. Ȯ�ιٶ��ϴ�. \n", f2.getName());//f1.getName()�ص� ����
		
		sc.close();
		pw.close();
		}
	}
}