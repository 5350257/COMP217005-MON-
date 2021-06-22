package javaPrograming.weekE_1;

import java.util.*;
import java.io.*;

class Student{
	String name;
	int grade;
	double score;
	
	Student(){
		
	}
	Student(String name, int grade, double score){
		this.name = name;
		this.grade = grade;
		this.score=score;
	}
	public String toString(){
		return String.format("이름 : %s, 학년: %d, 학점: %.2f",this.name,this.grade,this.score);
	}
}
public class StudentTest{
	public static void main (String [] args)throws Exception{
		Student students [] = new Student[3];
		File f = new File("학생정보.java");
		
		if(f.exists()==false){
			System.out.printf("\"%s\" 파일이 존재하지 않습니다. 확인해주세요.\n", f.getName());
			return;
		}
		Scanner sc = new Scanner(f);
		int i =0;
		
		while(sc.hasNext()){
			students[i]= new Student(sc.next(), sc.nextInt(), sc.nextDouble());
			i++;
		}
		sc.close();
		
		for(Student x:students){
			System.out.println(x);
		}
	}
}