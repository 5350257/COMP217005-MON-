package javaPrograming.finalExam.week13_1;

public class InstanceOfTest {
	public static void main(String[] args) {
		Cat c = new Cat();
		Animal a = new Cat();
		
		System.out.println(c instanceof Animal);
		System.out.println(c instanceof Cat);
//		System.out.println(c instanceof Dog);
		
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Cat);
		System.out.println(a instanceof Dog);
		
	}
}
class Animal{
	
}
class Cat extends Animal{
	
}
class Dog extends Animal{
	
}
