package javaPrograming.weekE;

import java.io.*;


class FileTest{
	public static void main(String [] args){
		File f = new File("PlayTest.java");//������ ��üȭ
		File f4 = new File("����"+File.separator+"FruitTest.java");//�����
		//�����: ������ ��θ� �Ϻκи� �ۼ� e.g.) PlayTest.java
		//������: ������ ��θ� ��� �ۼ�, e.g.) C:\Users\Win7\Desktop\COMP217\week14\PlayTest.java
		File f3 = new File("C:\\Users\\Win7\\Desktop\\COMP217\\week14");
		
		File f2 = new File("a.java");//������ ��üȭ
		System.out.println(f.exists());//true
		System.out.println(f2.exists());//false
		System.out.println(f.length()+"B");//������ ũ��
		System.out.println(f.getName());//f ������ �̸��� ��ȯ
		System.out.println(f.getAbsolutePath());//f ������ �����θ� ��ȯ
		System.out.println(new java.util.Date(f.lastModified()));//f ������ ������������ ��ȯ
	}
}




