package javaPrograming.finalExam.week13;

import javaPrograming.finalExam.week13_1.*;

/*
��� �ʵ��� ���������ڴ� ���ǻ� default�� �� ��. 

Animal Ŭ���� 
 - �ʵ�: age
 - �޼ҵ�: eat()->�Խ��ϴ�. 
 
Person Ŭ���� 
 - �ʵ�: age, name
 - �޼ҵ�: eat(), walk()->�Ƚ��ϴ�. 

Student Ŭ����
 - �ʵ�: age, name, grade
 - �޼ҵ�: eat(), walk(), study() ->�����մϴ�. 
 
 HighSchoolStudent Ŭ����
 - �ʵ�: age, name, grade, classroom
 - �޼ҵ�: eat(), walk() -> ���� �ð��� ����� , study() ->�����մϴ�. mealService() ->�޽��� �Խ��ϴ�.

*/
class Animal{
	int age;
	Animal(){}
	
	void eat(){
		System.out.println("�Խ��ϴ�.");
	}
	public String toString() {
		return String.format("%s",this.getClass().getName());
	}
}
class Person extends Animal{
	String name;
	Person(){}
	void walk(){
		System.out.println("�Ƚ��ϴ�.");
	}
}
class Student extends Person{
	int grade;
	Student(){}
	void study(){
		System.out.println("�����մϴ�. ");
	}
}
class HighSchoolStudent extends Student{
	int classroom;
	HighSchoolStudent(){}
	void mealService(){
		System.out.println("�޽��� �Խ��ϴ�. ");
	}
	void walk(){
		System.out.println("���� �ð��� ���� �����. ");
	}
}
class AnimalTest{
	public static void main(String [] args){
		Object s1 = new Student();
		Animal s2 = new Student();
		Person s3 = new Student();
		Student s4 = new Student();
		//HighSchoolStudent s5 = new Student(); // ��ʦ��
		Student s6 = new HighSchoolStudent(); // ����
		Animal s7 = new HighSchoolStudent();
		s7.eat();
		((Person)s7).walk();
		((Student)s7).study();
		
		//�������ε�(dynamic binding) : �޼ҵ� ����ÿ� �޼ҵ尡 ��ü ��ü�� ���յǴ� ��.
		//�������ε�(static binding) : �����Ͻÿ� ����� �ڷ����� ���յǴ� ��.
		
		
		
	}
}