package javaPrograming.weekE;

/*
1. Animal a = new Dog();//가능
Dog d = new Animal();//불가능
2. 참조변수 instanceof 클래스명
a instanceof Dog: a가 Dog냐?
//컴파일 불가, 컴파일 가능(true, false)
3. 
4. Object 타입
*/
class Fruit{
	void print(){
		System.out.println("나는 "+this.getClass().getName());
	}
}
class Grape extends Fruit{
	/*void print(){
		super.print();
		System.out.println("포도");
	}
	*/
}
class Apple extends Fruit{
	
	/*void print(){
		super.print();
		System.out.println("사과");
	}
	*/
}
class Pear extends Fruit{/*
	void print(){
		super.print();
		System.out.println("배");
	}*/
}
class FruitTest{
	public static void main(String [] args){
		Fruit [] f = {new Grape(), new Apple(), new Pear()};
		for(Fruit fr:f) fr.print();
	}
}





