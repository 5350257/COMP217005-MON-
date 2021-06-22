package javaPrograming.weekD;


public class Calculator {
	static int sum(int x, int y) {
		return x + y;

	}

	int sum1(int x, int y) {
		return x + y;
	}

	double sum2(int x, int y) {
		return x + y;
	}

	int sum(double x, double y) {
		return (int) (x + y);
	}
	// method Overloading = method의 이름이 같고 매개변수의 1.타입이 다르거나,2.매개변수의 수가 달라야 한다. 다른건
	// 무관
}

class Pet {
	static String name;

	Pet(String name) {
		this.name = name;
	}

	static double x =1;
	public static void main(String[] args) {
		System.out.println(name);
		// main method는 static method이므로 인스턴스 필드를 그냥 사용할 수 없다. 객체를 생성하든,
		// 필드를 static 필드로 바꾸든지 해야한다.
		System.out.println(x);
	}

}

class Dog extends Pet {

	Dog(String name) {
		super(name); // 부모 클래스의 생성자가 명시된 생성자일 경우 자식 클래스의 생성자도 작성해줘야한다.
	}

}