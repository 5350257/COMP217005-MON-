package javaPrograming.finalExam.week13;

/*
나 클래스
 - eat(): 매개변수로 받은 음식을 먹는 메소드
  * eat(new Hamburger): Hamburger가 맛있네요. 
  * eat(new IceCream): IceCream가 맛있네요. 



햄버거 클래스
아이스크림 클래스
피자 클래스 
빙수 클래스

테스트 클래스
 - 내가 햄버거, 아이스크림, 피자, 빙수 먹는 것을 시뮬레이션
  
*추가 클래스 작성 가능






*/
class EatTest{
	public static void main(String [] args){
		I i = new I();
		Hamburger hamburger = new Hamburger();
		i.eat(hamburger);
		i.eat(new IceCream());
		i.eat(new Pizza());
		i.eat(new Bingsu());
		i.eat(new Bibimbab());
		i.eat(new Stone());
	}	
}
//상속(다형성)의 장점 1: 메소드의 매개변수를 부모클래스 타입으로두면 자식클래스 객체는 모두 인자로 받을 수 있다. 
class Stone{}
class I{
	void eat(Object o){//Object o= new Stone();
		//o가 음식이라면 먹고 아니라면 음식이 아닌건 안먹어요~를 출력하도록 작성
		if(o instanceof Food)
			System.out.printf("%s를 먹습니다. \n", o.getClass().getName());
		else
			System.out.printf("%s는 음식이 아니라 먹지 않습니다.\n", o.getClass().getName());
	}
	/*
	void eat(Hamburger hamburger){
		System.out.println("햄버거를 먹습니다. ");
	}
	void eat(IceCream iceCream){
		System.out.println("아이스크림을 먹습니다. ");
	}
	void eat(Pizza pizza){
		System.out.println("pizza를 먹습니다. ");
	}
	void eat(Bingsu bingsu){
		System.out.println("bingsu를 먹습니다. ");
	}
	void eat(Bibimbab bibimbab){
		System.out.println("bibimbab를 먹습니다. ");
	}
	*/
}
class Food{}
class Hamburger extends Food{}
class IceCream extends Food{}
class Pizza extends Food{}
class Bingsu extends Food{}
class Bibimbab extends Food{}






