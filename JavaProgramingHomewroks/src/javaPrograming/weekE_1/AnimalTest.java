package javaPrograming.weekE_1;

public class AnimalTest{
	public static void main (String [] args) throws Exception{
		Animal[] animals ={new Cat(), new Dolphin(), new Dove()};
		for(Animal a : animals){
			a.move();
		}
	}
}
class Animal{
	public void move(){
		System.out.printf("���� %s�̰�,",this.getClass().getName());
	}
}
class Cat extends Animal{
	public void move(){
		super.move();
		System.out.println("�޸��ϴ�.");
	}
}
class Dolphin extends Animal{
	public void move(){
		super.move();
		System.out.println("�����մϴ�.");
	}
}
class Dove extends Animal{
	public void move(){
		super.move();
		System.out.printf("���ƴٴմϴ�.");
	}
}
