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
		System.out.printf("나는 %s이고,",this.getClass().getName());
	}
}
class Cat extends Animal{
	public void move(){
		super.move();
		System.out.println("달립니다.");
	}
}
class Dolphin extends Animal{
	public void move(){
		super.move();
		System.out.println("수영합니다.");
	}
}
class Dove extends Animal{
	public void move(){
		super.move();
		System.out.printf("날아다닙니다.");
	}
}
