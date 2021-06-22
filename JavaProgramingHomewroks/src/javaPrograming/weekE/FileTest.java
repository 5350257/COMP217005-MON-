package javaPrograming.weekE;

import java.io.*;


class FileTest{
	public static void main(String [] args){
		File f = new File("PlayTest.java");//파일을 객체화
		File f4 = new File("폴더"+File.separator+"FruitTest.java");//상대경로
		//상대경로: 파일의 경로를 일부분만 작성 e.g.) PlayTest.java
		//절대경로: 파일의 경로를 모두 작성, e.g.) C:\Users\Win7\Desktop\COMP217\week14\PlayTest.java
		File f3 = new File("C:\\Users\\Win7\\Desktop\\COMP217\\week14");
		
		File f2 = new File("a.java");//파일을 객체화
		System.out.println(f.exists());//true
		System.out.println(f2.exists());//false
		System.out.println(f.length()+"B");//파일의 크기
		System.out.println(f.getName());//f 파일의 이름을 반환
		System.out.println(f.getAbsolutePath());//f 파일의 절대경로를 반환
		System.out.println(new java.util.Date(f.lastModified()));//f 파일의 최종수정일을 반환
	}
}




