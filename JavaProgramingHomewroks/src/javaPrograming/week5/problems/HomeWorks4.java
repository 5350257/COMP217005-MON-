package javaPrograming.week5.problems;

import java.util.*;

public class HomeWorks4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char input;
		do {
			System.out.print("���� : ");
			input = sc.next().charAt(0);

			if (input!='Q' && input!='q') {
				System.out.println("�Է��Ͻ� ���ڴ� \'" + input + "\'�Դϴ�.");
			}

		} while (input!='Q' && input!='q');

		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
		return;

	}

}
/*
char c = 'a';//while���� do-whileó�� �����ϱ� ���� �ǹ̴� ������ 'a'�� �ʱ�ȭ
//do-while�̳� ���ѹݺ����� ����Ѵٸ� �ʱ�ȭ���� �ʾƵ� ����

while(c!='Q' && c!='q'){
	System.out.print("����: ");
	c = s.next().charAt(0);
	if(c!='Q' && c!='q')
		System.out.printf("�Է��Ͻ� ���ڴ� '%c'�Դϴ�. \n", c);
}

		


// ���� 2
do{
	System.out.print("����: ");
	c = s.next().charAt(0);
	if(c!='Q' && c!='q')
		System.out.printf("�Է��Ͻ� ���ڴ� '%c'�Դϴ�. \n", c);
}while(c!='Q' && c!='q');



//����3
while(true){
	System.out.print("����: ");
	c = s.next().charAt(0);
	if(c=='Q' || c=='q')
		break;
	System.out.printf("�Է��Ͻ� ���ڴ� '%c'�Դϴ�. \n", c);
} 

System.out.println("���α׷��� �����մϴ�. ");
*/