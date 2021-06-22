package javaPrograming.finalExam.week10;

public class DogExample {

	public static void main(String[] args) {
		Dog dog = new Dog();

		dog.setName("은이");
		System.out.println("개 이름 : " + dog.getName());

		System.out.println("허기 : " + dog.getHunger());
		dog.eat(4);
		dog.eat(8);
		dog.play();

	}
}
