package javaPrograming.week2.examples;

public class FormatSpecifier {
	
	public static void main (String [] args){
		short a = 19;
		char c = '��';
		double d = 5.2;
		boolean b = 4<5; //true
		
		String s = "Hello, World!";
		
/*
		����������
		%[���ڹ�ȣ$] [�÷���] [����].[���е�] [Ÿ�Թ���]
		
		
		[�÷���]
		
			# : Ÿ�Թ��� 'o','x' �տ����� ���� ǥ��,
			+ : ��ȣ ����. Ÿ�Թ��� d, f �տ��� ��밡��
			- : ���� ����, �ʺ� �������� ����
			0 : 
			
		[�ʺ�] : ��� ���� 10 = 10�ڸ�
		
		[���е�] : �Ǽ��� �Ҽ��� �ڸ��� ����
		
		[Ÿ�Թ���] : c(����),s(���ڿ�), d(����), o(8����) x(16����), f(�Ǽ�), b(��)
		%e �Ǽ��� �������·� ��� 123.456 = 1.23456e+02 �굵 �Ǽ��� ħ
*/
// http://blog.devez.net/100 ����
	
	//a�� 10ĭ Ȯ���ϰ� �������� ����ϵ� ���� ����, ��ȣ�� ����� ��
	System.out.printf("%-+10d\n",a);
	//a�� 20ĭ Ȯ���ϰ� �������� ����ϵ� ������ ����, ������� 0���� ä�� ��
	System.out.printf("%020d\n",a);
	//d�� �Ҽ��� �Ʒ� 3°�ڸ����� ��ȣ �ٿ� ��� 
	System.out.printf("%+.3f\n",d);

		System.out.printf("���ڿ� : %s\n",s);
		System.out.format("���� : %10c\n",c);
		
		System.out.printf("���� : %d, %o, %x\n",a,a,a);
		
		System.out.printf("���� : %010d, %o, %x\n",a,a,a);
		System.out.printf("���� : %2$d, %2$#o, %2$#x\n",a,a,a);
		//$ ���� ����, ��� ° ���ڸ� ������� ����
		//d = decimal = 10���� o = octal = 8���� x=hexadecimal = 16����
		System.out.printf("e�Ǽ� : %e\n",1000*d);
		System.out.printf("�Ǽ� : %f\n",d);

		
		System.out.printf("�Ǽ� : %.454f \n",d);
		System.out.printf("�� : %b\n",b);
		
		}
	}