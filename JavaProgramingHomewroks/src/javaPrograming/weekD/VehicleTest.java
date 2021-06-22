package javaPrograming.weekD;

class Vehicle {
	private int numOfWheels;
	private static int numOfVehicles;

	Vehicle() {
		this(4);
	}

	Vehicle(int numOfWheels) {
		this.numOfWheels = numOfWheels;
		numOfVehicles++;
	}

	void goStraight(double dist) {
		System.out.printf("%.2fm 직진합니다.\n", dist);
	}

	int getNumOfWheels() {
		return numOfWheels;
	}

	static int getNumOfVehicles() {
		return numOfVehicles;
	}
}

class Car extends Vehicle {
	String brand;

	Car(int numOfWheels, String brand) {
		super(numOfWheels);
		this.brand = brand;
	}

	@Override
	void goStraight(double dist) {
		System.out.printf("바퀴가 %d개인 %s의 자동차가 ", getNumOfWheels(), brand);
		super.goStraight(dist);
	}

	public boolean equals(Object o) {// 호출: myCar.equals(Stone)
		// 바퀴수와 브랜드가 같다면 같은 자동차로 간주하도록 재정의
		if (o instanceof Car) {// o가 자동차라면
			if (this.getNumOfWheels() == ((Vehicle) o).getNumOfWheels() && this.brand.equals(((Car) o).brand)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
/*
 * 객체명 instanceof 클래스명
 * 
 * 
 */

class Bike extends Vehicle {
	Bike(int numOfWheels) {
		super(numOfWheels);
	}

	@Override
	void goStraight(double dist) {
		System.out.printf("바퀴가 %d개인 자전거가 ", getNumOfWheels());
		super.goStraight(dist);
	}
}

class Rock {
}

class VehicleTest {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Bike b1 = new Bike(2);
		Bike b2 = new Bike(3);
		Bike b3 = new Bike(4);
		Car myCar = new Car(4, "현대자동차");
		Car yourCar = new Car(4, "기아자동차");
		System.out.println(myCar.equals(yourCar));
		System.out.println(myCar.equals(new Rock()));

		Vehicle c1 = new Car(4, "현대자동차");// 업캐스팅
		Object c2 = new Car(6, "기아자동차");// 업캐스팅
		// 업캐스팅은 상속관계가 존재하면 가능
		// 업캐스팅의 한계
		/*
		 * System.out.println(c1.brand);//컴파일 불가 c2.goStraight(30);//컴파일 불가
		 */
		System.out.println(((Car) c1).brand);// 다운 캐스팅
		((Vehicle) c2).goStraight(30);// 다운 캐스팅
		((Car) c2).goStraight(30);// 다운 캐스팅
		Car c3 = new Car(8, "쌍용자동차");
		// 다형성: 하나의 객체를 여러 타입으로 참조할 수 있는 성질: 업캐스팅, 다운캐스팅

		System.out.println("이제까지 생성된 탈 것 개수: " + Vehicle.getNumOfVehicles());
		c1.goStraight(30);
		b1.goStraight(30);

	}
}
