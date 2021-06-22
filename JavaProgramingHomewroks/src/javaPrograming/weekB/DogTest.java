package javaPrograming.weekB;

class Dog{
	/*생성자: 객체 생성시에만 호출되는 특별한 메소드
		1. 객체 생성시에만 호출
		2. 반환타입이 없음
		3. 클래스 이름과 일치 
	*/
	Dog(){//디폴트 생성자: 매개변수가 없는 생성자
		this("개똥이", 2);
	/*
		name = "개똥이";
		full = 2;
		*/
	}
	Dog(String name, int full){//매개변수가 이름과 포만감인 생성자
		this.name = name;
		this.full = full;
	}
	
	//필드: 이름, 포만감
	private String name;
	private int full;
	//메소드: eat(먹이: int), eat(음식)
	void eat(String food) throws Exception{
		
		for(int i=1; i<=10; i++){
			System.out.print(i+" ");
			Thread.sleep(300);
		}
		System.out.println();
		System.out.println(food+"를 잘먹었습니다. ");
		full += 3;
	}
	void eat(int food){
		full += food;
		System.out.println("잘먹었습니다. ");
	}
	// eat() 메소드를 중복 정의했다. 
	
	public int getFull(){
		return full;
	}
	//toString()메소드 구현: 객체의 모든 정보를 문자열로 반환
	public String toString(){
		return String.format("이 강아지의 이름은 %s이고, 포만감은 %d입니다.", name, full);
		//"이 강아지의 이름은 "+name+"이고, 포만감은 "+full+"입니다.";
	}
}
class DogTest{
	public static void main(String [] args) throws Exception{
	//1.강아지 한마리 만든 후 포만감 출력
		Dog myDog = new Dog();
		System.out.println(myDog.toString());
		System.out.println(myDog);//객체를 출력해라 라고 하면 자동으로 toString()호출하고 그 결과 출력
		//포만감이 10인 흰둥이
		Dog myDog2 = new Dog("흰둥이", 10);
		//포만감이 0인 뽀삐
		Dog myDog3 = new Dog("뽀삐", 0);
		System.out.println(myDog2);
		System.out.println(myDog3);
		
		
		System.out.println(myDog.getFull());
	//2.먹이 5만큼 주고 포만감 출력
		myDog.eat(5);
		System.out.println(myDog.getFull());	
		myDog.eat("피자");
		System.out.println(myDog.getFull());	


		
	}
}