package javaPrograming.finalExam.week10;

public class DogExample {

	public static void main(String[] args) {
		Dog dog = new Dog();

		dog.setName("����");
		System.out.println("�� �̸� : " + dog.getName());

		System.out.println("��� : " + dog.getHunger());
		dog.eat(4);
		dog.eat(8);
		dog.play();

	}
}
