package javaPrograming.week5.examples;

//�����ϳ��� �Է¹޾� �빮��/�ҹ���/����/��Ÿ���� �� �ϳ� ����ϱ�
//���� �ϳ� �Է¹ޱ� : nextChar();�� ����. �׷��� ���ڿ��� ���� s.next(); or s.nextLine();
/*
	#String class's methods
	-���ڿ�1.equals(���ڿ�);
	-���ڿ�1.equalsIgnoreCase(���ڿ�);
	-���ڿ�1.charAt({index0~n-1}); : index+1 ��° ���� ��ȯ, index�� 0���� ����
	-���ڿ�1.length(); : ���ڿ��� ���� ��ȯ. 
										ex) "JAVA".length(); = 4;
										String s = "Hello";
										s.charAt(4)= o;
*/
import java.util.*;

public class PrintCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �ϳ� : ");
		char c = sc.next().charAt(0);

		System.out.print(c + " ");

		if (c >= 'a' && c <= 'z') { 	   // == if(Character.isUpperCase(c)==true){
			System.out.print("�ҹ���.");
		} else if (c >= 'A' && c <= 'Z') { // == if(Character.isLowerCase(c)==true){
			System.out.print("�빮��");
		} else if (c >= '0' && c <= '9') { // == if(Character.isDigit(c)==true){
			System.out.print("����");
		} else {
			System.out.print("��Ÿ����");
		}

	}
}