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
		System.out.println("���� ����");
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
		System.out.println("��� ����");
	}
}//Student Ŭ�������� ��� �ʵ带 �ʱ�ȭ�ϴ� ������
class Student extends Person{
	private int grade;
	Student(){
		//�ڽ� Ŭ������ �����ڿ��� ��������� �ٸ� � �����ڵ� ȣ������ �ʴ´ٸ� �ڵ����� �θ� Ŭ������ ����Ʈ �����ڸ� ȣ���Ѵ�. 
		System.out.println("�л� ����");
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
		//�л� �� �� ����
		Student s1 = new Student();
		System.out.println(s1.getClass().getName());
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		Animal a1 = new Animal();
		System.out.println(a1.getClass().getName());
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		Person p1 = new Person();
		System.out.println(p1.getClass().getName());
	}
}







