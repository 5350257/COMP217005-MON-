package javaPrograming.finalExam.week12;

class Animal{
	private int age;
	Animal(int age){
		if(age>=0 && age<=200)
			this.age = age;
		else 
			this.age = 5;
	}
	Animal(){
		System.out.println("동물 생성");
	}
}
class Person extends Animal{
	private String name;
	Person(int age, String name){
		super(age);//this.age = age;
		this.name = name;
	}
	Person(){
	//	super();
		System.out.println("사람 생성");
	}
}//Student 클래스에서 모든 필드를 초기화하는 생성자
class Student extends Person{
	private int grade;
	Student(){
		//자식 클래스의 생성자에서 명시적으로 다른 어떤 생성자도 호출하지 않는다면 자동으로 부모 클래스의 디폴트 생성자를 호출한다. 
		System.out.println("학생 생성");
	}	
	Student(int age, String name, int grade){
		super(age, name);
		/*
		this.age = age;
		this.name = name;
		*/
		this.grade = grade;
	}
	public static void main(String [] args){
		//학생 한 명 생성
		Student s1 = new Student();
		System.out.println(s1.getClass().getName());
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		Animal a1 = new Animal();
		System.out.println(a1.getClass().getName());
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		Person p1 = new Person();
		System.out.println(p1.getClass().getName());
	}
}







