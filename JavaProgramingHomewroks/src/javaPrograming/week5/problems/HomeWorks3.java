package javaPrograming.week5.problems;

import java.util.*;

public class HomeWorks3 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int dap = rd.nextInt(101) - 50;
		System.out.print("������ : ");
		int userInput = sc.nextInt();
		boolean run = true;
		int i = 1;
		while (run) {

			if (dap > userInput) {
				i++;
				System.out.println("������ �� ū ���Դϴ�. �ٽ� �õ����ּ���");
				System.out.print("������ : ");
				userInput = sc.nextInt();
			} else if (dap < userInput) {
				i++;
				System.out.println("������ �� ���� ���Դϴ�. �ٽ� �õ����ּ���");
				System.out.print("������ : ");
				userInput = sc.nextInt();
			} else {
				System.out.printf("�� %dȸ���� �����!. dap�� %d�̴�.", i, dap);
				run = false;
				sc.close();
			}
		}
	}
}
/*
		//����ڷκ��� ������ �Է¹ޱ�: ��ġ�Ҷ�����
		
		while(true){
			System.out.print("������: ");
			usr = s.nextInt();
			cnt++;//����ڷΰ� �Է��Ѵٸ� �õ� Ƚ�� �ѹ� ����
			if(usr==randomNbr) //�������� �Է°��� ��ġ�Ѵٸ� Ż��
				break; 
			else if(usr>randomNbr) 
				System.out.println("���� �ѹ��� �� �� ���� ���Դϴ�. �ٽ� �õ����ּ���. ");
			else 
				System.out.println("���� �ѹ��� �� �� ū ���Դϴ�. �ٽ� �õ����ּ���. ");
		}
		
		System.out.printf("�����Դϴ�. �� %dȸ���� ���߼̽��ϴ�.\n", cnt);
		*/