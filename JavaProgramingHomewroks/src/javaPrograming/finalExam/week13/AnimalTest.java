package javaPrograming.finalExam.week13;

import javaPrograming.finalExam.week13_1.*;

/*
모든 필드의 접근지시자는 편의상 default로 둘 것. 

Animal 클래스 
 - 필드: age
 - 메소드: eat()->먹습니다. 
 
Person 클래스 
 - 필드: age, name
 - 메소드: eat(), walk()->걷습니다. 

Student 클래스
 - 필드: age, name, grade
 - 메소드: eat(), walk(), study() ->공부합니다. 
 
 HighSchoolStudent 클래스
 - 필드: age, name, grade, classroom
 - 메소드: eat(), walk() -> 걸을 시간이 없어요 , study() ->공부합니다. mealService() ->급식을 먹습니다.

*/
class Animal{
	int age;
	Animal(){}
	
	void eat(){
		System.out.println("먹습니다.");
	}
	public String toString() {
		return String.format("%s",this.getClass().getName());
	}
}
class Person extends Animal{
	String name;
	Person(){}
	void walk(){
		System.out.println("걷습니다.");
	}
}
class Student extends Person{
	int grade;
	Student(){}
	void study(){
		System.out.println("공부합니다. ");
	}
}
class HighSchoolStudent extends Student{
	int classroom;
	HighSchoolStudent(){}
	void mealService(){
		System.out.println("급식을 먹습니다. ");
	}
	void walk(){
		System.out.println("걸을 시간이 많이 없어요. ");
	}
}
class AnimalTest{
	public static void main(String [] args){
		Object s1 = new Student();
		Animal s2 = new Student();
		Person s3 = new Student();
		Student s4 = new Student();
		//HighSchoolStudent s5 = new Student(); // 不可能
		Student s6 = new HighSchoolStudent(); // 가능
		Animal s7 = new HighSchoolStudent();
		s7.eat();
		((Person)s7).walk();
		((Student)s7).study();
		
		//동적바인딩(dynamic binding) : 메소드 실행시에 메소드가 실체 객체랑 결합되는 것.
		//정적바인딩(static binding) : 컴파일시에 멤버와 자료형이 결합되는 것.
		
		
		
	}
}